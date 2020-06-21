package TestPackage;


import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base extends Utilities {

public WebDriver driver;
public  WebDriver driverInitialize() {
	Properties prop= propertiesFileRead();
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ prop.getProperty("ChromePath"));
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	return driver;
}

}
