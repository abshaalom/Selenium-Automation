package testpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Createpage;

public class Createpagetest {
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
		Createpage ob=new Createpage(driver);
		ob.createapageclick();
		ob.textverification();
		ob.signup();
	}

}
