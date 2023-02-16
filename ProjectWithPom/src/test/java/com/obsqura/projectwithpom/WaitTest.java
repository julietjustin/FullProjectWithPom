package com.obsqura.projectwithpom;

import org.testng.annotations.Test;

import pages.WaitPages;

public class WaitTest extends Base {
	WaitPages waitPagesObj;
	@Test
	public void verify() {
		WaitPages waitPagesObj=new WaitPages(driver);
		waitPagesObj.button();
	}
	@Test
	public void verifySingle() {
		WaitPages waitPagesObj=new WaitPages(driver);
		waitPagesObj.singleInput();
	}
	@Test
	public void verifyDropDownClick() {
		WaitPages waitPagesObj=new WaitPages(driver);
		waitPagesObj.dropDownClick();
	}
	@Test
	public void verifyFemaleRadioButton() {
		WaitPages waitPagesObj=new WaitPages(driver);
		waitPagesObj.femaleButton();
	}
}
