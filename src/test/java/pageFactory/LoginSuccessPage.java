package pageFactory;

import com.microsoft.playwright.Locator;

import basePkg.BaseMain;

public class LoginSuccessPage extends BaseMain{
	Locator loginSuccessMsg;
	
	public LoginSuccessPage() {
		this.loginSuccessMsg = page.getByText("Login Successfully");
	}
	
	public boolean validateLoginSuccessHeader() {
		return loginSuccessMsg.isVisible();
	}
}
