package pageFactory;

import com.microsoft.playwright.Locator;

import basePkg.BaseMain;

public class HomePage extends BaseMain {
	Locator loginErrorMsg;
	
	public HomePage() {
		this.loginErrorMsg = page.getByText("Enter your userName and password correct");
	}
	
	public String returnLoginErrorMsg() {
		return loginErrorMsg.textContent();
	}
}
