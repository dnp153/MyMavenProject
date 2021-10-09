package threadlocal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManagerDemo {
	
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		/*
		 * WebDriverManager.firefoxdriver().setup();
		 * WebDriverManager.edgedriver().setup();
		 */
		driver = new ChromeDriver();
	}
	
	@Test
	public void test1() {
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
