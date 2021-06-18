package org.testng;

import org.testng.annotations.Test;

public class Dependecy_Demo {
	@Test
	private void browserLaunch() {
		System.out.println("browser launch");
	}
	@Test(dependsOnMethods = "browserLaunch")
	private void url() {
		System.out.println("search url");
	}
	@Test(dependsOnMethods = "url")
	private void login() {
		System.out.println("login page");
	}
	@Test(dependsOnMethods = "login")
	private void searchMobile() {
		System.out.println("search mobile");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
