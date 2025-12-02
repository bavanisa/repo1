package DEMO;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.net.URLConnection;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
public class softassertion {

	public static void main(String[] args) throws IOException, IOException  {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		List<WebElement> links = driver.findElements(By.xpath("//a[contains(text(),'Broken Link')]"));
		SoftAssert a = new SoftAssert();
		
		for(WebElement link : links) 
		{
		String url = link.getAttribute("href");
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respcode = conn.getResponseCode();
		System.out.println(respcode);
		a.assertTrue(respcode<400,"the link with text "+ link.getText()+ "is broken link" + respcode);
	}
		a.assertAll();
	}
	
}

