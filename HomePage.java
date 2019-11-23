package pages;



import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	
	public HomePage(WebDriver driver) {
		super(driver);
		action = new Actions(driver);
		jse =(JavascriptExecutor) driver;
		
	}

	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement loginlink;
	
	@FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img")
	WebElement product;
	
	@FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span")
	WebElement addtocartbtn;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	WebElement processedtocheckoutbtn;
	
	
	public void openloginpage() {
		
		loginlink.click();

	}
	
	public void selectproduct() throws InterruptedException {
		
		 action.moveToElement(product)
		  .moveToElement(addtocartbtn)
		 .click()
		 .build()
		 .perform();
			}
	public void usercheckoutproducts()
	{
		clickbtn(processedtocheckoutbtn);
		
	}
	
	}
			
	
	
		 
		 

	
	
	
	

	
	
	 
