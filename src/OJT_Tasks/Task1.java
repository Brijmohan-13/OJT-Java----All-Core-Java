package OJT_Tasks;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jxl.Sheet;
import jxl.Workbook;

public class Task1 {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		PreparedStatement facultyps=con.prepareStatement("insert into Faculty(id,name,phone) values(?,?,?)");
		PreparedStatement adminps= con.prepareStatement("insert into Admin(id,name,phone) values(?,?,?)");
		PreparedStatement studentps= con.prepareStatement("insert into Student(id,name,phone) values(?,?,?)");

		
		FileInputStream file = new FileInputStream("Data.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet sh= wb.getSheet("Sheet1");
		
		int columns=sh.getColumns();
		int rows = sh.getRows();
		
		for (int i = 1; i < rows; i++) {
			
			int id = Integer.parseInt(sh.getCell(0, i).getContents());
			
			String name = sh.getCell(1, i).getContents(); 
			
			int phone = Integer.parseInt(sh.getCell(2, i).getContents());
			
			String roll = sh.getCell(3, i).getContents();
			
			System.out.println("id = "+id+" name = "+name+ " phone = "+phone);
			
			if(roll.equals("Faculty")){
				facultyps.setInt(1, id);
				facultyps.setString(2, name);
				facultyps.setInt(3, phone);
				facultyps.executeUpdate();
			}
			
			if(roll.equals("Admin")){
				adminps.setInt(1, id);
				adminps.setString(2, name);
				adminps.setInt(3, phone);
				adminps.executeUpdate();
			}
			
			if(roll.equals("Student")){
				studentps.setInt(1, id);
				studentps.setString(2, name);
				studentps.setInt(3, phone);
				studentps.executeUpdate();
			}
		}//loop end
	}
}
