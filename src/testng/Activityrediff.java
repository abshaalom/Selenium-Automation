package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activityrediff {
	ChromeDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void Logo()
	{
		WebElement logo= driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		boolean b=logo.isDisplayed();
		if(b)
		{
			System.out.println("Logo is present");
		}
		else
		{
			System.out.println("Logo is not present");
		}
	}
	@Test
	public void radiobutton()
	{
		WebElement radio= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		boolean r= radio.isSelected();
		if(r)
		{
			System.out.println("Radio button is Selected");
		}
		else
		{
			System.out.println("Radio button is not Selected");
		}

	}
	@Test
	public void checkbox()
	{
	WebElement check=	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
	boolean c= check.isEnabled();
	if(c)
	{
		System.out.println("Checkbox is enabled");
	}
	else
	{
		System.out.println("Checkbox is not enabled");
	}
	}

}
