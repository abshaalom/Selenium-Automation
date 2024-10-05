package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertpgm {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void test()
	{
		String actualtitle=driver.getTitle();
		String expectedtitle="Google";
		System.out.println("title="+actualtitle);
		Assert.assertEquals(actualtitle, expectedtitle,"title verified");
		System.out.println("verified");
	}

}
