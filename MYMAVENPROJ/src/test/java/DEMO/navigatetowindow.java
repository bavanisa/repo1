package DEMO;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class navigatetowindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver = new FirefoxDriver();
     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
     Thread.sleep(3000);
     driver.navigate().to("https://www.qaclickacademy.com/");
     //navigate back
     driver.navigate().back();//navigate back to practice page 
     driver.navigate().forward();//go to last window aqclickacadey as per browser history 
     driver.navigate().refresh();//refresh current browser page
     
	}

}
