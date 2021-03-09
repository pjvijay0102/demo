package property_file_reading_concept;

import java.util.Properties;
import java.io.FileInputStream;

public class Propertires_file_reading {
	
	FileInputStream in=null;
	Properties prop=new Properties();
	
	private String DRIVER;
	private String URL;
	private String U_NAME;
	private String PASSWORD;
	  
	
	
	public void setDRIVER(String driver){
		DRIVER = driver;
	}
	
	public String getDRIVER(){
		return DRIVER;
	}
	


	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public String getU_NAME() {
		return U_NAME;
	}

	public void setU_NAME(String u_NAME) {
		U_NAME = u_NAME;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public void properity_read() {
		try{
			in=new FileInputStream("db.properties");
			
			prop.load(in);
			setDRIVER(prop.getProperty("driver"));
			setURL(prop.getProperty("url"));
			setU_NAME(prop.getProperty("user_name"));
			setPASSWORD(prop.getProperty("password"));
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(in!=null){
				try {
					in.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
//	public static void main(String[] args) {
//		Propertires_file_reading pf = new Propertires_file_reading();
////		pf.properity_read();
//		System.out.println(pf.DRIVER);
//		System.out.println(pf.URL);
//		System.out.println(pf.U_NAME);
//		System.out.println(pf.PASSWORD);
//	}
	
}
