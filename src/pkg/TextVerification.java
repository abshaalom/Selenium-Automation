package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class TextVerification {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		String s=driver.getPageSource(); // to get page source
		String t="India";
		if(s.contains(t))
		{
			System.out.println("Page contains the text");
		}
		else
		{
			System.out.println("Page doesn't contains the text");
		}
		driver.close();
		
	}

}
