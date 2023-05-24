package Mobile.Auto.PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.*;

public class Androidhomepage {
	
	
	AndroidDriver driver;
	
	WebDriverWait wait;
	
	public Androidhomepage()
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	@AndroidFindBy(id="android:id/title")
	public WebElement maintitle;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=‘Hello Default Locale, Selendroid-test-app!’]")
	public WebElement subtitle;
	
	
	@AndroidFindBy(id="io.selendroid.testapp:id/buttonTest")
	public WebElement ebutton;
	
	@AndroidFindBy(id="o.selendroid.testapp:id/buttonStartWebview")
	public WebElement googlebtn;
	
	
	@AndroidFindBy(id="io.selendroid.testapp:id/startUserRegistration")
	public WebElement folderbtn;
	

	@AndroidFindBy(id="io.selendroid.testapp:id/my_text_field")
	public WebElement textbox;
	
	@AndroidFindBy(id="io.selendroid.testapp:id/waitingButtonTest")
	public WebElement progressbarbtn;
	
	
	@AndroidFindBy(xpath="//android.widget.CheckBox[@text=‘I accept adds’]")
	public WebElement iacceptadsbtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text=‘Display text view’]")
	public WebElement displaytextviewbtn;
	

	@AndroidFindBy(xpath="//android.widget.Button[@text=‘Displays a Toast’]")
	public WebElement displaytoastbtn;
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text=‘Display Popup Window’]")
	public WebElement displaypopupwindowbtn;
	
	@AndroidFindBy(accessibility="exceptionTestButtonCD")
	public WebElement throwexceptionbtn;
	
	@AndroidFindBy(id="io.selendroid.testapp:id/exceptionTestField")
	public WebElement typetothrowexpnbtn;
	
	@AndroidFindBy(id="o.selendroid.testapp:id/topLevelElementTest")
	public WebElement focuslayoutbtn;
	
	@AndroidFindBy(id="id=android:id/button2")
	public WebElement nonobtn;
	
	
	@AndroidFindBy(id="id=android:id/message")
	public WebElement progressdialog;
	
	
	@AndroidFindBy(xpath="//android.widget.Toast[@index=“1”]")
	public WebElement toasttext;
	
	
	public String getmaintitle()
	{
		return subtitle.getText();
		
	}
	
	
	public void clicknono()
	{
		nonobtn.click();
	}
	
	
	public String getsubtitle()
	{
		return maintitle.getText();
		
	}
	
	public String gettoasttext()
	{
		return toasttext.getText();
		
	}
	public boolean hpdisplayed()
	{
		return maintitle.isDisplayed();
	}
	
	
	public void verifyallelements()
	{
		ebutton.isDisplayed();
		ebutton.isEnabled();
		googlebtn.isEnabled();
		googlebtn.isDisplayed();
		folderbtn.isEnabled();
		folderbtn.isDisplayed();
		textbox.isEnabled();
		textbox.isDisplayed();
		progressbarbtn.isDisplayed();
		progressbarbtn.isEnabled();
		iacceptadsbtn.isEnabled();
		iacceptadsbtn.isDisplayed();
		displaytextviewbtn.isEnabled();
		displaytextviewbtn.isDisplayed();
		displaytoastbtn.isDisplayed();
		displaytoastbtn.isDisplayed();
		displaypopupwindowbtn.isEnabled();
		displaypopupwindowbtn.isDisplayed();
		throwexceptionbtn.isEnabled();
		throwexceptionbtn.isDisplayed();
		typetothrowexpnbtn.isEnabled();
		typetothrowexpnbtn.isDisplayed();
		focuslayoutbtn.isEnabled();
		focuslayoutbtn.isDisplayed();
		
	}
	
	
	public void clickenbutton()
	{
        ebutton.click();
	}
	
	public void clickgooglebutton()
	{
        googlebtn.click();
	}
	
	public void clickfolderbutton()
	{
		folderbtn.click();
	}
	

	public void textboxbtn()
	{
		textbox.click();
	}
	
	public void clickprogressbarbtn()
	{
		
		progressbarbtn.click();
	}
	
	public void checkprogressbarinvis()
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.invisibilityOf(progressdialog));
	}
	
	
	public void clickdisplaytoastbtn()
	{
		displaytoastbtn.click();
	}
	
	public void clickdispplaypopupbtn()
	{
		displaypopupwindowbtn.click();
	}
	
	public void clickthrowexpnbtn()
	{
		throwexceptionbtn.click();
	}

	public void entertypeexpnbtn(String text)
	{
		typetothrowexpnbtn.sendKeys(text);
		
	}
	
	public void verifyexception(String text)
	{
		entertypeexpnbtn(text);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("android:id/title")));
	}
	
}
