package DEMO;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tabhandleselenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		driver.manage().window().maximize();
		Set<String> st = driver.getWindowHandles();
		Iterator<String> it= st.iterator();
		String parentid = it.next();
		String childid= it.next();
		Thread.sleep(3000);
		driver.switchTo().window(childid);
		driver.findElement(By.xpath("//a[contains(text(),'Access all our Courses')]")).click();
		driver.switchTo().window(parentid);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("bhavani");
		
		
	
		/*driver.findElement(By.xpath("//a[@id='opentab']")).click();
	    //driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		//String childwindow = driver.getWindowHandle();
		//driver.switchTo().window(childwindow)
		Set<String> windowhandles = driver.getWindowHandles();
		for(String windowhandle : windowhandles) {
			driver.switchTo().window(windowhandle);
			if(!windowhandle.equals(parentwindow)){
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[contains(text(),'Access all our Courses')]")).click();
				driver.close();
			}	
			//System.out.println(windowhandle);
			//String st=driver.getTitle();
			//System.out.println("need title here is :"+st);
			//System.out.println(windowhandles);	
			
			
		}
		
		driver.switchTo().window(parentwindow);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("bhavani");
		
*/
		
		
	}

}
