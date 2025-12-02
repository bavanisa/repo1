package DEMO;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Windowshandle2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Set<String> st = driver.getWindowHandles();//handling data of two windows 
		Iterator<String> it = st.iterator();// giving iterator string it to store windowid
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		Thread.sleep(3000);
      System.out.print(driver.findElement(By.xpath("//div[@class='cont']/span")).getText());

	}

}
