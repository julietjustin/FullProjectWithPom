package pages;

import java.io.IOException;
import utilities.WaitUtility;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import utilities.ExcelUtility;

public class SelectInputPage {
	public WebDriver driver;
		By selectInputField = By.xpath("//select[@id='single-input-field']");
		By actualMessage = By.xpath("//div[@id='message-one']");
		By multipleInputField = By.xpath("//select[@id='multi-select-field']");
		By getFirstSelectedButton = By.xpath("//button[@id='button-first']");
		By getAllSelectedButton = By.xpath("//button[@id='button-all']");
		By multipleActualMessage = By.xpath("//div[@id='message-two']");
	public SelectInputPage(WebDriver driver) {
		this.driver=driver;
	}
	public void verifySelectInputPage() throws IOException {
		ExcelUtility obj=new ExcelUtility();
		String actualText,expectedText="Selected Color : Red";
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		WaitUtility.fluentWaitForElementToBeClickable(driver, selectInputField);//given fluent wait
		Select inputSelect = new Select(driver.findElement(selectInputField));
		inputSelect.selectByVisibleText(obj.ReadDataFromExcel(0,0));
		actualText=driver.findElement(actualMessage).getText();
		Assert.assertEquals(actualText, expectedText, "Not Correct Colour Displayed");

	}
	public void verifySelectMultipleInputColor() throws IOException {
		String actualText,expectedText="All selected colors are : Red,Yellow,Green";
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select multipleSelect = new Select(driver.findElement(multipleInputField));
		ExcelUtility obj=new ExcelUtility();
		multipleSelect.isMultiple();
		multipleSelect.selectByVisibleText(obj.ReadDataFromExcel(0,0));
		multipleSelect.selectByVisibleText(obj.ReadDataFromExcel(1,0));
		multipleSelect.selectByVisibleText(obj.ReadDataFromExcel(2,0));
		driver.findElement(getAllSelectedButton).click();
		WaitUtility.fluentTextToBePresentInElementLocated(driver, multipleActualMessage, expectedText);
		actualText=driver.findElement(multipleActualMessage).getText();
		Assert.assertEquals(actualText, expectedText, "Not Displayed");
	}

}
