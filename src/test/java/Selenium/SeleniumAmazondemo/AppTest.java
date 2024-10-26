package Selenium.SeleniumAmazondemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
	WebDriver driver;
	@BeforeClass
	public void openurl() {
		//for enter chromeedriver path manually
		//System.setProperties("webdriver.chrome.driver","chromedriverpath");
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		ChromeOptions options = new ChromeOptions();

		options.addArguments("start-maximized");

		options.addArguments("disable-infobars");

		options.addArguments("--disable-extensions");
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        
	}
	@Test(priority=1)
	public void selectdress() {
		String title=driver.getTitle();
		System.out.println(title);
		
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource()); //--for front end page code
        
	}
	@AfterClass
	public void afterclass()
	{
		//driver.close();
		driver.quit(); //-closing all the browsers
	}
}
