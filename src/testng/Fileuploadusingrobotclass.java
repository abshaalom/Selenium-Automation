package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadusingrobotclass {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
	}
	@Test
	public void test() throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		fileUpload("C:\\Users\\absha\\Documents\\abc.docx");
	}
	public void fileUpload(String p) throws AWTException {
		StringSelection strselection= new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
		
		Robot robot =new Robot();
		
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
