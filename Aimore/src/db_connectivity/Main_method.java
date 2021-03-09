package db_connectivity;


public class Main_method {

	static Mysql_connection mysql_Con = new Mysql_connection();

	public static void main(String[] args) {
				
		if ( create_database() ) {
			System.out.println("database created successfully");
		} else {
			try {
				throw new DB_CustomException("some issues in database creation");
			} catch (DB_CustomException e) {

				e.printStackTrace();
			}

		}
		if (create_table()) {
			System.out.println("table created successfully");
		} else {
			try {
				throw new DB_CustomException("some issues in table creation");
			} catch (DB_CustomException e) {

				e.printStackTrace();
			}

		}
		if (Insert_value()) {
			System.out.println("values inserted successfully");
		} else {
			try {
				throw new DB_CustomException("some issues in values inserting");
			} catch (DB_CustomException e) {

				e.printStackTrace();
			}

		}
		if (Showdata_values()) {
			System.out.println("values shown successfully");
		} else {
			try {
				throw new DB_CustomException("some issues in values showing");
			} catch (DB_CustomException e) {

				e.printStackTrace();
			}

		}

	}

	static boolean create_database(){
		String query = "create database if not exists test_3";
		boolean bool =  mysql_Con.Sql_Excecute_update(query,false);
		return bool;
	}

	static boolean create_table() {
		String query = "CREATE TABLE  if not exists Marksheet(ROLL_NO int(15),NAME varchar(15),course varchar(5))";
		boolean bool = mysql_Con.Sql_Excecute_update(query,true);
		
		return bool;

	}

	static boolean Insert_value() {
		String query = "INSERT INTO Marksheet(ROLL_NO,NAME,course) VALUES(12345,'vijay','bca')";
		boolean bool = mysql_Con.Sql_Excecute_update(query,true);
		return bool;
	}

	static boolean Showdata_values() {
		String query = "SELECT * FROM Marksheet";
		boolean bool = mysql_Con.Sql_Excecute_statement(query);
		return bool;
	}

}
