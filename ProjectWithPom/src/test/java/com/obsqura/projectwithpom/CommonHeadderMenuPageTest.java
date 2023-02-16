package com.obsqura.projectwithpom;

import org.testng.annotations.Test;

import pages.CommonHeadderMenuPage;

public class CommonHeadderMenuPageTest extends Base {
	CommonHeadderMenuPage commonHeadderMenuPageObj;
	@Test
	public void verifyMainMenuClick() {
		commonHeadderMenuPageObj=new CommonHeadderMenuPage(driver);
		commonHeadderMenuPageObj.mainMenuClick("INPUT FORM");	
	}
	@Test
	public void verifyLeftSideMenuClick() {
		commonHeadderMenuPageObj=new CommonHeadderMenuPage(driver);
		commonHeadderMenuPageObj.leftSideMenuClick("Radio Buttons Demo");	
	}

}
