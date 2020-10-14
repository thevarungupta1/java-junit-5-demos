package com.xebia.service;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDbConnection {

	private DbConnection db;
	private Connection con;
	
	@BeforeEach
	private void setup() {
		db = new DbConnection();
		
	}
	
	@Test
	public void TestGetDbConnection() {
		//DbConnection db = new DbConnection();
		Connection con =  db.getConnection();
		// expecting con should not be null
		// if it is null test get failed
		// means not connected with db successfully
		assertNotNull(con, "Connection failed");
	}
	
	@AfterEach
	private void clear() {
		db = null;
		con = null;
	}
	
	
}


