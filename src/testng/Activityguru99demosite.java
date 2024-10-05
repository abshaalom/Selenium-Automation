package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activityguru99demosite {
	String url="https://demo.guru99.com/test/simple_context_menu.html";
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void test()
	{
		WebElement rclick= driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		WebElement dclick= driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
		Actions act=new Actions(driver);
		act.contextClick(rclick).perform();
		edit.click();
		Alert a=driver.switchTo().alert();
		a.accept();
		act.doubleClick(dclick).perform();
		Alert b=driver.switchTo().alert();
		String dclickalerttext=a.getText();
		System.out.println(dclickalerttext);
		a.accept();
		act.perform();
		
	}

}
