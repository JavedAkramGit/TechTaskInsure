package Mobile.Auto.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class VerifyUserRegistrationPage {
	

	
	
	AndroidDriver driver;
	
	
	
	public VerifyUserRegistrationPage()
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	@AndroidFindBy(id="io.selendroid.testapp:id/label_name_data")
	public WebElement checkname;
	
	
	@AndroidFindBy(id="io.selendroid.testapp:id/label_username_data")
	public WebElement checkusername;
	
	@AndroidFindBy(id="io.selendroid.testapp:id/label_password_data")
	public WebElement checkpassword;
	
	
	@AndroidFindBy(id="io.selendroid.testapp:id/label_email_data")
	public WebElement checkemail;
	
	@AndroidFindBy(id="io.selendroid.testapp:id/label_preferedProgrammingLanguage_data")
	public WebElement checkproglang;
	
	
	@AndroidFindBy(id="io.selendroid.testapp:id/label_preferedProgrammingLanguage_data")
	public WebElement iacceptadsboolean;
	

	@AndroidFindBy(id="io.selendroid.testapp:id/buttonRegisterUser")
	public WebElement checkregisteruserbtn;
	
	
	public String getcheckname()
	{
		return checkname.getText();
		
	}
	
	public String getpassword()
	{
		return checkpassword.getText();
	}
	
	public String getcheckemail()
	{
		return checkemail.getText();
	}
	
	public String getcheckusername()
	{
		return checkusername.getText();
	}
	
	public String getcheckproglang()
	{
		
		return checkproglang.getText();
	}
	
	public String getacceptadsvalue()
	{
		return iacceptadsboolean.getText();
	}
	
	
	public void clickregisteruser()
	{
		checkregisteruserbtn.click();
		
	}
	
	

}
