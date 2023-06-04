package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonBase {

	public WebDriver driver;


public void lunchBrowser() {
	
	
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	
	public void closecurrent() {
		driver.close();
	}
		public void closeAll() {
		
		driver.quit();
		
	
			
		
	}
}

