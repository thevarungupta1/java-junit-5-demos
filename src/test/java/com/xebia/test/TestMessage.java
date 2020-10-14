package com.xebia.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import com.xebia.service.Message;

public class TestMessage {

//	@Test
//	public void testDemo1() {
//		String expected = "HelloWorld";
//		String actual = "Hello World";
//		assertEquals(expected, actual, "May be values are different");
//	}
	
	Message msg;
	
	@BeforeEach
	public void setup() {
		msg = new Message();
	}
	
	
	@Test
	public void TestHello() {
		// AAA
		// Arrange
		//Message msg = new Message();
		
		
		// Act
		String actual = msg.hello("Mark");
		
		// Assert
		String expected = "Hello to Mark";
		assertEquals(expected, actual);
	}
	
	@AfterEach
	public void clear() {
		msg = null;
	}
	
	
}
