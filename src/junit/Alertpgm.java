package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("file:///C:/Users/absha/Desktop/alert.html");
}
@Test
public void test()
{
	driver.findElement(By.xpath("//input[@onclick='displayalert()']")).click();
	Alert a=driver.switchTo().alert();
	String alerttext=a.getText();
	System.out.println(alerttext);
//	a.dismiss();
	a.accept();
    driver.findElement(By.xpath("//input[@name='Firstname']")).sendKeys("Abshaalom");
    driver.findElement(By.xpath("//input[@name='Lastname']")).sendKeys("Thomas");
    driver.findElement(By.xpath("//input[@value='submit']")).click();
}
}
