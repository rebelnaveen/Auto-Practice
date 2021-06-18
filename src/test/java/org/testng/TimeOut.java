package org.testng;

import org.testng.annotations.Test;

public class TimeOut {
	
	
	@Test(timeOut = 4000)
	private void searchMobile() throws InterruptedException {
		
		System.out.println("login");
		Thread.sleep(2000);
		System.out.println("search mobile");
		
		
		
	}
	
	
	
}
