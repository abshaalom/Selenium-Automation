package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class amzn {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
}
@Test
public void amaz()
{
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles",Keys.ENTER);//searched mobiles and enter
	driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();//clicking on cart icon
	driver.findElement(By.xpath("//a[4][@data-csa-c-type='link']")).click();
	
}
}
