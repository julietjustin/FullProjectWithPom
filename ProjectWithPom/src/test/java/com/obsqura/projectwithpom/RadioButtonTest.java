package com.obsqura.projectwithpom;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.RadioButtonPage;

public class RadioButtonTest extends Base {
	RadioButtonPage RadioButtonPageobj;
	@Test(groups= {"regretion"})
	//@Test
	public void VerifyRadioButton() throws IOException {
		RadioButtonPageobj=new RadioButtonPage(driver); 
		RadioButtonPageobj.donotSelectRadioButton();	
	}
	@Test(alwaysRun=true)
	public void VerifyMaleButton() throws IOException {
		RadioButtonPageobj=new RadioButtonPage(driver); 
		RadioButtonPageobj.selectMaleRadio();	
	}
	@Test(groups= {"smoke"})
	public void VerifyFemaleButton() throws IOException {
		RadioButtonPageobj=new RadioButtonPage(driver); 
		RadioButtonPageobj.selectFemaleRadio();	
	}

}

