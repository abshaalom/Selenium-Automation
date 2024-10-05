package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadusingsendkeys {
ChromeDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/upload/");
}
@Test
public void test()
{
	driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\absha\\Documents\\excel\\datadrivenfacebooklogin.xlsx");
	driver.findElement(By.xpath("//*[@id=\"emailwindow\"]/form/ul/li/center/span")).click();
	driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
}
}
