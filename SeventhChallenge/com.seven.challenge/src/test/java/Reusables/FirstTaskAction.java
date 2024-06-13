package Reusables;

import org.testng.annotations.Test;


import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.FirstTask;

public class FirstTaskAction extends FirstTask {

	public FirstTaskAction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Test
	public void test() {

		Actions actions = new Actions(driver);

		actions.click(performOperation).perform();
		Assert.assertTrue(isActionPerformed("Click"));

		actions.doubleClick(performOperation).perform();
		Assert.assertTrue(isActionPerformed("Double-Click"));

		actions.contextClick(performOperation).perform();
		Assert.assertTrue(isActionPerformed("Right-Click"));

		actions.moveToElement(chooseLanguage).perform();

		waitUntilElementClickable(javaLanguage);
		javaLanguage.click();

		waitUntilElementClickable(languageText);
		String actual = languageText.getText();
		String expect = "Java";
		Assert.assertEquals(actual, expect);

		actions.dragAndDrop(dragSource, dragTarget).perform();

		String expectedMessage = "Drop is successful!";
		String actualMessage = successMessage.getText();
		Assert.assertEquals(expectedMessage, actualMessage);

	}

	private boolean isActionPerformed(String action) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#click_type"))); // Replace
																														// with
																														// actual
																														// result
																														// element
																														// locator

		return result.getText().contains(action);
	}

}
