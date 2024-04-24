package testData;

import org.testng.annotations.DataProvider;

public class LoginTestData {
	
	@DataProvider (name="positive login data")
	public String[][] positiveLoginTestData() {
		String [][] data = {{"test12", "test@12"}};
		return data;
	}
	
	@DataProvider (name="negative login data")
	public String[][] negativeLoginTestData() {
		String [][] data = {{"test123", "test@123"}};
		return data;
	}

}
