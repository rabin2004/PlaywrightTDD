package basePkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseMain {
	public Playwright playwright;
	public Browser browser;
	public static Page page;
	public Properties prop;

	public BaseMain() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\User\\"
					+ "eclipse-workspace\\PlaywrightTDD\\src\\main\\java\\configPkg"
					+ "\\config.properties");
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void initialization() {
		playwright = Playwright.create();
		LaunchOptions option = new LaunchOptions();
		option.setChannel(prop.getProperty("chrome"));
		option.setHeadless(false);
		browser = playwright.chromium().launch(option);
		page = browser.newPage();
		page.navigate(prop.getProperty("testURL"));
	}
	
	public void tearDown() {
		browser.close();
		playwright.close();
	}
}
