package com.xebia.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// Test class which will contain all test methods
//@TestMethodOrder(Alphanumeric.class)
@DisplayName("Test Employee Demos")
public class TestEmployee {

	// Test
	
//	@BeforeAll
//	public static void setupOnce() {
//		System.out.println("setup once");
//	}
//	
//	
//	@BeforeEach
//	public void setup() {
//		System.out.println("setup");
//	}
//	
//	
//	@Test
//	@DisplayName("Test Demo 1")
//	public void testDemo() {
//		System.out.println("test demo 1");
//	}
//	
//	@Test
//	@DisplayName("Test Demo 2")
//	public void testDemo2() {
//		System.out.println("test demo 2");
//	}
//	
//	@Test
//	@DisplayName("Test Demo 3")
//	@Disabled
//	public void testDemo3() {
//		System.out.println("test demo 3");
//	}
//	
//	@AfterEach
//	public void tearDown() {
//		System.out.println("tear down");
//	}
//	
//	@AfterAll
//	public static void teardownOnce() {
//		System.out.println("tear down once");
//	}
	
	
	
	@RepeatedTest(value = 5, name= "{displayName} - {currentRepetition}/{totalRepetitions}")
	@DisplayName("Multiple")
	public void testMultiple(TestInfo info) {
		System.out.println("Method: "+ info.getDisplayName());
	}
	
	
	
}
