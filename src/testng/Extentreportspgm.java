package testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreportspgm {
WebDriver driver;
String baseurl="https://www.facebook.com";
ExtentSparkReporter reporter; 
ExtentTest test;
ExtentReports extent;

@BeforeTest
public void beftest()
{
	reporter=new ExtentSparkReporter("./Reports/facebookreport.html");//object of extent spark reporter
	reporter.config().setDocumentTitle("AutomationReport");
	reporter.config().setReportName("Functional Test");
	reporter.config().setTheme(Theme.DARK);
	extent=new ExtentReports(); //object of extendreports
	extent.attachReporter(reporter);
	extent.setSystemInfo("Hostname", "Localhost");
	extent.setSystemInfo("OS", "Windows 11");
	extent.setSystemInfo("Testername", "Abshaalom");
	extent.setSystemInfo("Browser", "Chrome");
	driver=new ChromeDriver();
}
@BeforeMethod
public void setup()
{
	driver.get(baseurl);
}
@Test
public void titleverification()
{
	test=extent.createTest("Fbtitleverification");
	String exp="facebook";
	String act=driver.getTitle();
	Assert.assertEquals(exp, act);
}
@Test
public void buttonverification()
{
	test=extent.createTest("Fbbuttonverification");
	String act=driver.findElement(By.xpath("//*[@id=\"u_0_5_6R\"]")).getText();
	String exp="Log in";
	Assert.assertEquals(act, exp);
}
@AfterTest
public void teardown()
{
	extent.flush();
}
@AfterMethod
public void browserclose(ITestResult result) throws IOException 
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		test.log(Status.FAIL, "test case failed is"+result.getName());
		test.log(Status.FAIL,"test case failed is"+result.getThrowable());
	}else if(result.getStatus()==ITestResult.SKIP)
	{
		test.log(Status.SKIP,"test case skipped is"+result.getName());
	}else if(result.getStatus()==ITestResult.SUCCESS)
	{
		test.log(Status.PASS, "test case passed is"+result.getName());
	}
	
}
}
