package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	ChromeDriver driver;
	@Before
		public void setup()
		{
			driver= new ChromeDriver();
			driver.get("https://www.google.com");
			
		}
	@Test
	public void searchbar()
	{
		driver.findElement(By.name("q")).sendKeys("apple",Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
	}
	@After
	public void close()
	{
		driver.close();
	}
	

}
