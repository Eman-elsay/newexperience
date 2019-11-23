package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmationPage extends PageBase {

	public ConfirmationPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
	WebElement confirorderbtn;

	
 public void confirmmethod()
 {
	 clickbtn(confirorderbtn);
	 
 }}



