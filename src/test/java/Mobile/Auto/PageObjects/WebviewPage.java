package Mobile.Auto.PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WebviewPage {

	
	
	AndroidDriver driver;
	WebDriverWait wait;
	
	
	public WebviewPage()
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=‘Web View Interaction’]")
	public WebElement webviewtitle;
	
	
	@AndroidFindBy(xpath="//android.view.View[@text=‘Hello,can you please tell me your name?’]")
	public WebElement Hellotextelement;
	
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text=‘Enter your name here!’]")
	public WebElement enternamefield;
	
	@AndroidFindBy(xpath="//android.widget.Spinner[@index=“2’]")
	public WebElement preferredcarbtn;
	
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text=‘Mercedes’]")
	public WebElement choosecar;
	

	@AndroidFindBy(xpath="//android.widget.Button[@text=‘Send me your name!’]")
	public WebElement sendmenamebtn;
	
	
	
	
	public String getwebviewtitle()
	{
		return webviewtitle.getText();
		
	}
	
	
	
	
	public String gethellotxt()
	{
		return Hellotextelement.getText();
		
	}
	
	public void entername(String name)
	{
		
		enternamefield.sendKeys(name);
		
	}
	
	public void selectcar(String car)
	{
		
		preferredcarbtn.click();
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.CheckedTextView[@text=‘"+car+"’]")));
		
		
		
	}
	
	public String getpreferredcar() {
		
		return preferredcarbtn.getText();
		
	}
	
	
	public void clicksendname()
	{
		sendmenamebtn.click();	
	
	}
	

}
