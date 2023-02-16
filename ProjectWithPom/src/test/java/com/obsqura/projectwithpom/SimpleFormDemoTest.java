package com.obsqura.projectwithpom;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.SimpleFormDemoPages;

public class SimpleFormDemoTest extends Base{
	SimpleFormDemoPages simpleFormDemoPagesObj;
	@Test
	public void enterMessageAndVerifySingleInputField() {
		simpleFormDemoPagesObj=new SimpleFormDemoPages(driver);
		simpleFormDemoPagesObj.verifySingleInputField();
	}
	@Test
	public void verifyDragAndDrop() {
		simpleFormDemoPagesObj=new SimpleFormDemoPages(driver);
		simpleFormDemoPagesObj.dragAndDrop();
	}
	

}
