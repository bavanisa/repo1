package DEMO;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class rahulsheety5 {

	public static void main(String[] args) throws MalformedURLException, IOException {
	//if we see the error code more than 400 like 401 ,402 ,404 is for broken links 
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();//used to clear all cookies 
		//driver.manage().deleteCookieNamed("deletecocookie");//if we need to delete particular cookie then we use this 
        //driver.findElement(By.xpath("//a[contains(text(),'SoapUI')]")).click();
		String url = driver.findElement(By.xpath("//a[contains(text(),'SoapUI')]")).getAttribute("href");
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respcode = conn.getResponseCode();
		System.out.println(respcode);
	}

}
