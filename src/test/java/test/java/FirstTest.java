package test.java;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

import utilities.ReadConfig;

public class FirstTest {

	ReadConfig readconfig = new ReadConfig();
	public static WebDriver driver;
	
	@Test
    public void OpenBrowser()  {
        System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
        driver.close();
	}
}
