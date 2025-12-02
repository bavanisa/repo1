package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertcase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("saggu bhavani");
		//driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		//System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
	    driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
	    Thread.sleep(3000);
	    System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().dismiss();
		

	}

}
