package pages;

import java.time.Duration;
import utilities.WaitUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WaitPages {
	public WebDriver driver;
	By enterMessage=By.xpath("//input[@id='single-input-field']");
	By showMessageButton=By.xpath("//button[@id='button-one']");
	By radioButton=By.xpath("//input[@id='inlineRadio1']");
	By femaleRadioButton=By.xpath("//input[@id='inlineRadio2']");
	By message=By.xpath("//form[@method='POST']//child::div[@id='message-one']");
	By dropDown=By.xpath("//select[@id='single-input-field']");
	By messageDropdown=By.xpath("//div[@id='message-one']");

	public WaitPages(WebDriver driver) {
		this.driver=driver;
	}
	public void singleInput() {
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WaitUtility.titleContains(driver, "simple-form-d");
		WaitUtility.titleIs(driver, "Obsqura Testing");
		WaitUtility.waitForElementVisibilityOfElementLocated(driver, enterMessage);
		driver.findElement(enterMessage).sendKeys("Apple");
		boolean button=driver.findElement(showMessageButton).isEnabled();
		if(button) {
			WaitUtility.waitForElementClickable(driver, showMessageButton);
			driver.findElement(showMessageButton).click();
		}
		boolean messageDisplayed=driver.findElement(message).isDisplayed();
		if(messageDisplayed) {
			String actual=driver.findElement(message).getText();
			wait.until(ExpectedConditions.textToBePresentInElementLocated(message, actual));
		}
	}
	public void button() {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		boolean radioSelected=driver.findElement(radioButton).isSelected();
			if(radioSelected==false) {
				WebElement radioButtonWeb=driver.findElement(radioButton);
				WaitUtility.waitForElementClickable(driver, radioButtonWeb);
				radioButtonWeb.click();
			}	
	}
	public void femaleButton() {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		boolean femaleButtonSelected=driver.findElement(femaleRadioButton).isEnabled();
			if(femaleButtonSelected) {
				WebElement femaleRadioButtobWeb=driver.findElement(femaleRadioButton);
				femaleRadioButtobWeb.click();
				WaitUtility.waitForElementSelected(driver, femaleRadioButtobWeb);
			}
	}
	public void dropDownClick() {
		String actualMessage,expectedMessage="Selected Color : Red";
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		boolean dropDownSelect=driver.findElement(dropDown).isEnabled();
		boolean message=driver.findElement(messageDropdown).isDisplayed();
			if(dropDownSelect) {
				wait.until(ExpectedConditions.presenceOfElementLocated(dropDown));
				Select selectObj=new Select(driver.findElement(dropDown));
				selectObj.selectByVisibleText("Red");
				wait.until(ExpectedConditions.textToBePresentInElementLocated(messageDropdown, "Selected Color : Red"));
			}
			if(message) {
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(messageDropdown));
				actualMessage=driver.findElement(messageDropdown).getText();
				Assert.assertEquals(actualMessage, expectedMessage, "Not Correct");
			}
	}

}
