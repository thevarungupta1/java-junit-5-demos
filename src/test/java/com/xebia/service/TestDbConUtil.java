package com.xebia.service;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.Test;


public class TestDbConUtil {

	@Test
	public void TestGetConnection() {
		Connection con1 = DbConUtil.getConnection();
		Connection con2 = DbConUtil.getConnection();
		
		//assertNotNull(con1);
//		if(con1==null || con2==null) {
//			//fail();
//		}
		
		
		assertSame(con1, con2, "May not be same");
	}
	
	
}
