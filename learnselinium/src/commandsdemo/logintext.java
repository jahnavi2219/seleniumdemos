package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.server.handler.GetAlertText;

public class logintext {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		//System.setProperty("webdriver.gecko.driver", "E:\\seleniumGH20software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		//driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("janu1998@gmail.com");
		driver.findElement(By.className("password")).sendKeys("janu19");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		
		String expectedname="Demo Web Shop";
		String actualname=driver.getTitle();
		System.out.println(actualname);
		if(expectedname.equals(actualname)){
			System.out.println("u r on the correct page");
		}
		else
		{
			System.out.println("incorrect page");
		}
		System.out.println(actualname.length());
		
	
		
		String expectedurl="http://demowebshop.tricentis.com/register";
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		if(expectedurl.equals(actualurl)){
			System.out.println("correct url");
		}
		else
		{
			System.out.println("incorrect url");
		}
		
	
	String PageSource=driver.getPageSource();
	System.out.println(PageSource.length());
	
		driver.close();
		}
}
		
		
	


