package pageFactory;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import basePkg.BaseMain;

public class ConditionOfUsePage extends BaseMain{
//	 page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Conditions of Use")).click();
//     page.getByLabel("Amazon", new Page.GetByLabelOptions().setExact(true)).click();
	Locator conditionsOfUseLink;
	Locator conditionsOfUseHeader;
	
	public ConditionOfUsePage() {
		this.conditionsOfUseLink = page.getByRole(AriaRole.LINK, 
				new Page.GetByRoleOptions().setName("Conditions of Use"));
		this.conditionsOfUseHeader = page.getByRole(AriaRole.HEADING, 
				new Page.GetByRoleOptions().setName("Conditions of Use"));
	}
	
	public void clickConditionOfUseLink() {
		conditionsOfUseLink.click();
	}
	
	public boolean validatingConditionsOfUseHeader() {
		return conditionsOfUseHeader.isVisible();
	}
	
	public String returnConditionsOfUseHeaderTTxt() {
		return conditionsOfUseHeader.textContent();
	}

}
