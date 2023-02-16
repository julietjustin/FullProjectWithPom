package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.ExcelUtility;

public class TablePageWithScope {
	public ExcelUtility excelUtilityObj;
	WebDriver driver;
	By table=By.xpath("//table[@id='dtBasicExample']");
	By tableRow=By.xpath("//table[@id='dtBasicExample']//child::tbody//tr");
	By tableColoumn=By.xpath("//tr[@role='row']//child::th");
	public TablePageWithScope(WebDriver driver) {
		this.driver=driver;
	}
	public void tableLocate() {
		WebElement Table=driver.findElement(table);
		List<WebElement>coloumn=Table.findElements(tableColoumn);
		int coloumnCount=coloumn.size();
		System.out.println(coloumnCount);
		for(int i=0;i<coloumn.size();i++) {
			WebElement name=coloumn.get(i);
			System.out.println(name.getText());
		}
		List<WebElement>row=Table.findElements(tableRow);
		int rowCount=row.size();
		System.out.println(rowCount);
		for(int j=0;j<coloumn.size();j++) {
			WebElement Row=row.get(j);
			String output=Row.getText();
			System.out.println(output);
			String input=excelUtilityObj.ReadDataFromExcel(0, 0);
			if(output.equals(input)) {
				System.out.println(Row);
			}
		}

			

		
	
	
	}
}
