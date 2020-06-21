package TestPackage;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Clock;
import java.util.Calendar;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
	public WebDriver driver;
	private FileInputStream file;
	public Class<?> getClass;
	private File src;
	Calendar cal;
	
	public FileInputStream readFile(String filePath) {
		try {	
		 file = new FileInputStream(System.getProperty("user.dir") + filePath);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
			}
		return file;
		
	}
	
	public Properties propertiesFileRead() {
		FileInputStream file = readFile("\\src\\test\\resources\\TestData.properties");
		Properties prop = new Properties();
		try {
			prop.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
	}
	
	public Properties UserDetailsFileRead() {
		FileInputStream file = readFile("\\src\\test\\resources\\Userdetails.properties");
		Properties prop = new Properties();
		try {
			prop.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
	}
	
	public WebDriverWait explicitWait(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		return wait;
	}
	
	public String formatDate( ) {
		String date= Clock.systemUTC().instant().toString().replaceAll(":", "-").replaceAll("//.", "-");
		return date;
	}
	
	public void takeScreenShot(WebDriver driver, String currentTestName) {
		this.driver= driver;
		src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String formattedDate = formatDate();
		File destFile = new File(System.getProperty("user.dir") +"\\ScreenShots\\"+ currentTestName +"\\" +formattedDate+ ".png");
		try {
			FileUtils.copyFile(src, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
 }