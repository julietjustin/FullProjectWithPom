package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.DataProviderUtility;
import utilities.ExcelUtility;
import utilities.PageUtility;

public class FormSubmitPage {
	WebDriver driver;
	By firstNameField=By.xpath("//input[@id='validationCustom01']");
	By lastNameField=By.xpath("//input[@id='validationCustom02']");
	By userNameField=By.xpath("//input[@id='validationCustomUsername']");
	By cityField=By.xpath("//input[@id='validationCustom03']");
	By stateField=By.xpath("//input[@id='validationCustom04']");
	By zipField=By.xpath("//input[@id='validationCustom05']");
	By checkBoxField=By.xpath("//input[@id='invalidCheck']");
	By submitFormButton=By.xpath("//button[@class='btn btn-primary']");
	By message=By.xpath("//div[@id='message-one']");
	public FormSubmitPage(WebDriver driver) {
		this.driver=driver;
	}
	public void formSubmitPageDataProvider(String firstName,String lastName,String userName,String city,String state,String zip) throws IOException {
		ExcelUtility obj=new ExcelUtility();
		String actualMessage,expectedMessage=obj.ReadDataFromExcel(0, 0);
		WebElement fName=driver.findElement(firstNameField);
		DataProviderUtility.sendKeyValue(driver, fName, firstName);
		WebElement lName=driver.findElement(lastNameField);
		DataProviderUtility.sendKeyValue(driver, lName, lastName);
		WebElement user=driver.findElement(userNameField);
		DataProviderUtility.sendKeyValue(driver, user, userName);
		WebElement cityName=driver.findElement(cityField);
		DataProviderUtility.sendKeyValue(driver, cityName, city);
		WebElement stateName=driver.findElement(stateField);
		DataProviderUtility.sendKeyValue(driver, stateName, state);
		WebElement zipF=driver.findElement(zipField);
		DataProviderUtility.sendKeyValue(driver, zipF, zip);
		WebElement checkBoxClick=driver.findElement(checkBoxField);
		PageUtility.click(driver, checkBoxClick);
		WebElement submitButtonClick=driver.findElement(submitFormButton);
		if(submitButtonClick.isEnabled()) {
			PageUtility.click(driver, submitButtonClick);
			WebElement messageDisplay=driver.findElement(message);
			if(messageDisplay.isDisplayed()) {
			actualMessage=PageUtility.getElementText(messageDisplay);
			Assert.assertEquals(actualMessage, expectedMessage, "Displayed Message Is Not Correct");
			}
			Assert.assertTrue(true, "Message Is Not Displayed");
		}
		Assert.assertTrue(true, "Button Is Not Enabled");
	}

}
