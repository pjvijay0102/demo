package sql_praties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Sql_Schema_creation {

	public static void main(String[] args) {
		Connection con=null;
		String v="com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(v);
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/indigo","root","root");
			Statement st= con.createStatement();
			ResultSet r= st.executeQuery("create database `kavya`;");
			System.out.println("schema created successfully");
		} catch (Exception e) {
		
			e.printStackTrace();
		}finally
		{
			if( con != null){
				try{
					con.close();
					
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	
		
	}

}
