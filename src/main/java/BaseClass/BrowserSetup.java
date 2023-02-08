package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {
	
	public static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String Url ){
		if(browserName.equalsIgnoreCase("Chrome")) {
			 WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver();
		}else
		if(browserName.equalsIgnoreCase("IE")) {
			 WebDriverManager.iedriver().setup();
				driver= new InternetExplorerDriver();
		}else
		if(browserName.equalsIgnoreCase("Firefox")) {
			 WebDriverManager.firefoxdriver().setup();
				driver= new FirefoxDriver();
				}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(Url);
		return driver;
	}
	

}
