package DEMO;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
public class brokenlinksrahulshetty {

	public static void main(String[] args) throws IOException, IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		List<WebElement> links = driver.findElements(By.xpath("//a[contains(text(),'Broken Link')]"));
		for(WebElement link : links) {
		String url = link.getAttribute("href");
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respcode = conn.getResponseCode();
		System.out.println(respcode);
		if(respcode>400) {
			System.out.println("the link with text "+ link.getText()+ "is broken link" + respcode);
			Assert.assertTrue(false);
		}
		}//above code is for hard assertion for broken links 
	}

}
