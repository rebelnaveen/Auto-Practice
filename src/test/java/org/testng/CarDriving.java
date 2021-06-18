package org.testng;

import org.testng.annotations.Test;

public class CarDriving {
	@Test
	private void Startthecar() {
		System.out.println("car started");
	}
	@Test(priority = 1)
	private void Firstgear() {
		System.out.println("first gear");
	}
	@Test(priority = 2)
	private void SecondGear() {
		System.out.println("second gear");
	}
	@Test(priority = 3)
	private void ThirdGear() {
		System.out.println("third gear ");
	}
	@Test(priority = 4)
	private void Neautral() {
		System.out.println("neautral");
	}
	@Test(priority = 5)
	private void StopTheCar() {
		System.out.println("stop the car");
	}
	@Test(priority = 6)
	private void KeyOff() {
		System.out.println("key off");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
