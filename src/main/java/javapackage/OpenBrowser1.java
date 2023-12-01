package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser1 {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Enter email on email-text field
		
		driver.findElement(By.id("email")).sendKeys("Admin");
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys("12345");
		
		//click on create new account button with the help text()
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		
			
	}

}
