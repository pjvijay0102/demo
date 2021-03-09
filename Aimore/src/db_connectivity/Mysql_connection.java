package db_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import property_file_reading_concept.Propertires_file_reading;

public class Mysql_connection {

	Connection con = null;
	Statement st=null;
	Propertires_file_reading Propertires_file = new Propertires_file_reading();
	public boolean Sql_Excecute_update(String a,boolean bo){
		boolean b=false;
		Propertires_file.properity_read();

		try {
			Class.forName(Propertires_file.getDRIVER() );        // type--->1  its for constant variable name --->(Database_constant.COM)
			String connection_url=Database_constant.HOST ;      // type--->1  its for constant variable name --->(Database_constant.HOST)
			String user_name= Database_constant.USER_NAME;     // type--->1  its for constant variable name --->(Database_constant.USER_NAME)
			String password=Database_constant.PASS;           // type--->1  its for constant variable name --->(Database_constant.PASS)
			
			if(bo==true){
				con=DriverManager.getConnection(connection_url+"test_3",user_name,password);
			}else{
				con=DriverManager.getConnection(connection_url,user_name,password);
			}
			st=con.createStatement();
			st.executeUpdate(a);
			b=true;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally{
			if(con !=null){
				try {
					con.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		
		return b;
	}
	
	boolean Sql_Excecute_statement(String query){
		
		boolean b=false;
		
		Propertires_file.properity_read();

		
		try {
			Class.forName( Propertires_file.getDRIVER() );                            // type--->1  its for constant variable name --->(Database_constant.COM)
			String connection_url = Propertires_file.getURL() ;                      // type--->1  its for constant variable name --->(Database_constant.HOST)
			String user_name = Propertires_file.getU_NAME();                        // type--->1  its for constant variable name --->(Database_constant.USER_NAME)
			String password = Propertires_file.getPASSWORD();                      // type--->1  its for constant variable name --->(Database_constant.PASS)
			
			con=DriverManager.getConnection(connection_url+"test_3",user_name,password);
			st=con.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));			
			}
			
			b=true;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(con !=null){
				try {
					con.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
		return b;
	}
	
	
	
}

