package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.BaseTestThree;

public class ThirdTask extends BaseTestThree{
	
	
	public ThirdTask(WebDriver driver) {
		this.driver = driver;

	}
	
	@FindBy(css = "label.star-rating")
	public WebElement rating;
	
	@FindBy(css = "#txt_rating")
	public WebElement testField;
	
	@FindBy(css = "#check_rating")
	public WebElement checkRating;
	
	@FindBy(css = "#validate_rating")
	public WebElement validateRating;

}
