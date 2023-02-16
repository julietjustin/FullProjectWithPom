package com.obsqura.projectwithpom;

import org.testng.annotations.Test;

import pages.OthersPage;

public class OthersPageTest extends Base {
	OthersPage othersPageObj;
	//@Test
	public void verifyDragDrop() {
		OthersPage othersPageObj=new OthersPage(driver);
		othersPageObj.dragAndDrop();
	}
	//@Test
	public void verifyMouseOver() {
		OthersPage othersPageObj=new OthersPage(driver);
		othersPageObj.mouseHOver();
	}
	//@Test
	public void verifyClick() {
		OthersPage othersPageObj=new OthersPage(driver);
		othersPageObj.clickFirstLink();
	}
	//@Test
	public void verifyRightClick() {
		OthersPage othersPageObj=new OthersPage(driver);
		othersPageObj.rightClick();
	}
	@Test
	public void verifyDoubleClick() {
		OthersPage othersPageObj=new OthersPage(driver);
		othersPageObj.doubleClick();
	}

}
