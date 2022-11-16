package com.Demo.Maven;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1Test {
	@Test
	public void testCase1() {

		Reporter.log("Hello World")
		Reporter.log("Hello",true);

	}
	@Test
	public void testCase2() {
		Reporter.log("Mohan",true);
	}
	@Test
	public void testCase3() {
		Reporter.log("Lall",true);
	}
	//hiiii
	
	

}
