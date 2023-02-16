package com.obsqura.projectwithpom;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.CommonHeadderMenuPage;
import pages.FormSubmitPage;
import utilities.DataProviderUtility;

public class FormSubmitPageTest extends Base{
	CommonHeadderMenuPage commonHeadderMenuPageObj;
	FormSubmitPage formSubmitPageObj;
	@Test(dataProvider="FormSubmitDataProvider",dataProviderClass=DataProviderUtility.class)
	public void verifyFormSubmitPage(String firstName, String lastName, String userName, String city, String state, String zip) throws IOException {
		commonHeadderMenuPageObj=new CommonHeadderMenuPage(driver);
		commonHeadderMenuPageObj.leftSideMenuClick("Form Submit");
		formSubmitPageObj=new FormSubmitPage(driver);
		formSubmitPageObj.formSubmitPageDataProvider(firstName,lastName,userName,city,state,zip);
		
		
		
	}

}
