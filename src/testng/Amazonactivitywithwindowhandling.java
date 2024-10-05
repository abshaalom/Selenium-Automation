package testng;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonactivitywithwindowhandling {
	ChromeDriver d;
	
	@BeforeTest
	public void setup()
	{
		d=new ChromeDriver();
		d.get("https://www.amazon.in/");
	}
	@Test
	public void test() throws Exception
	{
		JavascriptExecutor js= (JavascriptExecutor) d;
		WebElement search= d.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("mobilephones",Keys.ENTER);
		String parentwindow=d.getWindowHandle();
		String exp="Amazon.in : mobilephones";
		String act=d.getTitle();
		assertEquals(act,exp);
		js.executeScript("window.scrollBy(0,1000)");
		d.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		
		Set<String> allwindowhandles= d.getWindowHandles();
		
		for(String handle: allwindowhandles)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				d.switchTo().window(handle);
				js.executeScript("window.scrollBy(0,650)");
				d.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[38]/div[1]/span/span/span/input")).click();//add to cart
				//d.close();
				
			}
			d.switchTo().window(parentwindow);


		
	}

	}
}
