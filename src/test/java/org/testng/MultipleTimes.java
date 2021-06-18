package org.testng;

import org.testng.annotations.Test;

public class MultipleTimes {
	@Test(invocationCount = 3)
	private void searchMobile() {
		System.out.println("search mobile");
	}
	
	@Test(invocationCount = 3)
	private void searchLaptop() {
		System.out.println("search laptop");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
