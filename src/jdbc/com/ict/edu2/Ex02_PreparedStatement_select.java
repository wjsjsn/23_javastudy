package jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex02_PreparedStatement_select {
	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		int result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("custin : ");
		int custid = scan.nextInt();
		try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "c##pcl";
            String password = "1111";
            
            con = DriverManager.getConnection(url, user, password);
            
            String sql = "select * from customer테이블 where custid = ?";
            // ? => 바인딩 변수
            psmt = con.prepareStatement(sql);
            psmt.setInt(1, custid);
            rs = psmt.executeQuery();
            while(rs.next()) {
            	System.out.print(rs.getString(1) + "\t");
            	System.out.print(rs.getString(2) + "\t");
            	System.out.print(rs.getString(3) + "\t");
            	System.out.print(rs.getString(4) + "\n");
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
