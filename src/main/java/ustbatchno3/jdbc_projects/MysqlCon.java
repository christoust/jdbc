package ustbatchno3.jdbc_projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

import com.mysql.cj.xdevapi.Statement;

public class MysqlCon {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/material", "root", "pass@word1");
			// here sonoo is database name, root is username and password
			java.sql.Statement stmt = con.createStatement();
			ResultSet rs = ((java.sql.Statement) stmt).executeQuery("select * from price");
			while (rs.next())
				System.out.println(rs.getString(1) + "  " + rs.getInt(2) + "  " + rs.getInt(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
