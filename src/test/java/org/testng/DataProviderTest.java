package org.testng;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	
	@Test(dataProvider = "MY DATA")
	private void login(String name, String pass) {
		System.out.println("username :"+name);
		System.out.println("password :"+pass);
	
	}
	
	@DataProvider(name = "MY DATA")
	 private Object[][] testData() {
		 return new Object[][] {
			 {"name","pass"},{ "abc","123"},{"def","456"}}; 
	}
		
	
	
	
	
	
	
}
