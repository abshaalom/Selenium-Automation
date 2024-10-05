package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void fb()
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abshaalom123@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123");
		driver.findElement(By.xpath("//button[@value='1']")).click();
	}
	@After
	public void close()
	{
		driver.close();
	}
}
