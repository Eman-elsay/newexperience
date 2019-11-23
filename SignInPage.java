package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignInPage extends PageBase {

	public SignInPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id = "email_create")
	WebElement emailtxtbox;
	 @FindBy(id = "SubmitCreate")
	 WebElement createanaccountbtn;
	 @FindBy(xpath = "//*[@id=\"account-creation_form\"]/div[1]/h3")
	 public  WebElement personalinfo;
	 @FindBy(id = "id_gender2")
	 WebElement gender;
	 @FindBy(id = "customer_firstname")
	 WebElement fnametxt;
	 @FindBy(id = "customer_lastname")
	 WebElement lnametxt;
	 @FindBy(id = "passwd")
	 WebElement passwordtxt;
	 @FindBy(id = "address1")
	 WebElement addresstxt; 
	 @FindBy(id = "city")
	 WebElement citytxt;
	 @FindBy(id = "id_state")
	 WebElement state;
	 @FindBy(id = "postcode")
	 WebElement zipcodetxt;
	 @FindBy(id = "id_country")
	 WebElement country;
	 @FindBy(id = "phone_mobile")
	 WebElement mobiletxt;
	 @FindBy(id = "alias")
	 WebElement anotheraddresstxt;
	 
	 @FindBy(id = "submitAccount")
	 WebElement registerbtn;
	 
	 @FindBy(xpath ="//*[@id=\"center_column\"]/p" )
	 public  WebElement sucessregister;
	 
	 @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a" )
	 public  WebElement signoutlink;
	 
	 @FindBy(id = "email")
	 WebElement emailaddresstxt;
	 @FindBy(id = "passwd")
	 WebElement passwo;
	 
	 @FindBy(id = "SubmitLogin")
	 WebElement signinbtn;
	 
	
	 
	 public void registernewuser(String email ,String firstname, String lastname,
			 String pasword, String address ,String city ,String postalcode , 
			 String mobilenumber ,String secondaddress) {
		 
		settxtelmenttxt(emailtxtbox, email);
		clickbtn(createanaccountbtn);
		clickbtn(gender);
		settxtelmenttxt(fnametxt, firstname);
		settxtelmenttxt(lnametxt, lastname);
		settxtelmenttxt(passwordtxt, pasword);
		settxtelmenttxt(addresstxt, address);
		settxtelmenttxt(citytxt, city);
		selectdropdownlist(state, "Alabama");
		settxtelmenttxt(zipcodetxt, postalcode);
		selectdropdownlist(country, "United States");
		settxtelmenttxt(mobiletxt, mobilenumber);
		settxtelmenttxt(anotheraddresstxt, secondaddress);
		clickbtn(registerbtn);
		
	}
	 
	
	 
	 public void signin( String email,String password)
	 {
		 settxtelmenttxt(emailaddresstxt, email);
		 settxtelmenttxt(passwo, password);
		 clickbtn(signinbtn);
	 }
	
	

}
