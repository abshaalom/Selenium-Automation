package pagepkg;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Createpage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"reg_pages_msg\"]/a")//create a page button's xpath
	WebElement fbcreatepagebutton;
	@FindBy(xpath="//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")//signup button xpath
	WebElement signupbutton;
	
	
	public Createpage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void createapageclick()
	{
		fbcreatepagebutton.click();
	
		
	}
	public void textverification()
	{
		String src= driver.getPageSource();
		if(src.contains("Create a Page"))
		{
			System.out.println("Verified");
		}
		else
		{
			System.out.println("Failed");
		}
	}
	public void signup()
	{
		signupbutton.click();
	}
	

}
