package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activityfacebook {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Parameters({"email","password"})
	@Test
	public void test(String email, String password)
	{
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}

}
