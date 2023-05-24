package Web.Auto.PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class controlgroupPage {
	

	
	
	
	WebDriver ldriver;
	
	WebDriverWait wait = new WebDriverWait(ldriver,Duration.ofSeconds(20));

	
	public controlgroupPage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	@FindBy(xpath="//*[@id=\"car-type-button\"]")
	WebElement selectcar;
	
	@FindBy(xpath="/html/body/div[1]/fieldset[1]/div/label[2]")
	WebElement autocheckbox;
	
	@FindBy(xpath="/html/body/div[1]/fieldset[1]/div/label[3]")
	WebElement insurancebtn;
	
	@FindBy(xpath="//*[@id=\"horizontal-spinner\"]")
	WebElement noofcars;
	
	@FindBy(xpath="//*[@id=\"ui-id-1-button\"]")
	WebElement secondselect;
	
	@FindBy(xpath="/html/body/div[1]/fieldset[2]/div/label[1]")
	WebElement secondstandard;
	
	@FindBy(xpath="/html/body/div[1]/fieldset[2]/div/label[3]")
	WebElement secondinsurance;
	
	@FindBy(xpath="//*[@id=\"vertical-spinner\"]")
	WebElement secondnoofcars;
	
	@FindBy(xpath="//*[@id=\"book\"]")
	WebElement bookbtn;
	
	Select select;
	
	
	public void selectcarfirst(String car)
	{
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"car-type-button\\\"]")));

		select = new Select(selectcar);
		select.selectByVisibleText(car);
	}
	
	
	public void selectauto()
	{
		
	autocheckbox.click();
	
	}
	
	public void selectinsurance()
	{
		insurancebtn.click();
	}
	
	public void firstnoofcars(String numofcars)
	{
		noofcars.sendKeys(numofcars);
	}
	
	
	public void secondnoofcars(String secondcar)
	{
		
		select = new Select(secondselect);
		select.selectByVisibleText(secondcar);
	}
	
	

	public void selectstandard()
	{
		
       secondstandard.click();
	}
	
	public void selectsecondinsurance()
	{
		
		secondinsurance.click();
	}
	
	public void entersecondnoofcars(String secondnumofcars)
	{
		
		secondnoofcars.sendKeys(secondnumofcars);
	}
	

	public void clickbookbtn()
	{
		
		bookbtn.click();
	}
}
