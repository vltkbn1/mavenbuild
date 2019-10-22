package com.group5.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getConnect() {
		Connection conn =null;

	String url = "jdbc:mysql://localhost:3306/cloud";
		String user ="root";
		String pass= "";
		
		try {

		Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,user,pass);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
	public static void main(String[] args) {
		if(getConnect()!=null)System.out.println("Ket noi thanh cong!");
		else System.out.println("Ket noi that bai!");
	}
}
