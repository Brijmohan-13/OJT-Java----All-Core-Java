package OJT_Tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Task4 {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		PreparedStatement st = con.prepareStatement("select * from Employee");
		ResultSet rs= st.executeQuery();
		
		Connection con1= DriverManager.getConnection("jdbc:mysql://localhost:3306/test2","root","root");
		PreparedStatement analyticps=con1.prepareStatement("insert into Analytic_Sec(Id,Name,Phone) values(?,?,?)");
		PreparedStatement adminps= con1.prepareStatement("insert into Admin_Sec(Id,Name,Phone) values(?,?,?)");
		PreparedStatement hrps= con1.prepareStatement("insert into HR_Sec(Id,Name,Phone) values(?,?,?)");

		for (int i = 0; i < 5; i++) {	
			
		rs.next();
		int id =rs.getInt("eid");
		String name=rs.getString("ename");
		int phone = rs.getInt("ephone");
		String table = rs.getString("table_name");
		
		
		if(table.equals("Analytic_Sec")){
			System.out.println("Faculty = "+id+" "+name+" "+phone);
			analyticps.setInt(1, id);
			analyticps.setString(2, name);
			analyticps.setInt(3, phone);
			analyticps.executeUpdate();
		}
		
		
		if(table.equals("Admin_Sec")){
			System.out.println("Admin = "+id+" "+name+" "+phone);
			adminps.setInt(1, id);
			adminps.setString(2, name);
			adminps.setInt(3, phone);
			adminps.executeUpdate();
		}
		
		if(table.equals("HR_Sec")){
			System.out.println("Student = "+id+" "+name+" "+phone);
			hrps.setInt(1, id);
			hrps.setString(2, name);
			hrps.setInt(3, phone);
			hrps.executeUpdate();
		}
		
	
	}
		System.out.println("Data added");
		
		
	}
}
