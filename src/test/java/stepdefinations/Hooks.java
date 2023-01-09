package stepdefinations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import implementation.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	public static WebDriver driver;
@Before
public void setup() throws IOException {
	String browser=propertiesvalues("browser");
	DriverManager d=new DriverManager();
	driver=d.init_driver(browser);
	System.out.println(browser);
}

@After
public void Teardown() {
	driver.quit();
}

public static String propertiesvalues(String key) throws IOException {
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/globalproperties.properties");
prop.load(fis);
return prop.getProperty(key);
}
}
