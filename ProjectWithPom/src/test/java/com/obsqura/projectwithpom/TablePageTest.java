package com.obsqura.projectwithpom;

import java.io.IOException;

import org.testng.annotations.Test;
import com.obsqura.projectwithpom.SimpleFormDemoTest;

import pages.CommonHeadderMenuPage;
import pages.TablePage;

public class TablePageTest extends Base{
	TablePage tablePageObj;
	CommonHeadderMenuPage commonHeadderMenuPageObj;
	
	//@Test
	public void verifyGetColoumn() throws IOException {
		commonHeadderMenuPageObj=new CommonHeadderMenuPage(driver);
		commonHeadderMenuPageObj.mainMenuClick("Table");
		tablePageObj=new TablePage(driver);
		tablePageObj.getColoumn();
	}
	@Test
	public void verifyGetRow() throws IOException {
		commonHeadderMenuPageObj=new CommonHeadderMenuPage(driver);
		commonHeadderMenuPageObj.mainMenuClick("Table");
		tablePageObj=new TablePage(driver);
		tablePageObj.getRow();
	}

}
