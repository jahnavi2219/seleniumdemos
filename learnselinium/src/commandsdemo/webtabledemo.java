package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtabledemo {
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver","E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/IBM/Desktop/tools.html");
		String text=driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
	}

}
