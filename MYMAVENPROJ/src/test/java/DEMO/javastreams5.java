package DEMO;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class javastreams5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println("number of iframes in webpage is : "+driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		System.out.println("the element name that present in iframe is : "+driver.findElement(By.xpath("//div[@class='login-btn']/a")).getText());
		driver.findElement(By.xpath("//div[@class='login-btn']/a")).click();
		//Actions a = new Actions(driver);
		
		

	}

}
