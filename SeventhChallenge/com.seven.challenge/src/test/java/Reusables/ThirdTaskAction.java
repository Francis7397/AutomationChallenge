package Reusables;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


import PageObjects.ThirdTask;

public class ThirdTaskAction extends ThirdTask {

	public ThirdTaskAction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void ThirdTask() throws Exception {

		// Use JavaScriptExecutor to execute JavaScript and get computed styles
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		String content = (String) jsExecutor.executeScript(
				"return window.getComputedStyle(arguments[0], '::after').getPropertyValue('content');", rating);

		String textWithoutQuotes = content.replaceAll("\"", "");

		
		System.out.println(textWithoutQuotes);
	

		waitUntilElementClickable(testField);
		testField.sendKeys(textWithoutQuotes);

		waitUntilElementClickable(checkRating);
		checkRating.click();
		

		String ActualText = validateRating.getText();
		System.out.println(ActualText);
		String ExpectedText = "Well done!";
		Assert.assertEquals(ActualText, ExpectedText);
	}

}
