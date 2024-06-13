package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.BaseTestSecond;

public class SecondTask extends BaseTestSecond{
	
	public SecondTask(WebDriver driver) {
		this.driver = driver;

	}
	
	@FindBy(css = ".embed-responsive-item.shadow")
	public WebElement frameOne;
	
	@FindBy(css = "#frame2")
	public WebElement frameTwo;
	
	
	@FindBy(css = "#frame3")
	public WebElement frameThree;
	
	@FindBy(css = "#frame4")
	public WebElement frameFour;
	
	@FindBy(css = "#click_me_1")
	public WebElement clickMeOneButton;
	
	@FindBy(css = "#click_me_2")
	public WebElement clickMeTwoButton;
	
	@FindBy(css = "#click_me_4")
	public WebElement clickMeThirdButton;
	
	
	

}
