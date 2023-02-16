package com.obsqura.projectwithpom;

import java.io.IOException;

import org.testng.annotations.Test;
import pages.SelectInputPage;

public class SelectInputPageTest extends Base {
	SelectInputPage selectInputPageObj;
	@Test(groups= {"smoke"})
	public void selectColorAndVerifySelectMultipleInputColor() throws IOException {
	SelectInputPage selectInputPageObj = new SelectInputPage(driver);
	selectInputPageObj.verifySelectInputPage();
	selectInputPageObj.verifySelectMultipleInputColor();
	}
	
	

}
