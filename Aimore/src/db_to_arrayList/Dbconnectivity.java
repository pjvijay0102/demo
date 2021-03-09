package db_to_arrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db_connectivity.Database_constant;

public class Dbconnectivity {
	static ResultSet rs = null;

	public static void main(String[] args) {

		Sql_Excecute_statement("select *from actor");

	}

	static void Sql_Excecute_statement(String query) {

		Connection con = null;
		try {
			Class.forName(Database_constant.COM); // type--->1 its for constant
													// variable name
													// --->(Database_constant.COM)
			
			String connection_url = Database_constant.HOST; // type--->1 its for
															// constant variable
															// name
															// --->(Database_constant.HOST)
			
			String user_name = Database_constant.USER_NAME; // type--->1 its for
															// constant variable
															// name
															// --->(Database_constant.USER_NAME)
			
			String password = Database_constant.PASS; // type--->1 its for
														// constant variable
														// name
														// --->(Database_constant.PASS)

			con = DriverManager.getConnection(connection_url + "sakila", user_name, password);
			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery(query);
			
			
			List<Model_gettr_setter> arr_list = new ArrayList<Model_gettr_setter>();
			Model_gettr_setter mgs = null;
			while (rs.next()) {
				
				 mgs = new Model_gettr_setter();	
				// System.out.println(rs.getInt(1) );
				
				mgs.setid(rs.getInt("actor_id"));
				mgs.setname(rs.getString("first_name"));
				arr_list.add(mgs);
				
			}
				
//			for( Model_gettr_setter j:arr_list){
//				System.out.println(j.getname());	
//			}
			
			for(int i=0;i<arr_list.size();i++){
				System.out.println(arr_list.get(i).getname());
			}
			

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

		}
	}
}
