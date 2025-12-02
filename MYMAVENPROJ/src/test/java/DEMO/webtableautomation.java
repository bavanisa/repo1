package DEMO;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class webtableautomation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("Rice");
		List<WebElement> veggies =driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> Filtr=veggies.stream().filter(veggie->veggie.getText().
				contains("Rice")).collect(Collectors.toList());
		Assert.assertEquals(veggies.size(),Filtr.size());
		

	}

}
