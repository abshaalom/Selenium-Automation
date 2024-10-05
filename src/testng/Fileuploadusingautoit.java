package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadusingautoit {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
	}
	@SuppressWarnings("deprecation")
	@Test
	public void test() throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\absha\\Documents\\Auto it\\T1.exe");
		Thread.sleep(3000);
	}

}
//turn off defender
