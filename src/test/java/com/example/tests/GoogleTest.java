package com.example.tests;

import com.example.base.BaseTest;
import com.example.pages.HomePage;
import org.testng.annotations.Test;
import org.testng.Assert;

public class GoogleTest extends BaseTest {

    @Test
    public void searchTest() throws InterruptedException {
        driver.get("https://adactinhotelapp.com/");

        HomePage home = new HomePage(driver);
        home.enterUsername("admin");
        home.enterPassword("admin");
        
        // Google search button may be hidden, so wait a bit or send ENTER key as alternative
        Thread.sleep(2000);
        home.clickLoginButton();

        Thread.sleep(3000); // wait for results page to load

        String title = home.getTitle();
        System.out.println("Page Title after search: " + title);

        //Assert.assertTrue(title.contains("Selenium WebDriver"), "Title does not contain search term!");
    }
}
