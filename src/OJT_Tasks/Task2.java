package OJT_Tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Task2 {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","root");
		PreparedStatement st = con.prepareStatement("select * from User");
		ResultSet rs= st.executeQuery();
		
		Connection con1= DriverManager.getConnection("jdbc:mysql://localhost:3306/pqr","root","root");
		PreparedStatement facultyps=con1.prepareStatement("insert into Faculty(Id,Name,Phone) values(?,?,?)");
		PreparedStatement adminps= con1.prepareStatement("insert into Admin(Id,Name,Phone) values(?,?,?)");
		PreparedStatement studentps= con1.prepareStatement("insert into Student(Id,Name,Phone) values(?,?,?)");

		for (int i = 0; i < 5; i++) {	
			
		rs.next();
		int id =rs.getInt("id");
		String name=rs.getString("name");
		int phone = rs.getInt("Phone");
		String role = rs.getString("Role");
		
		
		if(role.equals("Faculty")){
			System.out.println("Faculty = "+id+" "+name+" "+phone);
			facultyps.setInt(1, id);
			facultyps.setString(2, name);
			facultyps.setInt(3, phone);
			facultyps.executeUpdate();
		}
		
		
		if(role.equals("Admin")){
			System.out.println("Admin = "+id+" "+name+" "+phone);
			adminps.setInt(1, id);
			adminps.setString(2, name);
			adminps.setInt(3, phone);
			adminps.executeUpdate();
		}
		
		if(role.equals("Student")){
			System.out.println("Student = "+id+" "+name+" "+phone);
			studentps.setInt(1, id);
			studentps.setString(2, name);
			studentps.setInt(3, phone);
			studentps.executeUpdate();
		}
		
	
	}
		System.out.println("Data added");
	}
	}
