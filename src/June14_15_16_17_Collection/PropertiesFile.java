package June14_15_16_17_Collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	
	//properties file is created by right click on project --new file--name--connectioninfo.properties
	//it considers all values as String type
	//only one property is allowed in one line
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties p=new Properties();
		
		p.load(new FileInputStream("connectioninfo.properties"));     //load() loads all data from properties file into properties class object
		
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
	
	}
}
//If Properties file is used,then we do not need to change the code
//If Username/password is changed in properties file, will get automatically read
