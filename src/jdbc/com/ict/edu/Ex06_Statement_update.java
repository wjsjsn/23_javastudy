package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex06_Statement_update {
public static void main(String[] args) {
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	int result = 0;

	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##pcl";
		String password = "1111";
		con = DriverManager.getConnection(url, user, password);

		// 박세리 대한민국 제주도 000-9000-0001로 변경 
		String sql = "update CUSTOMER테이블 set address = '대한민국 제주도', phone = '000-9000-0001' where name = '박세리'" ;
		stmt = con.createStatement();

		result = stmt.executeUpdate(sql);
		if (result > 0) {
			// 성공하면 select문을 이용해서 보기
			sql = "select * from customer테이블 order by custid asc";
			// stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");
			} 
		}
	} catch (Exception e) {
		System.out.println("제대로 된 데이터 넣기" + e);
	} finally {
		try {
			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e2) {
		}
	} 
}
}
