package com.acc.jdbc;
import java.sql.*;
public class JDBCdemo1 {

	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sme","root","root");
		Statement stmt=con.createStatement();
		String sql="SELECT * FROM EMPLOYEE";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			//getting the datas from each rows
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "
					+rs.getDouble(5)+" "+rs.getDate(6));}
	//	int result=stmt.executeUpdate("insert into employee values(13178522,'Ranjan Dey','Delhi','ASP.NET',40000.00,'2021-11-12')");
		//int result=stmt.executeUpdate("update employee set location='Chennai',stream='Python',salary=50000.00 where empid=13178522");
		//int result=stmt.executeUpdate("delete from employee where empid=13178522");
		//System.out.println(result +"records affected");
			con.close();
		
	}catch(Exception e) {
		System.out.println(e);
	}

	}

}
