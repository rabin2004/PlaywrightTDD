package pageFactory;

import com.microsoft.playwright.Locator;

import basePkg.BaseMain;

public class LoginPage extends BaseMain{
//	 page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Conditions of Use")).click();
//     page.getByLabel("Amazon", new Page.GetByLabelOptions().setExact(true)).click();
	Locator userNameTxtField;
	Locator passwordTxtField;
	Locator submitBtn;
	
	public LoginPage() {
		this.userNameTxtField = page.locator("//input[@name='userName']");
		this.passwordTxtField = page.locator("//input[@name='password']");
		this.submitBtn = page.locator("//input[@name='submit']");	
	}
	
	public void enterUsernameTxtField(String username) {
		userNameTxtField.fill(username);
	}
	
	public void enterPasswordTxtField(String password) {
		passwordTxtField.fill(password);
	}
	
	public void clickSubmitBtn() {
		submitBtn.click();
	}
	
	

}
