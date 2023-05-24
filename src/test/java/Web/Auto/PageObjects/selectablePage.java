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

public class selectablePage {

	
	
	
	WebDriver ldriver;
	WebDriverWait wait = new WebDriverWait(ldriver,Duration.ofSeconds(20));
	
	
	
	public selectablePage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	@FindBy(xpath="//*[@id=\"selectable\"]")
	WebElement selectbox;
	
	Select select;
	
	
	public void selectoptions(String first,String second,String third)
	{
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"selectable\\\"]")));

		select = new Select(selectbox);
		select.selectByVisibleText(first);
		select.selectByVisibleText(second);
		select.selectByVisibleText(third);
		
	}
	
	
	

	

}
