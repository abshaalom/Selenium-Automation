package testng;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Jansyaactivity {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://janasya.com/");
	}
	@Test
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		String expectedtitle="Jansya";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("Same as expected title");
		}
		
		else
		{
			System.out.println("Unexpected title");
		}
	}
	@Test
	public void linkverification()
	{
			List<WebElement> li=driver.findElements(By.tagName("a"));
			System.out.println("Total number of links= "+li.size());
			int actualnooflink=li.size();
			int expectednooflink=400;
			if(actualnooflink==expectednooflink)
			{
				System.out.println("Same as expected number of links");
			}
			else
			{
				System.out.println("Unexpected number of links");
			}
	}
@Test
public void screenshot() throws Exception
{
	File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("./Screenshots/Jansyascreenshot.png"));
}
}
