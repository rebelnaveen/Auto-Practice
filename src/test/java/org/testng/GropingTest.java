package org.testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GropingTest {
	
	@Test(groups = "RED")
	private void red() {
		System.out.println("RED");
	}
	@Test(groups = "RED")
	private void red1() {
		System.out.println("RED 1");
	}
	
	@Test(groups = "BLACK")
	private void black() {
		System.out.println("black");
	}
	
	@Test(groups = "BLACK")
	private void black1() {
		System.out.println("BLACK 1");
	}
	
	@Test(groups = "BLUE")
	private void blue() {
		System.out.println("BLUE");
	}
	
	@Test(groups = "BLUE")
	private void blue1() {
		System.out.println("BLUE 1");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
