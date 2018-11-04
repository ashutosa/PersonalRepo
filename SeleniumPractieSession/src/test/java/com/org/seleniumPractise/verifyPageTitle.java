package com.org.seleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyPageTitle {

	@Test
	public void verifyTite() {
		System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title of the page  :: " + title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
		Assert.assertTrue(title.contains("Facebook – log in or sign up"), "Title matched");
	    driver.close();
	}
}
