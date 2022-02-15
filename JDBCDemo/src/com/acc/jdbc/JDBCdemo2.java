package com.acc.jdbc;
import java.sql.*;
public class JDBCdemo2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sme","root","root");
			PreparedStatement stmt=con.prepareStatement("select * from employee");
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				//getting the datas from each rows
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "
						+rs.getDouble(5)+" "+rs.getDate(6));}
			//Insertion
			
			/*PreparedStatement stmt=con.prepareStatement("insert into employee values(?,?,?,?,?,?)");
			stmt.setInt(1,13174201);
			stmt.setString(2, "Anmol Kumar");
			stmt.setString(3, "Kolkata");
			stmt.setString(4, "ASP.NET");
			stmt.setDouble(5, 60000.00);
			stmt.setDate(6, java.sql.Date.valueOf("2021-12-22"));*/
			//Update Operation
			/*PreparedStatement stmt=con.prepareStatement("update employee set salary=?,stream=? where empid=?");
			stmt.setDouble(1, 65000.00);
			stmt.setString(2,"Hybris");
			stmt.setInt(3, 13174201);
			int result=stmt.executeUpdate();
			System.out.println(result+ "records affected");*/
			
			con.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
