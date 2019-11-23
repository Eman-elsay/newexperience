package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPage extends PageBase{

	public ShippingPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id = "cgv")
	WebElement agreecheck;

	@FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
	WebElement checkoutshipping;

	
 public void shipcheckout()
 {
	 clickbtn(agreecheck);
	 clickbtn(checkoutshipping);
 }}


