package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BootstrapAlertPage {
	WebDriver driver;
	By normalSuccessButton=By.xpath("//button[@id='normal-btn-success']");
	By normalWarningButton=By.xpath("//button[@id='normal-btn-warning']");
	By normalDangerButton=By.xpath("//button[@id='normal-btn-danger']");
	By normalInfoButton=By.xpath("//button[@id='normal-btn-info']");
	By normalSuccessClose=By.xpath("//div[@class='alert alert-success alert-normal-success']//child::button");
	By normalWarningClose= By.xpath("//div[@class='alert alert-warning alert-normal-warning']//child::button");
	By normalDangerClose=By.xpath("//div[@class='alert alert-danger alert-normal-danger']//child::button");
	By normalInfoClose=By.xpath("//div[@class='alert alert-info alert-normal-info']//child::button");
	public BootstrapAlertPage(WebDriver driver) {
		this.driver=driver;
	}
	public void bootStrapAlert() {
		WebElement normalSuccess=driver.findElement(normalSuccessButton);
		normalSuccess.click();
		WebElement successClose=driver.findElement(normalSuccessClose);
		successClose.click();
		
		WebElement normalWarning=driver.findElement(normalWarningButton);
		normalWarning.click();
		WebElement warningClose=driver.findElement(normalWarningClose);
		warningClose.click();
		
		WebElement normalDanger=driver.findElement(normalDangerButton);
		normalDanger.click();
		WebElement dangerClose=driver.findElement(normalDangerClose);
		dangerClose.click();
		
		WebElement normalInfo=driver.findElement(normalInfoButton);
		normalInfo.click();
		WebElement infoClose=driver.findElement(normalInfoClose);
		infoClose.click();
	}
	

}
