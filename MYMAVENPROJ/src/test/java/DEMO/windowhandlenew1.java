package DEMO;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class windowhandlenew1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String parentwindow = driver.getWindowHandle();
		System.out.println("unique parent window ID is :"+parentwindow + driver.getTitle());
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Set<String> windowhandles=driver.getWindowHandles();
		for(String windowhandle : windowhandles) {
			driver.switchTo().window(windowhandle);
			driver.manage().window().maximize();
			System.out.println("both child & parent window unique ID is :"+windowhandle  + driver.getTitle());
		Thread.sleep(3000);
		}
		driver.quit();
	}

}
