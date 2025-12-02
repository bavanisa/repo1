package DEMO;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automationclass2 {
	
	    public static void main(String[] args) throws InterruptedException {
	      WebDriver driver = new FirefoxDriver();
	      driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
	      Set<String> windows = driver.getWindowHandles();// stores parent window id and child window id 
	       Iterator<String> it = windows.iterator();
	       String parentID = it.next();
	       String childID = it.next();
	      driver.switchTo().window(childID);
	      Thread.sleep(3000);
	      System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']/strong/a")).getText());
	      String emailID = (driver.findElement(By.xpath("//p[@class='im-para red']/strong/a")).getText());
	      driver.switchTo().window(parentID);
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@id='username']")).sendKeys(emailID);
	    }
	}