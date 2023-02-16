package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

public class DataProviderUtility {
	public static void sendKeyValue(WebDriver driver,WebElement element,String inputString) {
		element.sendKeys(inputString);
	}
	@DataProvider(name="FormSubmitDataProvider")
	public static Object[][] getDataFromDataprovider(){
		return new Object[][]{
				{"Juliet","Justin","julietJustin6","Alappuzha","Kerala","688505"},
				{"Justin","Peter","justinpeter6","Alappuzha","Kerala","688530"},
				};
	}
	

}
