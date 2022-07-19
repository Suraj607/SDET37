package com.Demo.Maven;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3Test {
	@Test
	public void testAnnotation() {
		Reporter.log("Good");
	}
	@Test
	public void testAnnotation1() {
		Reporter.log("morning");
	}
	
	@Test
	public void testAnnotation3() {
		Reporter.log("morning");
	}

}
