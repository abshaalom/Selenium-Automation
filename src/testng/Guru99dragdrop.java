package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99dragdrop {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	@Test
	public void test()
	{
		Actions act=new Actions(driver);
		WebElement src1= driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement des1= driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement src2= driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement des2= driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		act.dragAndDrop(src1, des1).perform();
		act.dragAndDrop(src2, des2);
		WebElement src3=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement des3=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		act.dragAndDrop(src3, des3);
		WebElement src4=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement des4=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		act.dragAndDrop(src4, des4);
		act.perform();
		WebElement perfect=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
		if(perfect.isDisplayed())
		{
			System.out.println("Perfect message is displayed");
		}
		else
		{
			System.out.println("perfect message is not displayed");
		}
		
	}

}
