package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import Utilities.BaseTest;

public class FirstTask extends BaseTest{
	
	public FirstTask(WebDriver driver) {
		this.driver = driver;

	}
	
	@FindBy(css = "#click_area")
	public WebElement performOperation;
	
	@FindBy(css = "#click_type")
	public WebElement clickText;
	
	@FindBy(css = ".dropbtn")
	public WebElement chooseLanguage;
	
	@FindBy(css = "#dd_java")
	public WebElement javaLanguage;
	
	@FindBy(css = "#hover_validate")
	public WebElement languageText;
	
	@FindBy(id = "drag_source")
	public WebElement dragSource;
	
	@FindBy(id = "drop_target")
	public WebElement dragTarget;
	
	@FindBy(css = "div[id='drop_target'] h3")
	public WebElement successMessage;


}
