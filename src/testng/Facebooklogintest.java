package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebooklogintest {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	
	}
	@Test
	public void test()
	{
		driver.findElement(By.name("email")).sendKeys("abshaalom23");
		driver.findElement(By.name("pass")).sendKeys("absc");
		driver.findElement(By.name("login")).click();
		String expectedurl="https://www.facebook.com";
		String actualurl=driver.getCurrentUrl();
		
		if(expectedurl.equals(actualurl))
		{
			System.out.println("login succesful");
		}
		else
		{
			System.out.println("invalid login");
		}
	}
	
}
