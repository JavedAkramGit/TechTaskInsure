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

public class VerifyWebViewpage {
	
	
	AndroidDriver driver;

	
	
	public VerifyWebViewpage()
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	@AndroidFindBy(xpath="//android.view.View[@index=“3”];")
	public WebElement nametext;
	
	
	@AndroidFindBy(xpath="//android.view.View[@index=“5”]")
	public WebElement cartext;
	
	
	@AndroidFindBy(xpath="//android.view.View[@index=“9”]")
	public WebElement clickhere;
	
	
	
	public String getnametext()
	{
		return nametext.getText();
		
	}
	
	public String getcartext()
	{
		return cartext.getText();
		
	}
	
	
	public void  clickherebtnclick()
	{
		clickhere.click();
	}
	

}
