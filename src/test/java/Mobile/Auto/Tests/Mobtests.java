package Mobile.Auto.Tests;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import Mobile.Auto.PageObjects.*;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Mobtests extends MobileBase {
	
	Androidhomepage ahp = new Androidhomepage();
	WebviewPage wvp = new WebviewPage();
	VerifyWebViewpage vwvp = new VerifyWebViewpage();
	UserRegistrationPage urp = new UserRegistrationPage();
	VerifyUserRegistrationPage vurp = new VerifyUserRegistrationPage();
	
	
	
	
	
	
	@Test(priority=1)
	public void verifytitle()
	{
		
		AssertJUnit.assertEquals(ahp.getmaintitle(), "selendroid-test-app");
		
		
		ahp.verifyallelements();
		
	}
	
	
	@Test(priority=2)
	public void checkeng()
	{
		ahp.clickenbutton();
		
		ahp.clicknono();
		
		AssertJUnit.assertTrue(ahp.hpdisplayed());
		
		
	}
	
	
	@Test(priority=3)
	public void checkweview()
	{
		
		ahp.clickgooglebutton();
		
		AssertJUnit.assertEquals(wvp.getwebviewtitle(), "Web View Interaction");
		
		AssertJUnit.assertEquals(wvp.gethellotxt(), "Hello,can you please tell me your name?");
		
		
		wvp.entername("Akram");
		wvp.selectcar("Mercedes");
		
		wvp.clicksendname();
		
		AssertJUnit.assertEquals(vwvp.getnametext(), "Akram");
		
		AssertJUnit.assertEquals(vwvp.getcartext(), "Mercedes");
		
		vwvp.clickherebtnclick();
		
		AssertJUnit.assertEquals(wvp.getpreferredcar(), "Volvo");
		
	}

	
	
	@Test(priority=4)
	public void verifyregisteruser()
	{
		ahp.clickfolderbutton();
		
		AssertJUnit.assertEquals(urp.checkuserregistertitle(), "Welcome to register a new User");
		
		urp.verifyallelements();
		
		AssertJUnit.assertEquals(urp.checknamesection(), "Mr. Burns");
		
		AssertJUnit.assertEquals(urp.checklanguage(), "Ruby");
		
		
		urp.filldetails("Akram123", "Akram@test.com", "12345678", "test", "Java");
		
		urp.clickacceptads();
		
		urp.clickregisteruserbtn();
		
		AssertJUnit.assertEquals(vurp.getcheckname(), "Akram");
		
		AssertJUnit.assertEquals(vurp.getcheckusername(), "test");
		
		AssertJUnit.assertEquals(vurp.getpassword(), "12345678");
		
		AssertJUnit.assertEquals(vurp.getcheckemail(), "Akram@test.com");
		
		AssertJUnit.assertEquals(vurp.getcheckproglang(), "Java");
		
		AssertJUnit.assertEquals(vurp.getacceptadsvalue(), "true");
		
		vurp.clickregisteruser();
		
		AssertJUnit.assertTrue(ahp.hpdisplayed());
		
		
		
		
	}
	
	
	@Test(priority=5)
	public void checkprogressbar()
	{
		ahp.clickprogressbarbtn();
		
		ahp.checkprogressbarinvis();
		
		urp.verifyallelements();
		
	}
	
	@Test(priority=6)
	public void verifytoast()
	{
		ahp.clickdisplaytoastbtn();
		
		AssertJUnit.assertEquals(ahp.gettoasttext(), "Hello selendroid toast!");
	}
	
	@Test(priority=7)
	public void checkdisplay()
	{
		ahp.clickdispplaypopupbtn();
		
		driver.switchTo().alert().dismiss();
	}
	
	@Test(priority=8)
	public void pressexception()
	{
		ahp.clickthrowexpnbtn();
		
		AssertJUnit.assertTrue(ahp.hpdisplayed());
	}
	
	@Test(priority=9)
	public void textexception()
	{
		ahp.verifyexception("test");
		
		AssertJUnit.assertTrue(ahp.hpdisplayed());
		
	}
}
