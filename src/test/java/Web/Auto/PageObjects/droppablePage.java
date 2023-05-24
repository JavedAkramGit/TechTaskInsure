package Web.Auto.PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class droppablePage {

	
	
	
	WebDriver ldriver;
	
	WebDriverWait wait = new WebDriverWait(ldriver,Duration.ofSeconds(20));
	
	public droppablePage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	@FindBy(xpath="//*[@id=\"draggable\"]")
	WebElement source;
	
	@FindBy(xpath="//*[@id=\"droppable\"]")
	WebElement destination;
	
	Actions actions;
	
	
	
	
	public void draganddrop()
	{
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"draggable\\\"]")));
         actions = new Actions(ldriver);
         actions.dragAndDrop(source, destination);
	}
	
	


	

}
