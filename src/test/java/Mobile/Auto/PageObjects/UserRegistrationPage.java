package Mobile.Auto.PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class UserRegistrationPage {
	

	
	
	AndroidDriver driver;
	
	
	
	public UserRegistrationPage()
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=‘Welcome to register a new User’]")
	public WebElement userregistertitle;
	
	
	@AndroidFindBy(xpath="//android.widget.EditText[index=2]")
	public WebElement usernamefield;
	
	
	@AndroidFindBy(xpath="//android.widget.EditText[@index=“4”]")
	public WebElement emailfield;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@index=“6”]")
	public WebElement passwordfield;
	
	
	@AndroidFindBy(xpath="//android.widget.EditText[@index=“8”]")
	public WebElement namesection;
	

	@AndroidFindBy(xpath="//android.widget.TextView[@index=“0”]")
	public WebElement programlang;
	
	
	@AndroidFindBy(xpath="//android.widget.CheckBox[@index=“12”]")
	public WebElement Iacceptads;
	
	@AndroidFindBy(xpath="//android.widget.Button[@index=“13”]")
	public WebElement registeruserbtn;
	
	public String checkuserregistertitle()
	{
		return userregistertitle.getText();
		
	}
	
	
	
	
	public void verifyallelements()
	{
		userregistertitle.isEnabled();
		usernamefield.isEnabled();
		emailfield.isEnabled();
		passwordfield.isEnabled();
		namesection.isEnabled();
		programlang.isEnabled();
		Iacceptads.isEnabled();
		registeruserbtn.isEnabled();
	}
	
	public String checknamesection()
	{
		
		return namesection.getText();
		
	}
	
	public String checklanguage()
	{
		
		return programlang.getText();
		
		
	}
	
	
	public void filldetails(String username, String email,String password,String newname,String prognewlang )
	{
		usernamefield.sendKeys(username);
		emailfield.sendKeys(email);
		passwordfield.sendKeys(password);
		namesection.sendKeys(newname);
		programlang.click();
		driver.findElement(AppiumBy.xpath("//android.widget.CheckedtextView[@text=‘"+prognewlang+"’]"));
		
		
	}

	
	public void clickacceptads()
	{
		Iacceptads.click();
	}
	
	public void clickregisteruserbtn()
	{
		registeruserbtn.click();
	}
}
