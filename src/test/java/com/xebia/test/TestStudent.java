package com.xebia.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class TestStudent {

	@Test
	@Tag("prod")
	public void testStudentDemo1(TestInfo info) {
		System.out.println("Demo Test 1");
	}
	
	@Test
	@Tag("dev")
	public void testStudentDemo2(TestInfo info) {
		System.out.println("Demo Test 2");
	}
	
}
