package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.AddressPage;
import pages.ConfirmationPage;
import pages.HomePage;
import pages.MyAccount;
import pages.MyOrderPage;
import pages.PaymentPage;
import pages.ShippingPage;
import pages.SignInPage;

public class AddProductToCartTest  extends TestBase{
	HomePage home;
	MyOrderPage myorder;
	AddressPage addres;
	ShippingPage shiping;
	SignInPage signin;
	MyAccount myacc;
	PaymentPage payment;
	ConfirmationPage confirm;
	String orderdcompelted= "Order confirmation";
	Faker  fakerData = new Faker();
	 String emailfake= fakerData.internet().emailAddress();
	 String firstname = fakerData.name().firstName();
	    String lastname = fakerData.name().lastName();
	    String password = fakerData.number().digits(5).toString();
	    String address = fakerData.address().streetAddress();
	    String city = fakerData.address().city();
	    String postal = fakerData.number().digits(5).toString();
	    String mobile = fakerData.number().digits(10).toString();
	    String secaddress = fakerData.address().streetAddress();
	    
	    
	    
	@Test (priority = 1)
	public void signintest() throws InterruptedException
	{
		home= new HomePage(driver);
		home.openloginpage();
		Thread.sleep(2000);
		
	}
	
	@Test (priority = 2)
	public void sucessfullregister() 
	{
		signin=new SignInPage(driver);
		signin.registernewuser(emailfake,firstname,lastname,password,address,city,postal,mobile,secaddress);
		Assert.assertTrue(signin.sucessregister.getText().
				contains("Welcome to your account. Here you can manage all of your personal information and orders"));
		myacc =new MyAccount(driver);
		myacc.Gotohome();
		
	}
	

	@Test (priority = 3)
	public void usercanaddtproducttocart() throws InterruptedException {
		home= new HomePage (driver);
		home.selectproduct();



	} 
	@Test (priority = 4)
	public void usercheckoutproduct() throws InterruptedException
	{
		home.usercheckoutproducts();
		WebDriverWait waiting= new WebDriverWait(driver, 60);
		waiting.until(ExpectedConditions.titleContains("Order - My Store"));
	
		
	

	}
	@Test (priority = 5)
	public void ordercheckout() {

		myorder=new MyOrderPage(driver);
		myorder.proccedtocheckout();
				

	}
	@Test (priority = 6)
	public void addrescheckout() {

		addres=new AddressPage(driver);
				addres.addresscheckout();
	}
	
	@Test (priority = 7)
	public void shipcheckout() {

		shiping=new ShippingPage(driver);
				shiping.shipcheckout();
	}
	
	@Test (priority = 8)
	public void choosepayment() {

		payment=new PaymentPage(driver);
				payment.choosepaymentoption();
	}
	
	@Test (priority = 9)
	public void confirmorder() {

		confirm=new ConfirmationPage(driver);
				confirm.confirmmethod();
	}



}
