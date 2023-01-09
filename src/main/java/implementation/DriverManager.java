package implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
 public WebDriver driver;
 public static ThreadLocal<WebDriver> dr=new ThreadLocal<WebDriver>();
 public WebDriver init_driver(String browser) {
	 if(browser.equals("chrome")) {
		   // Set up the wWebDriverManager for chrome driver
	        WebDriverManager.chromedriver().setup();
		 ChromeOptions ch=new ChromeOptions();
		 //ch.addArguments("--headless");
		 driver=new ChromeDriver(ch);
		 dr.set(driver);
	 }
	 else if(browser.equals("internetexplorer")) {
		 driver=new InternetExplorerDriver();
		 
	 }
	 driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	 return getDriver();
 }
 public static synchronized WebDriver getDriver() {
	 return dr.get();
 }
}
