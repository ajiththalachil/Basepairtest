package TestPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends Utilities {
WebDriver driver;	
/*******WebElements************/
@FindBy(id="firstName")
private WebElement firstName;

@FindBy(id="lastName")
private WebElement lastName;

@FindBy(id="email")
private WebElement email;

@FindBy(id="address")
private WebElement address;

@FindBy(id="address2")
private WebElement address2;

@FindBy(xpath="//select[@id='country']")
private WebElement country;

@FindBy(xpath="//select[@id='state']")
private WebElement state;

@FindBy(id="zip")
private WebElement zip;

@FindBy(id="save-info")
private WebElement tcCheckbox;

@FindBy(xpath="//button[@type='submit']")
private WebElement submitButton;
/**********Error Messages*****************/

@FindBy(xpath="//label[@for='firstName']/following-sibling::div")
private List<WebElement> firstNameErrorMessage;

@FindBy(xpath="//label[@for='lastName']/following-sibling::div")
private List<WebElement> lastNameErrorMessage;

@FindBy(xpath="//label[@for='email']/following-sibling::div")
private List<WebElement> emailErrorMessage;

@FindBy(xpath="//label[@for='address']/following-sibling::div")
private List<WebElement> addressErrorMessage;

@FindBy(xpath="//label[@for='country']/following-sibling::div")
private List<WebElement> countryErrorMessage;

@FindBy(xpath="//label[@for='state']/following-sibling::div")
private List<WebElement> stateErrorMessage;

@FindBy(xpath="//label[@for='zip']/following-sibling::div")
private List<WebElement> zipErrorMessage;




public RegisterPage(WebDriver driver) {
	this.driver = driver;
}
/****************Error Message Display check methods**************/
public boolean firstNameErrorMessageDisplayed() {
	if(firstNameErrorMessage.size()==0) {
		 return false;}
	 else {return true;}
}


public boolean lastNameErrorMessageDisplayed() {
	if(lastNameErrorMessage.size()==0) {
		 return false;}
	 else {return true;}
}

public boolean emailErrorMessageDisplayed() {
	if(emailErrorMessage.size()==0) {
		 return false;}
	 else {return true;}
}

public boolean addressErrorMessageDisplayed() {
	if(addressErrorMessage.size()==0) {
		 return false;}
	 else {return true;}
}

public boolean countryErrorMessageDisplayed() {
	if(countryErrorMessage.size()==0) {
		 return false;}
	 else {return true;}
}

public boolean stateErrorMessageDisplayed() {
	if(stateErrorMessage.size()==0) {
		 return false;}
	 else {return true;}
}

public boolean zipErrorMessageDisplayed() {
	if(zipErrorMessage.size()==0) {
		 return false;}
	 else {return true;}
}
/**********************Form Fill Methods**********************************/

public void enterFirstName(String firstNameInput) {
	firstName.sendKeys(firstNameInput);
}

public void enterlastName(String lastNameInput) {
	lastName.sendKeys(lastNameInput);
}

public void enterEmail(String emailInput) {
	email.sendKeys(emailInput);
}

public void enterAddress(String addressInput) {
	address.sendKeys(addressInput);
}

public void countrySelect(String countrySelection) {
	Select selection = new Select(country);
	selection.selectByVisibleText(countrySelection);
}

public void stateSelect(String stateSelection) {
	Select selection = new Select(state);
	selection.selectByVisibleText(stateSelection);
}

public void enterZip(String zipInput) {
	zip.sendKeys(zipInput);	
}

public void selectTC() {
	tcCheckbox.click();
}

public void submitForm() {
	submitButton.click();
}

}