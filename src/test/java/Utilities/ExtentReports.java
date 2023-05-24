package Utilities;
import org.testng.ITestContext;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.*;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.*;

public class ExtentReports {
	

	public class ExtentReportManager implements ITestListener {
		
		
		ExtentSparkReporter  sparkreporter;
		ExtentReports reports;
		ExtentTest test;
		String repname;
		
		
		public void onStart(ITestContext testontext)
		{
			String timestamp = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
			repname="Tech-Task-Report" + timestamp + ".html";
			sparkreporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/"+repname);
			
			
			sparkreporter.config().setDocumentTitle("Tech_Task_Report");
			sparkreporter.config().setReportName("Tech Report");
			sparkreporter.config().setTheme(Theme.DARK);
			
			reports = new ExtentReports();
			reports.attachReporter(sparkreporter);
			reports.setSystemInfo("Operating System", System.getProperty("os.name"));
			reports.setSystemInfo("username", System.getProperty("user.name"));
			reports.setSystemInfo("Application", "Store User");
			reports.setSystemInfo("Environment", "QA");
			
			
			
		}
		
		
		public void onTestSuccess(ITestResult result)
		{
			test = reports.createTest(result.getName());
			test.createNode(result.getName());
			test.assignCategory(result.getMethod().getGroups());
			test.log(Status.PASS, "Pass Result Obtained");	
			
			
		}
		
		
		
		public void onTestFailure(ITestResult result)
		{
			test = reports.createTest(result.getName());
			test.createNode(result.getName());
			test.assignCategory(result.getMethod().getGroups());
			test.log(Status.FAIL, "Fail Result Obtained");	
			test.log(Status.FAIL, result.getThrowable().getMessage());	
			
			
		}
		
		public void onTestSkipped(ITestResult result)
		{
			test = reports.createTest(result.getName());
			test.createNode(result.getName());
			test.assignCategory(result.getMethod().getGroups());
			test.log(Status.SKIP, "Test Skipped");	
			test.log(Status.SKIP, result.getThrowable().getMessage());	
			
			
		}
		
		
		public void onFinish(ITestContext testcontext)
		{
			reports.flush();
			
			
			}

	}


}
