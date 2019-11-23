package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends PageBase {

	public MyAccount(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
	WebElement signoutlink;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/a/span")
	WebElement homebtn;







public void signout() {
	clickbtn(signoutlink);
}

public void Gotohome() {
	clickbtn(homebtn);
}
}
