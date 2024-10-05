package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
	WebDriver driver;
//	
//	By fbemail=By.id("email");
//	By fbpswd=By.id("pass");
//	By fblogin=By.name("login");
	
	@FindBy(id="email")
	WebElement fbemail;
	
	@FindBy(id="pass")
	WebElement fbpswd;
	
	@FindBy(name="login")
	WebElement fbloginbutton;
	
	
	public Fbloginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setvalues(String email,String pswd)
	{
		fbemail.sendKeys(email);
		fbpswd.sendKeys(pswd);
	}
	public void loginclick()
	{
		fbloginbutton.click();
	}
	

}
