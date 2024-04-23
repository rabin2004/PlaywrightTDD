package testPkg;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePkg.BaseMain;
import pageFactory.ConditionOfUsePage;

public class ConditionOfUsePageTest extends BaseMain{
	ConditionOfUsePage cop;
	
	@BeforeMethod
	public void loadBrowser() {
		initialization();
		cop = new ConditionOfUsePage();
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
	
	@Test
	public void conditionsOfUsePageHeaderTest() {
		cop.clickConditionOfUseLink();
		Assert.assertTrue(cop.validatingConditionsOfUseHeader());
	}
	
	@Test
	public void conditionsOfUsePageHeaderTxtTest() {
		cop.clickConditionOfUseLink();
		Assert.assertEquals("Conditions of Use", cop.returnConditionsOfUseHeaderTTxt());
	}

}
