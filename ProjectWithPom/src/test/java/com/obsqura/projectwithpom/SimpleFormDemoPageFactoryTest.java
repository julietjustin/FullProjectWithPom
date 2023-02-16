package com.obsqura.projectwithpom;

import org.testng.annotations.Test;

import pages.SimpleFormDemoPageFactory;

public class SimpleFormDemoPageFactoryTest extends Base {
	SimpleFormDemoPageFactory simpleFormDemoPageFactoryObj;
	@Test
	public void checkAndVerifySingleInputField() {
		simpleFormDemoPageFactoryObj=new SimpleFormDemoPageFactory(driver);
		simpleFormDemoPageFactoryObj.verifySingleInputField();
		}

}
