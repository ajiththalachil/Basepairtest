package TestPackage;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class RegisterPageTest extends Base {
//Variable Initializations//	
WebDriver driver;
Properties baseprop;
Properties dataprop;
WebDriverWait wait;
RegisterPage registerPage;

//*******************************************************************************************************//
//Driver and Other Utilities Initialization.
@BeforeTest
public void baseSetup() {
baseprop = propertiesFileRead();	
driver= driverInitialize();
wait = explicitWait(driver);
driver.get(baseprop.getProperty("BaseUrl"));
registerPage = PageFactory.initElements(driver,RegisterPage.class);
dataprop = UserDetailsFileRead();
}

//Checking Validation message is not displayed for valid inputs for first name
@Test
public void validfirstNameInputs(){
	Reporter.log("Checking Validation message is not displayed for valid inputs for first name");	
for(int i=0;i<=Integer.parseInt(dataprop.getProperty("ValidUserDetailsCount"));i++) {		
	registerPage.enterFirstName(dataprop.getProperty("ValidFirstName"+i));
	registerPage.submitForm();
	Assert.assertEquals(false, registerPage.firstNameErrorMessageDisplayed());
	takeScreenShot(driver, "validfirstNameInputs" );
	Reporter.log("Validation messages are not displayed for- "+ dataprop.getProperty("ValidFirstName"+i));
    }
    
}

//Checking Validation message for invalid inputs for Last name
@Test
public void invalidFirstNameInputs(){
Reporter.log("Checking Validation message for invalid inputs for first name");
for(int i=0;i<=Integer.parseInt(dataprop.getProperty("InvalidUserDetailsCount"));i++) {		
	registerPage.enterFirstName(dataprop.getProperty("InvalidFirstName"+i));
	registerPage.submitForm();
	Assert.assertEquals(true, registerPage.firstNameErrorMessageDisplayed());
	takeScreenShot(driver, "invalidFirstNameInputs" );
	Reporter.log("Validation messages are not displayed for- "+ dataprop.getProperty("InvalidFirstName"+i));
    }
 
}

//Checking Validation message is not displayed for valid inputs for Last name
@Test
public void validLastNameInputs(){
	Reporter.log("Checking Validation message is not displayed for valid inputs for last name");	
for(int i=0;i<=Integer.parseInt(dataprop.getProperty("ValidUserDetailsCount"));i++) {		
	registerPage.enterlastName(dataprop.getProperty("ValidLastName"+i));
	registerPage.submitForm();
	Assert.assertEquals(false, registerPage.firstNameErrorMessageDisplayed());
	takeScreenShot(driver, "validfirstNameInputs" );
	Reporter.log("Validation messages are not displayed for- "+ dataprop.getProperty("ValidFirstName"+i));
    }
    
}

//Checking Validation message for invalid inputs for Last name
@Test
public void invalidLastNameInputs(){
Reporter.log("Checking Validation message for invalid inputs for last name");
for(int i=0;i<=Integer.parseInt(dataprop.getProperty("InvalidUserDetailsCount"));i++) {		
	registerPage.enterlastName(dataprop.getProperty("InvalidLastName"+i));
	registerPage.submitForm();
	Assert.assertEquals(true, registerPage.lastNameErrorMessageDisplayed());
	takeScreenShot(driver, "invalidLastNameInputs" );
	Reporter.log("Validation messages are not displayed for- "+ dataprop.getProperty("InvalidLastName"+i));
    }
 
}

//Checking Validation message is not displayed for valid inputs for Email
@Test
public void validEmailInputs(){
	Reporter.log("Checking Validation message is not displayed for valid inputs for Email Address");	
for(int i=0;i<=Integer.parseInt(dataprop.getProperty("ValidUserDetailsCount"));i++) {		
	registerPage.enterEmail(dataprop.getProperty("ValidEmail"+i));
	registerPage.submitForm();
	Assert.assertEquals(false, registerPage.emailErrorMessageDisplayed());
	takeScreenShot(driver, "validEmailInputs" );
	Reporter.log("Validation messages are not displayed for- "+ dataprop.getProperty("ValidEmail"+i));
    }
    
}

//Checking Validation message for invalid inputs for Email
@Test
public void invalidEmailInputs(){
Reporter.log("Checking Validation message for invalid inputs for Email Address");
for(int i=0;i<=Integer.parseInt(dataprop.getProperty("InvalidUserDetailsCount"));i++) {		
	registerPage.enterEmail(dataprop.getProperty("InvalidEmail"+i));
	registerPage.submitForm();
	Assert.assertEquals(true, registerPage.emailErrorMessageDisplayed());
	takeScreenShot(driver, "invalidEmailInputs" );
	Reporter.log("Validation messages are not displayed for- "+ dataprop.getProperty("InvalidEmail"+i));
    }
 
}


//Checking Validation message is not displayed for valid inputs for Address
@Test
public void validAddressInputs(){
	Reporter.log("Checking Validation message is not displayed for valid inputs for Address");	
for(int i=0;i<=Integer.parseInt(dataprop.getProperty("ValidUserDetailsCount"));i++) {		
	registerPage.enterAddress(dataprop.getProperty("ValidAddress"+i));
	registerPage.submitForm();
	Assert.assertEquals(false, registerPage.addressErrorMessageDisplayed());
	takeScreenShot(driver, "validAddressInputs" );
	Reporter.log("Validation messages are not displayed for- "+ dataprop.getProperty("ValidAddress"+i));
    }
    
}

//Checking Validation message for invalid inputs for Address
@Test
public void invalidAddressInputs(){
Reporter.log("Checking Validation message for invalid inputs for Address");
for(int i=0;i<=Integer.parseInt(dataprop.getProperty("InvalidUserDetailsCount"));i++) {		
	registerPage.enterAddress(dataprop.getProperty("InvalidAddress"+i));
	registerPage.submitForm();
	Assert.assertEquals(true, registerPage.addressErrorMessageDisplayed());
	takeScreenShot(driver, "invalidAddressInputs" );
	Reporter.log("Validation messages are not displayed for- "+ dataprop.getProperty("InvalidAddress"+i));
    }
}

//Checking Validation message is not displayed for valid inputs for Country
@Test
public void validCountryInputs(){
	Reporter.log("Checking Validation message is not displayed for valid country selection");	
for(int i=0;i<=Integer.parseInt(dataprop.getProperty("ValidUserDetailsCount"));i++) {		
	registerPage.countrySelect(dataprop.getProperty("ValidCountry"+i));
	registerPage.submitForm();
	Assert.assertEquals(false, registerPage.countryErrorMessageDisplayed());
	takeScreenShot(driver, "validCountryInputs" );
	Reporter.log("Validation messages are not displayed for- "+ dataprop.getProperty("ValidCountry"+i));
    }
    
}

//Checking Validation message for invalid inputs for country
@Test
public void invalidCountryInputs(){
Reporter.log("Checking Validation message for invalid country selections");
	registerPage.submitForm();
	Assert.assertEquals(true, registerPage.countryErrorMessageDisplayed());
	takeScreenShot(driver, "invalidCountryInputs" );
}

//Checking Validation message is not displayed for valid inputs for State
@Test
public void validStateInputs(){
	Reporter.log("Checking Validation message is not displayed for valid country selection");	
for(int i=0;i<=Integer.parseInt(dataprop.getProperty("ValidUserDetailsCount"));i++) {		
	registerPage.stateSelect(dataprop.getProperty("ValidCountry"+i));
	registerPage.submitForm();
	Assert.assertEquals(false, registerPage.stateErrorMessageDisplayed());
	takeScreenShot(driver, "validStateInputs" );
	Reporter.log("Validation messages are not displayed for- "+ dataprop.getProperty("ValidCountry"+i));
    }
    
}

//Checking Validation message for invalid inputs for state
@Test
public void invalidStateInputs(){
Reporter.log("Checking Validation message for invalid country selections");	
	registerPage.submitForm();
	Assert.assertEquals(true, registerPage.stateErrorMessageDisplayed());
	takeScreenShot(driver, "invalidStateInputs" ); 
}

//Checking Validation message is not displayed for valid inputs for Zip
@Test
public void validZipInputs(){
	Reporter.log("Checking Validation message is not displayed for valid zip");	
for(int i=0;i<=Integer.parseInt(dataprop.getProperty("ValidUserDetailsCount"));i++) {		
	registerPage.enterZip(dataprop.getProperty("ValidZip"+i));
	registerPage.submitForm();
	Assert.assertEquals(false, registerPage.zipErrorMessageDisplayed());
	takeScreenShot(driver, "validZipInputs" );
	Reporter.log("Validation messages are not displayed for- "+ dataprop.getProperty("ValidZip"+i));
    }
    
}

//Checking Validation message for invalid inputs for Zip
@Test
public void invalidZipInputs(){
	for(int i=0;i<=Integer.parseInt(dataprop.getProperty("InvalidUserDetailsCount"));i++) {		
		registerPage.enterZip(dataprop.getProperty("InvalidZip"+i));
		registerPage.submitForm();
		Assert.assertEquals(true, registerPage.zipErrorMessageDisplayed());
		takeScreenShot(driver, "invalidZipInputs" );
		Reporter.log("Validation messages are  displayed for- "+ dataprop.getProperty("InvalidZip"+i));
	    }
}


//Page Refresh for form refresh
@AfterMethod
public void pageRefresh() {
	driver.navigate().refresh();
}

//End of Execution. Driver Quit
@AfterTest
public void tearDown() {
	driver.quit();
	driver = null;
}
}


