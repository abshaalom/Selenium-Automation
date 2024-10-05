package junit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void amazon()
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Moblies",Keys.ENTER);//mobiles enter
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();//cart icon
		driver.findElement(By.xpath("//a[4][@data-csa-c-type='link']")).click();//any of the menu
		driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']")).click();//hello sign in
		driver.navigate().back(); //USED TO NAVIGATE TO BACK PAGE
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		
	}
	@After
	public void close()
	{
		driver.close();
	}
}
