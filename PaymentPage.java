package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends PageBase {

	public PaymentPage(WebDriver driver) {
		super(driver);
		
	}
	

	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	WebElement paymentoption;

	
 public void choosepaymentoption()
 {
	 clickbtn(paymentoption);
	 
 }}


