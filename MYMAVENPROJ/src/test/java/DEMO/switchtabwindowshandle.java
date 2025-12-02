package DEMO;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class switchtabwindowshandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		Set<String> st = driver.getWindowHandles();
		Iterator<String> it = st.iterator();
		String Parent = it.next();
		String Child = it.next();
		driver.switchTo().window(Child);
		Thread.sleep(2000);
		System.out.print(driver.findElement(By.xpath("//div[@class='button float-left']/a")).getText());

	}

}
