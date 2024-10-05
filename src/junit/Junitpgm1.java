package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitpgm1 {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		 driver= new ChromeDriver();
		 driver.get("https://www.google.com");
	}
@Test

	public void TitleVerification()
	{
		String actual=driver.getTitle();
		String expected="Google";
		if(actual.equals(expected))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
@Test
public void TextVerification()
{
	String src=driver.getPageSource();
	String expsrc="India";
	if(src.contains(expsrc))
	{
		System.out.println("The page contains this text");
	}
	else
	{
		System.out.println("The page doesn't contains this text");
	}
}
@After
public void exit()
{
driver.close();	
}

}

