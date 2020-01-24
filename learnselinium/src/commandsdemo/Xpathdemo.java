package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Selectable.html");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[contains(text(),'WebTable')]//parent::li//following::li[1]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'WebTable')]//parent::li//preceding-sibling::li[1]//child::a[contains(text(),'Register')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'WebTable')]//parent::li//following-sibling::li[1]//child::a[contains(text(),'SwitchTo')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Computers')]//parent::li//parent::ul//child::li//a[contains(text(),'Electronics')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Interactions')]//ancestor::ul//child::li[3]")).click();
	}

}
