package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void fb()
	{
		driver.findElement(By.id("email")).sendKeys("abshaalom2342@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abshsihuv");
		driver.findElement(By.name("login")).click();
	}
	@After
	public void exit()
	{
		driver.close();
	}

}
