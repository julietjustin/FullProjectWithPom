package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.PageUtility;
import utilities.WaitUtility;
public class OthersPage {
	public WebDriver driver;
	By dragAndDrop=By.xpath("//li[@class='list-group-item']//child::a[@href='drag-drop.php']");
	By dragDropFirst=By.xpath("//span[text()='Draggable n°1']");
	By dragDropFirstTo=By.xpath("//div[@id='mydropzone']");
	By droppedItemListItem=By.xpath("//div[@id='mylist']//child::span");
	public OthersPage(WebDriver driver) {
		this.driver=driver;
	}
	public void dragAndDrop() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement dragAndDropElement = driver.findElement(dragAndDrop);
		PageUtility.clickAndHoldOnElement(dragAndDropElement, driver);
	}
	public void mouseHOver() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement dragAndDropElement = driver.findElement(dragAndDrop);
		PageUtility.mouseHover(dragAndDropElement,driver);//to mouseHover
		//WebElement from=driver.findElement(dragDropFirst);
		//WebElement to=driver.findElement(dragDropFirstTo);
		//action.moveToElement(from).moveToElement(to).build().perform();
		//action.dragAndDropBy(from, 210., yOffset)
		//action.dragAndDrop(from, to).build().perform();
		//WaitUtility.waitForElementVisibilityOfElementLocated(driver, droppedItemListItem);
	}
	public void clickFirstLink() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement clickLink=driver.findElement(dragAndDrop);
		PageUtility.click(clickLink, driver);
	}
	public void rightClick() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement clickLink=driver.findElement(dragAndDrop);
		PageUtility.rightClick(clickLink, driver);
	}
	public void doubleClick() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement doubleClickLink=driver.findElement(dragAndDrop);
		PageUtility.click(doubleClickLink, driver);
	}

}
