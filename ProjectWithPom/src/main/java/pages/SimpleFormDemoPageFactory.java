package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import utilities.PageUtility;
import utilities.WaitUtility;

public class SimpleFormDemoPageFactory{
	public WebDriver driver;
	
	public SimpleFormDemoPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@id='single-input-field']")
	private WebElement enterMessageField;
	
	@FindBy(xpath="//button[@id='button-one']")
	private WebElement showMessageButton;
	
	@FindBy(xpath="//div[@id='message-one']")
	private WebElement yourMessage;
	
	public void verifySingleInputField() {
		String inputMessage="Apple",actualMessage;
		String expectedMessage="Your Message : "+inputMessage;
		PageUtility.enterText(enterMessageField, inputMessage);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(showMessageButton));
		PageUtility.clickOnElement(showMessageButton);
		WaitUtility.fluentVisibilityOfAllElements(driver, yourMessage);
		actualMessage=PageUtility.getElementText(yourMessage);
		Assert.assertEquals(actualMessage, expectedMessage, "Message Is Not Same");
	}

}
