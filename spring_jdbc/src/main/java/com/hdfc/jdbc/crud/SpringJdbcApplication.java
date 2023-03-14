package com.hdfc.jdbc.crud;

import java.sql.Connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hdfc.jdbc.crud.dao.DButil;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApplication.class, args);
		
		Connection conn = DButil.getcon();
		System.out.println(conn);
	
	}

}
