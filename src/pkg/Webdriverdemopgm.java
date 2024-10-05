package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverdemopgm {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();  //opens chrome browser
		d.get("https://google.com");  //opens the corresponding url
		String actualtitle =d.getTitle();
		String expectedtitle="Google";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		d.close();
	
		//we can use object.close(); and object.quit(); to close  
		//object.quit(); is to quit browser object.close(); is to close current tab
		
		
	}

}
