package com.core.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSQL {

	public static void main(String[] args) {
		String url="";
		try {
			Connection c = DriverManager.getConnection(url);
			
			String sql = "";
			
			PreparedStatement s = c.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(sql)
					
			
			ResultSetMetaData mrs = rs.getMetaData();
			mrs.getColumnName(0);
			rs.absolute(3);
			rs.updateString(1, "");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
