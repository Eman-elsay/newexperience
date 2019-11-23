package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage  extends PageBase {

	public AddressPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
	WebElement checkoutaddress;


 public void addresscheckout()
 {
	 clickbtn(checkoutaddress);
 }}

