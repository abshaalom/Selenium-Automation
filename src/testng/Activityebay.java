package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activityebay {
	String url="https://www.ebay.com/";
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void test()
	{
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); implicit wait
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30)); //explicit wait
		WebElement el= driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		WebElement sp= driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(el).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"))).click();
//		sp.click();
//		act.perform();
	}
}
