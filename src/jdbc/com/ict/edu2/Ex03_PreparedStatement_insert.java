package jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex03_PreparedStatement_insert {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("custid : ");
		int custid = scan.nextInt();

		System.out.print("name : ");
		String name = scan.next();

		System.out.print("address : ");
		String address = scan.next();

		System.out.print("phone : ");
		String phone = scan.next();

		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##pcl";
			String password = "1111";

			con = DriverManager.getConnection(url, user, password);

			String sql = "insert into customer테이블(custid, name, address, phone) values ( ?, ?, ?, ?)";
			// ? => 바인딩 변수
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, custid);
			psmt.setString(2, name);
			psmt.setString(3, address);
			psmt.setString(4, phone);

			result = psmt.executeUpdate();
			if (result > 0) {
				sql = "select * from customer테이블";
				psmt = con.prepareStatement(sql);
				rs = psmt.executeQuery();
				while (rs.next()) {
					System.out.print(rs.getString(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}
			}
		} catch (Exception e) {
			System.out.println("삽입 실패"); // 중복되면 여기로 떨어짐
		} finally {
			
			try {
				rs.close();
				psmt.close();
				con.close();
			} catch (Exception e2) {
			}
		}
	}
}
