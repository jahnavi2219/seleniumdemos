package commandsdemo;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropbox {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		
		 String  handle= driver.getWindowHandle();
		 System.out.println("window handle"+handle);
		 
		 WebElement elementid = driver.findElement(By.id("yearbox")); 
		 for(int i = 0; i < 3; i++)
		 {
		 elementid.click();
		 Thread.sleep(3000);
		 System.out.println("handle id"+elementid);
		 }
		 
		 
		 //Set<String> allWindowHandles = driver.getWindowHandles();
		 //System.out.println("window handles"+allWindowHandles);
		 
		 
		Select a=new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		List<WebElement> l= a.getOptions();
		System.out.println("size is"+l.size());
		for(int i=0;i<l.size();i++)
			{
				System.out.println("Link names are:"+l.get(i).getText());
			}
		
		Select s=new Select(driver.findElement(By.id("yearbox")));
		List<WebElement> l1= s.getOptions();
		System.out.println("size is"+l.size());
		for(int i=0;i<l1.size();i++)
			{
				System.out.println("Link names are:"+l1.get(i).getText());
			}

		//{
			//System.out.println("Link names are:"+linklist.get(i).getText());
		//}
		
	}

}
