package Web.Auto.PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class jquerymainpage {
	
	
	
	
	WebDriver ldriver;

	WebDriverWait wait = new WebDriverWait(ldriver,Duration.ofSeconds(20));
	
	
	public jquerymainpage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	@FindBy(xpath="//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")
	public static WebElement droppable;
	
	@FindBy(xpath="//*[@id=\"sidebar\"]/aside[1]/ul/li[4]/a")
	WebElement selectable;
	
	@FindBy(xpath="//*[@id=\"sidebar\"]/aside[2]/ul/li[5]/a")
	WebElement controlgroup;
	
	
	public void clickdroppable()
	{
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"sidebar\\\"]/aside[1]/ul/li[2]/a")));
		droppable.click();
	}
	
	
	public void clickselectable()
	{
		
		selectable.click();
	}
	
	public void clickcontrolgroup()
	{
		
		controlgroup.click();
	}

	
	
}
