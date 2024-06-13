package Utilities;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import Reusables.SecondTaskAction;

public class BaseTestSecond {
	
	
	public SecondTaskAction testtwo;

	protected WebDriver driver;

	@BeforeMethod
	public void baseTest() {

		driver = new ChromeDriver();

		driver.get("https://play1.automationcamp.ir/frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		testtwo = PageFactory.initElements(driver, SecondTaskAction.class);

	}

	@AfterMethod
	public void close() {

		driver.close();
		driver.quit();

	}

	public void waitUntilElementClickable(WebElement element) {
		{
			FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
			fluentWait.until(ExpectedConditions.elementToBeClickable(element));
		}
	}

	public void waitForPageLoad() {
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				System.out.println("Current Window State       : "
						+ String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState")));
				return String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
						.equals("complete");
			}
		});
	}

}



