package commandsdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String aargs[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		List<WebElement>iframescount=driver.findElements(By.tagName("iframe"));
		System.out.println("No of frames" +iframescount.size());
		
		for(int i=0;i<iframescount.size();i++)
		{
			System.out.println(iframescount.get(i).getAttribute("name"));
		}
		driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
		driver.findElement(By.xpath("//div[@class='row']"));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("janu");
		Thread.sleep(3000);
		}

}
