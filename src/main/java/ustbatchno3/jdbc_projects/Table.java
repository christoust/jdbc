package ustbatchno3.jdbc_projects;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Table {

   static final String DB_URL = "jdbc:mysql://localhost/material";
   static final String USER = "root";
   static final String PASS = "pass@word1";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();) 
      {		      
//          String sql = "CREATE TABLE Employee " +
//                   "(id INTEGER not NULL, " +
//                   " first VARCHAR(255), " + 
//                   " last VARCHAR(255), " + 
//                   " age INTEGER, " + 
//                   " PRIMARY KEY ( id ))"; 
//
//         stmt.executeUpdate(sql);
         System.out.println("Created table in given database...");   	
         System.out.println("Inserting records into the table...");          
         String sql1 = "INSERT INTO Employee VALUES (100, 'Zara', 'Ali', 18)";
         stmt.executeUpdate(sql1);
         sql1 = "INSERT INTO Employee VALUES (101, 'Mahnaz', 'Fatma', 25)";
         stmt.executeUpdate(sql1);
         sql1 = "INSERT INTO Employee VALUES (102, 'Zaid', 'Khan', 30)";
         stmt.executeUpdate(sql1);
         sql1 = "INSERT INTO Employee VALUES(103, 'Sumit', 'Mittal', 28)";
         stmt.executeUpdate(sql1);
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}