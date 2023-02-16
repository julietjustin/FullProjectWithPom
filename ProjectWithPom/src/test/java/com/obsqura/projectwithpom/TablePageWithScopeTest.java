package com.obsqura.projectwithpom;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.CommonHeadderMenuPage;
import pages.TablePage;
import pages.TablePageWithScope;

public class TablePageWithScopeTest extends Base{
	TablePageWithScope tablePageWithScopeObj;
	CommonHeadderMenuPage commonHeadderMenuPageObj;
	
	@Test
	public void verifyTableLocate() throws IOException {
		commonHeadderMenuPageObj=new CommonHeadderMenuPage(driver);
		commonHeadderMenuPageObj.mainMenuClick("Table");
		tablePageWithScopeObj=new TablePageWithScope(driver);
		tablePageWithScopeObj.tableLocate();
	}

}
