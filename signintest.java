package tests;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
import pages.HomePage;
import pages.MyAccount;
import pages.SignInPage;


public class signintest  extends TestBase{
	
	HomePage home;
	SignInPage signin;
	MyAccount myacc;
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
	}
	
	
	@Test (priority = 3)
	public void registerdusersignout() throws InterruptedException
	{
		myacc =new MyAccount(driver);
		myacc.signout();
		Thread.sleep(6000);
	}
	@Test (priority = 6)
	public void registerdusersignin() throws InterruptedException
	{
		signin =new SignInPage(driver);
		signin.signin(emailfake, password);
		Thread.sleep(2000);
		myacc =new MyAccount(driver);
		myacc.Gotohome();
		Thread.sleep(2000);
		
	
	
		
	}
	
	@Test (priority = 5 , enabled = false)
	public void signinusersignout() throws InterruptedException
	{
		myacc =new MyAccount(driver);
		myacc.signout();
		Thread.sleep(2000);
	}
		
	@Test (priority = 7 )
	public void usercanaddtproducttocart() throws InterruptedException
	{
		home= new HomePage (driver);
		home.selectproduct();
		Thread.sleep(2000);
	
	
	}
}
