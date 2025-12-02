package DEMO;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Rahulshettypractice1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		try {
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		driver.close();
		}
		finally {
			Thread.sleep(5000);
			driver.quit();
		}
		
		

	}

}
