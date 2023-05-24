package Web.Auto.StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Web.Auto.PageObjects.controlgroupPage;
import Web.Auto.PageObjects.droppablePage;
import Web.Auto.PageObjects.jquerymainpage;
import Web.Auto.PageObjects.selectablePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class webtest  {
	
	WebDriver driver;
	jquerymainpage jqmp;
	selectablePage sp;
	droppablePage dp;
	controlgroupPage cgp;
	
	
	
	
	@Given("User initializes the Browser")
	public void user_initializes_the_browser() {
	    //Initialize the Browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    throw new io.cucumber.java.PendingException();
	}

	@And("User navigates to the Jquery website")
	public void user_navigates_to_the_jquery_website() {
		//Navigate to JQuery Main Page
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	    throw new io.cucumber.java.PendingException();
	}

	
	@Then("User is able to view the JQuery Main page")
	public void user_is_able_to_view_the_jquery_page() {
		
		//Verify we are on main page
				Assert.assertEquals(driver.getTitle(), "jQuery UI");
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("User navigates to the Drag and Drop Page")
	public void user_navigates_to_the_drag_and_drop_page() {
		
		//Click on Droppable button
	 	jqmp.clickdroppable();
	 	
		
	   
	    throw new io.cucumber.java.PendingException();
	}

	@And("User Drags and Drops an Element")
	public void user_drags_and_drops_an_element() {
		
	 	//Verify we are on drag and drop page
	 	Assert.assertEquals(driver.getTitle(), "Droppable | jQuery UI");
		
	 	//drag and drop the object
		 dp.draganddrop();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Navigate to the Main page")
	public void navigate_to_the_Main_page_and_close_browser() {
		
		 
		 //Navigate back to main page
		 driver.navigate().back();
		 
		 //Verify we are back to the main page
		 Assert.assertEquals(driver.getTitle(), "jQuery UI");
		
	

	    throw new io.cucumber.java.PendingException();
	}

	
	

@When("User navigates to the Select Options Page")
public void user_navigates_to_the_select_options_page() {
	
	
	//Click on Select button
 	jqmp.clickselectable();
 	

    throw new io.cucumber.java.PendingException();
}

@And("User Selects mutiple items")
public void user_selects_mutiple_items(){
	
	//verify we are on selectable page
 	Assert.assertEquals(driver.getTitle(), "Selectable | jQuery UI");
 	
 	//Select multiple items
	 sp.selectoptions("Item 1", "Item 3", "Item 7");
 	
  
    throw new io.cucumber.java.PendingException();
}

@Then("User is able to select multiple elements")
public void user_is_able_to_select_multiple_elements() {
	
	
	 //Navigate back to main page
	 driver.navigate().back();
	 
	 //Verify we are back to the main page
	 Assert.assertEquals(driver.getTitle(), "jQuery UI");
	 

    throw new io.cucumber.java.PendingException();
}
	
	
	
@When("User navigates to Control group page")
public void user_navigates_to_control_group_page() {

	//Click on Control and group button
 	jqmp.clickcontrolgroup();
 	
 	
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@And("User chooses multiple options as assigned")
public void user_chooses_multiple_options_as_assigned() {
	
	//verify we are on control group page
 	Assert.assertEquals(driver.getTitle(), "Controlgroup | jQuery UI");
 	
 	//Select SUV
	cgp.selectcarfirst("SUV");
	
	//Select Auto
	cgp.selectauto();
	
	//Select Insurance
	cgp.selectinsurance();
	
	//Select first number of cars
	cgp.firstnoofcars("2");
	
	//Select second number of cars
	cgp.secondnoofcars("Truck");
	
	//Select Standard
	cgp.selectstandard();
	
	//Select second insurance
	cgp.selectsecondinsurance();
	
	//Enter number of cars again
	cgp.entersecondnoofcars("1");
	

 	
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User is able to choose multiple options and book")
public void user_is_able_to_choose_multiple_options_and_book() {
	
	//Click book btn
	cgp.clickbookbtn();
	
	//Navigate back to main page
	 driver.navigate().back();
	 
	 //Verify we are back to the main page
	 Assert.assertEquals(driver.getTitle(), "jQuery UI");
	 
	 
	 //Quit the driver
	 driver.quit();
	 
	 //Close the browser
	 driver.close();
	
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
