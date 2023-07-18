package org.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	static WebDriver driver;

	public static void launchApplication(String browser, String url, int sec) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.get(url);

		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

		driver.manage().window().maximize();

	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;

	}
	
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
	
	public static void quit() {
		driver.quit();

	}
	
	public static void close() {
		driver.close();

	}
	public static void sendkeys(WebElement elem,String value) {
		elem.sendKeys(value);

	}
	public static void btnClick(WebElement elem) {
	elem.click();

	}
	

}
