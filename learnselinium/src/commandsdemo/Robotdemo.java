package commandsdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotdemo {
	public static void main(String args[]) throws AWTException{
		
	System.setProperty("webdriver.chrome.driver","E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ilovepdf.com/jpg_to_pdf");
	driver.manage().window().maximize();
	
	Robot robo=new Robot();
	robo.setAutoDelay(3000);
	driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
	
	StringSelection stringselect=new StringSelection("C:\\Users\\IBM\\Desktop\\download1.jfif");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect,null);
	robo.setAutoDelay(3000);
	
	robo.keyPress(KeyEvent.VK_CONTROL);
	robo.keyPress(KeyEvent.VK_V);
	
	robo.keyRelease(KeyEvent.VK_CONTROL);
	robo.keyRelease(KeyEvent.VK_V);
	
	robo.setAutoDelay(3000);
	
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
	

}
}