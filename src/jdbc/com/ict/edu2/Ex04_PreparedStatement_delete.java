package jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex04_PreparedStatement_delete {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 custid : ");
		int custid = scan.nextInt();

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

			// 보통은 primary key를 이용해서 삭제
			String sql = "delete from customer테이블 where custid = ?";
			// ? => 바인딩 변수
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, custid);
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
			} else {
				System.out.println("삭제 실패");
			}
		} catch (Exception e) {
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
