package junit;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activityrishiherbal {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://rishiherbalindia.linker.store");
}
@Test
public void titleverification()
{
	String actual=driver.getTitle();
	String expected="Rishi Herbal India";
	if(actual.equals(expected))
	{
		System.out.println("Same as expected title");
	}
	else
	{
		System.out.println("Unexpected title ");
	}
	
}
@Test
public void link()
{
	List<WebElement> li=driver.findElements(By.tagName("a"));
	System.out.println("Total number of links= "+li.size());
	int expectedlink=100;
	int actuallink=li.size();
	if(expectedlink==li.size())
	{
		System.out.println("Same as expected number of links"); 
	}
	else
	{
		System.out.println("Unexpected number of links");
	}
}
@Test
public void food()
{
	String s=driver.getPageSource();
	String expected="Food";
	if(s.contains(expected))
	{
		System.out.println("FOOD text is present");
	}
	else
	{
		System.out.println("FOOD text is not prsent");
	}
}
@Test
public void click()
{
driver.findElement(By.xpath("//a[@class='ls-nav-link']")).click();
}

@After
public void close()
{
	driver.quit();
}
}