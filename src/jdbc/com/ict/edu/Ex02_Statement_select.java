package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex02_Statement_select {
public static void main(String[] args) {
	// 1. 자바를 오라클에 접속할 수 있도록 도와주는 클래스
	Connection con = null;
	// 2. SQL 구문 작성을 도와주는 클래스
	Statement stmt = null;
	// 3. 결과를 받는 클래스
	ResultSet rs = null;
	// 4. jdbc 드라이버 로딩 
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 5. 접속하기 위한 정보 저장
		String url = "jdbc:oracle:thin:@localhost:1521:Xe";
		String user = "c##pcl";
		String password = "1111";
		
		// 6. 접속하기
		con = DriverManager.getConnection(url, user, password);
		
		// 7. SQL 작성
		String sql = "select * from BOOK테이블";
		
		// 8. SQL을 보내기 위한 구문
		stmt = con.createStatement();
		
		// 9. SQL을 담아서 보내고 결과 받기
		rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			System.out.print(rs.getString(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.print(rs.getString(4) + "\n");
		}
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e2) {
		}
	}
}
}
