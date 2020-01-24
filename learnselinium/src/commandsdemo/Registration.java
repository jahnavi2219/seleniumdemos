package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.remote.server.handler.FindElement;

public class Registration {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("tunuguntla");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("jahnavi");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("bangalore");
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")).sendKeys("janu1998@gmail.com");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@name='radiooptions' and @value='FeMale']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='Cricket']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='Movies']")).click();
		
		WebElement country=driver.findElement(By.xpath("//select[@id='countries']"));
		Select c=new Select(country);
		c.selectByVisibleText("India");
		
		WebElement year=driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select sell=new Select(year);
		sell.selectByVisibleText("1998");
		
		WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s=new Select(month);
		s.selectByValue("April");
		
		WebElement day=driver.findElement(By.xpath("//select[@id='daybox']"));
		Select d=new Select(day);
		d.selectByIndex(19);
		
		
		}
}

