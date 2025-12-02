package DEMO;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FrameAutomation4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerlink = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerlink.findElements(By.tagName("a")).size());
		//limiting webdriver for links 
		WebElement columnlinks =footerlink.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.print(columnlinks.findElements(By.tagName("a")).size());	
		//click on each link check if page is opening below is script 
		for (int i=1;i<columnlinks.findElements(By.tagName("a")).size();i++) 
		{
			columnlinks.findElements(By.tagName("a")).get(i).click();
		}
	
	}

}
