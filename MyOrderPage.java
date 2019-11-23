package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyOrderPage extends PageBase {

	public MyOrderPage(WebDriver driver) {
		super(driver);
		jse =(JavascriptExecutor) driver;
	}
	@FindBy(linkText = "Proceed to checkout")
	WebElement checkout;


 public void proccedtocheckout()
 {
	 Scrolltobottom();
	 clickbtn(checkout);
 }}
