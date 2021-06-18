package org.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterTest {
	
	
	@Parameters({"name"})
	@Test
	private void empUserName(@Optional ("naveen") String name) {
		
		System.out.println("username :"+name);
		
		
	}
	@Parameters({"pass"})
	@Test
	private void empPassword(@Optional ("123") String pass) {
		System.out.println("password :"+pass);
	}
	
	
	
	
	

}
