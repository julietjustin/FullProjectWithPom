package com.obsqura.projectwithpom;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.BootstrapAlertPage;
import pages.CommonHeadderMenuPage;

public class BootstrapAlertPageTest extends Base {
	BootstrapAlertPage bootstrapAlertPageobj;
	CommonHeadderMenuPage commonHeadderMenuPageObj;
	@Test
	public void verifyBootStrapAlert() {
		commonHeadderMenuPageObj=new CommonHeadderMenuPage(driver);
		commonHeadderMenuPageObj.mainMenuClick("Alerts and Modals");
		commonHeadderMenuPageObj.leftSideMenuClick("Bootstrap Alert");
		bootstrapAlertPageobj=new BootstrapAlertPage(driver);
		bootstrapAlertPageobj.bootStrapAlert();
	}
	

}
