package testPkg;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePkg.BaseMain;
import pageFactory.HomePage;
import pageFactory.LoginPage;
import pageFactory.LoginSuccessPage;

public class LoginTest extends BaseMain{
	LoginPage lp;
	HomePage hp;
	LoginSuccessPage lsp;
	
	@BeforeMethod
	public void loadBrowser() {
		initialization();
		lp = new LoginPage();
		hp = new HomePage();
		lsp = new LoginSuccessPage();
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
	
	@Test(dataProviderClass=testData.LoginTestData.class, 
			dataProvider="positive login data")
	public void positiveLoginTest(String username, String password) {
		lp.enterUsernameTxtField(username);
		lp.enterPasswordTxtField(password);
		lp.clickSubmitBtn();
		Assert.assertEquals(prop.getProperty("loginErrorMsg"), hp.returnLoginErrorMsg());
	}
	
	@Test(dataProviderClass=testData.LoginTestData.class, 
			dataProvider="negative login data")
	public void negativeLoginTest(String username, String password) {
		lp.enterUsernameTxtField(username);
		lp.enterPasswordTxtField(password);
		lp.clickSubmitBtn();
		Assert.assertTrue(lsp.validateLoginSuccessHeader());
	}

}
