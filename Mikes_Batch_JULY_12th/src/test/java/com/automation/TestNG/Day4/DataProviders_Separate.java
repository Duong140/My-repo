package com.automation.TestNG.Day4;

import org.testng.annotations.DataProvider;

public class DataProviders_Separate {
	
	@DataProvider
	public Object[][] getRediffData() {
	Object[][] data = { { "seleniumpanda@rediffmail.com", "Selenium@123" },
						{ "seleniumpanda1@rediffmail.com", "Donkey@123"}
																		};
	
	return data;
}

@DataProvider
public Object[][] getTNData() {
	Object[][] data = { { "seleniumpanda@rediffmail.com", "Selenium@123" },
						{ "seleniumpanda1@rediffmail.com", "Donkey@123"}
																		};
	
	return data;
}

}
