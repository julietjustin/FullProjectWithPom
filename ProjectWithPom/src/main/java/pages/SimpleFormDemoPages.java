package pages;

import java.time.Duration;
import java.util.List;

import utilities.PageUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.WaitUtility;

public class SimpleFormDemoPages {
	public WebDriver driver;
	By enterMessageField=By.xpath("//input[@id='single-input-field']");
	By showMessageButton=By.xpath("//button[@id='button-one']");
	By yourMessage=By.xpath("//div[@id='message-one']");
	public SimpleFormDemoPages(WebDriver driver) {
		this.driver=driver;
	}
	public void verifySingleInputField() {
		String inputMessage="Apple",actualMessage;
		String expectedMessage="Your Message : "+inputMessage;
		WebElement enterMessage=driver.findElement(enterMessageField);
		PageUtility.enterText(enterMessage, inputMessage);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(showMessageButton));
		WebElement showButton=driver.findElement(showMessageButton);
		PageUtility.clickOnElement(showButton);
		WaitUtility.fluentVisibilityOfAllElements(driver, yourMessage);
		WebElement getMessage=driver.findElement(yourMessage);
		actualMessage=PageUtility.getElementText(getMessage);
		Assert.assertEquals(actualMessage, expectedMessage, "Message Is Not Same");
	}
	public void dragAndDrop() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		Actions action=new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//li[@class='list-group-item']//child::a[@href='drag-drop.php']"));
	}
	
	

}
