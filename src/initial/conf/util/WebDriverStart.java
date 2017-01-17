package initial.conf.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverStart {
	
	private static WebDriver driver;
	
	public static WebDriver get(){
		
		System.setProperty("webdriver.gecko.driver", "/Users/samuca/Documents/WebDrive/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		return driver;
	}
}
