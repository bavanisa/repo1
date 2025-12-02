package DEMO;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;
public class AutomationRahulshetty {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		Thread.sleep(3000);
		//saving moouse over element in webelement in below script 
		WebElement move =driver.findElement(By.xpath("//div[@id='nav-link-accountList']/a"));
		//below script is to type hello in caps in search bar amazon site automatically 
		//want to select text enetered in search box give double click in below script 
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//webeelement what ever given as move we given below and doing build and perform
		a.moveToElement(move).contextClick().build().perform();
		//right click on element we need to give a.moveToElement(move).contextclick().build().perform();
		 
		
		
		

	}

}
