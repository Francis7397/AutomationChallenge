package Reusables;

import org.testng.annotations.Test;

import org.testng.Assert;


import org.openqa.selenium.WebDriver;

import PageObjects.SecondTask;

public class SecondTaskAction extends SecondTask{

	public SecondTaskAction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void test()
	{
		driver.switchTo().frame(frameOne);
		
		waitUntilElementClickable(clickMeOneButton);
		clickMeOneButton.click();
		String ActualClickText = clickMeOneButton.getText();
		System.out.println(ActualClickText);
		String Expected = "Clicked";
		Assert.assertEquals(ActualClickText, Expected);
		
		
		driver.switchTo().frame(frameTwo);
		
		waitUntilElementClickable(clickMeTwoButton);
		clickMeTwoButton.click();
        String ActualClickTwo = clickMeTwoButton.getText();
		System.out.println(ActualClickTwo);
		String ExpectedTwo = "Clicked";
		Assert.assertEquals(ActualClickTwo, ExpectedTwo);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(frameOne);
		driver.switchTo().frame(frameThree);
		driver.switchTo().frame(frameFour);
		
		waitUntilElementClickable(clickMeThirdButton);
		clickMeThirdButton.click();
        String ActualClickThree = clickMeThirdButton.getText();
		System.out.println(ActualClickThree);
		String ExpectedThree = "Clicked";
		Assert.assertEquals(ActualClickThree, ExpectedThree);
	}
}
