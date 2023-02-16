package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonHeadderMenuPage {
	WebDriver driver;
	By topMenu=By.xpath("//ul[@class='navbar-nav']//child::a[@class='nav-link']");
	By leftSideMenu=By.xpath("//li[@class='list-group-item']//a");
	public CommonHeadderMenuPage(WebDriver driver) {
		this.driver=driver;
	}
	public void mainMenuClick(String name) {
		List<WebElement>menuItem=driver.findElements(topMenu);
		for(WebElement menu:menuItem) {
			if(menu.getText().equalsIgnoreCase(name)){
				menu.click();
				break;
			}
		}
	}
	public void leftSideMenuClick(String name) {
		List<WebElement>pageMenu=driver.findElements(leftSideMenu);
		for(WebElement pageMenuClick:pageMenu) {
			if(pageMenuClick.getText().equalsIgnoreCase(name)) {
				pageMenuClick.click();
				break;
			}
		}
	}

}
