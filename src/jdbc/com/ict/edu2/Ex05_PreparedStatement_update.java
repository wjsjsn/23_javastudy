package jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex05_PreparedStatement_update {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("수정할 custid : ");
		int custid = scan.nextInt();

		System.out.print("수정할 name : ");
		String name = scan.next();

		System.out.print("수정할 address : ");
		String address = scan.next();

		System.out.print("수정할 phone : ");
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
            
			// primary key를 이용해서 수정
			String sql = "update customer테이블 set name = ?, address = ? , phone = ? where custid = ?";
			
			psmt = con.prepareStatement(sql);
			psmt.setString(1, name);
			psmt.setString(2, address);
			psmt.setString(3, phone);
			psmt.setInt(4, custid);

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
			System.out.println("수정 실패");
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
