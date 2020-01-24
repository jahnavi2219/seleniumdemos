package commandsdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.navigate().forward();
		driver.navigate().to("http://demowebshop.tricentis.com/register");
		Thread.sleep(3000);
		driver.navigate().back();
		//driver.navigate().to("http://demowebshop.tricentis.com/login"); //our wish
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();
	}
}
