package pages;

import java.io.IOException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utilities.ExcelUtility;
import utilities.WaitUtility;

public class RadioButtonPage {
	public WebDriver driver;
	By maleRadio=By.xpath("//input[@id='inlineRadio1']");
	By femaleRadio=By.xpath("//input[@id='inlineRadio2']");
	By showSelectedValueButton=By.xpath("//button[@id='button-one']");
	By message=By.xpath("//div[@id='message-one']");
	public RadioButtonPage(WebDriver driver) {
		this.driver=driver;
	}
	public void donotSelectRadioButton() throws IOException {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		ExcelUtility obj=new ExcelUtility();
		String actualMessage,expectedMessage=obj.ReadDataFromExcel(0,0);
		boolean clickButton=driver.findElement(showSelectedValueButton).isEnabled();
		if(clickButton) {
			WaitUtility.waitForElementClickable(driver, showSelectedValueButton);
			driver.findElement(showSelectedValueButton).click();
			Assert.assertTrue(clickButton, "Show Selected Value Button Is Not Enable");
		}
		boolean displayMessage=driver.findElement(message).isDisplayed();
		if (displayMessage) {
			WaitUtility.textToBePresentInElementLocated(driver, message, expectedMessage);
			actualMessage=driver.findElement(message).getText();
			Assert.assertEquals(actualMessage, expectedMessage, "Not Correct");    
        } 
		Assert.assertTrue(displayMessage, "Message Is Not Displayed");
	}
	public void selectMaleRadio() throws IOException {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		ExcelUtility obj=new ExcelUtility();
		String actualMessage,expectedMessage=obj.ReadDataFromExcel(1,0);
		boolean maleButton=driver.findElement(maleRadio).isEnabled();
		boolean buttonClick=driver.findElement(showSelectedValueButton).isEnabled();
		boolean messageDisplayed=driver.findElement(message).isDisplayed();
		if(maleButton==true) {
			driver.findElement(maleRadio).click();
			WaitUtility.fluentelementToBeSelected(driver, maleRadio);
		}
		Assert.assertTrue(maleButton, "Male Button Is Disabled");
		if(buttonClick==true) {
			driver.findElement(showSelectedValueButton).click();
		}
		Assert.assertTrue(buttonClick, "Show Selected Value Button Is Not Enable");
		if(messageDisplayed==true) {
			WaitUtility.textToBePresentInElementLocated(driver, message, expectedMessage);
			actualMessage=driver.findElement(message).getText();
			Assert.assertEquals(actualMessage, expectedMessage, "Not Displayed Correct Gender");
		}
		Assert.assertTrue(messageDisplayed, "Message Is Not Displayed");
	}
	public void selectFemaleRadio() throws IOException {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		ExcelUtility obj=new ExcelUtility();
		String actualMessage,expectedMessage=obj.ReadDataFromExcel(2,0);
		boolean femaleButton=driver.findElement(femaleRadio).isEnabled();
		boolean buttonClick=driver.findElement(showSelectedValueButton).isEnabled();
		boolean messageDisplayed=driver.findElement(message).isDisplayed();
		if(femaleButton==true) {
			WebElement element=driver.findElement(showSelectedValueButton);
			WaitUtility.fluentWaitForElementToBeClickable(driver, element);
			driver.findElement(femaleRadio).click();
		}
		Assert.assertTrue(femaleButton, "Female Radio Button Is Disabled ");
		if(buttonClick==true) {
			driver.findElement(showSelectedValueButton).click();	
		}
		Assert.assertTrue(buttonClick, "Show Selected Value Button Is Not Enable");
		if(messageDisplayed==true) {
			WaitUtility.textToBePresentInElementLocated(driver, message, expectedMessage);
			actualMessage=driver.findElement(message).getText();
			Assert.assertEquals(actualMessage, expectedMessage, "Not Displayed Correct Gender");
		}
		Assert.assertTrue(messageDisplayed, "Message Is Not Displayed");
	}
	
}
