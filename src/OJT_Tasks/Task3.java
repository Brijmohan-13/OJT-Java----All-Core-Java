package OJT_Tasks;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Task3 {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from Student");

		PreparedStatement ps1 = con.prepareStatement("insert into Student_Clone(sid,sname,sphone) values(?,?,?)");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			int id = rs.getInt("sid");
			String name = rs.getString("sname");
			int phone = rs.getInt("sphone");

			if (specialCharacter(name)) {
				ps1.setInt(1, id);
				ps1.setString(2, name);
				ps1.setInt(3, phone);
				ps1.executeUpdate();

				System.out.println(id + " " + name + " " + phone);

			}

		}

	}

	static boolean specialCharacter(String s) {

		char[] a = s.toCharArray();

		for (int i = 0; i < a.length; i++) {

			if (!((a[i] >= 65 && a[i] <= 90) || (a[i] >= 97 && a[i] <= 122))) {
				return true;
			}
		}

		return false;

	}

}
