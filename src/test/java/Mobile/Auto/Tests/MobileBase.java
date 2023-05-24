package Mobile.Auto.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;



public class MobileBase {
	
	AndroidDriver driver;
	 URL url;
	
	@BeforeClass
	public void initializedriver() throws MalformedURLException, InterruptedException
	{
		//Appiumserver.start();
		url = new URL("http://127.0.0.1:4723/");
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("emulator-5554");
		
		options.setAppPackage("io.selendroid.testapp");
		options.setAppActivity("io.selendroid.testapp.HomeScreenActivity");
		//options.setNoReset(true);
		
		driver = new AndroidDriver(url,options);
		
		
		//AppFactory.android_launchapp(options);
		
		//instead of driver.findElement we use AppDriver.getDriver.findElement
		
		//driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		
		System.out.println("App has been installed");
		
		
		
		
		
		
	}
	
	@AfterClass
	public void teardown()
	{
		
		driver.quit();
	}

}
