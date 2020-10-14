package com.xebia.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestSample {

	@Test
	public void testDemo() {
//		assertThrows(NullPointerException.class, () -> {
//			throw new ArrayIndexOutOfBoundsException();
//		});
		
//		assertAll(
//		() -> {
//			assertEquals(10, 10);
//		},
//		() -> {
//			assetCompare()
//		},
//		() -> {;
//			
//		});
		
		int[] a1 = {1,2};
		int[] a2 = {1,2,3};
		
		char[] s1 = {'A', 'B'};
		char[] s2 = {'A', 'C'};
		
		assertArrayEquals(s1, s2);
		
		
	}
	
}
