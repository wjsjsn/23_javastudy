package network.com.ict.edu;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

// URLConnection 클래스 : 원격지 서버 자원의 결과와 원격지 서버의 헤더 정보를 가져올 수 있음
public class Ex03 {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		try {
			URL url = new URL("https://movie.daum.net/main");
			URLConnection con = url.openConnection();

			is = con.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);

			System.out.println("인코딩 : " + con.getContentEncoding());
			System.out.println("길이 : " + con.getContentLength());
			System.out.println("문서타입 : " + con.getContentType());

			// 인터넷 정보는 헤더와 바디로 나눠짐
			// 헤더 정보를 가지고 웹브라우저가 해석하고 실행
			// 헤더 정보를 얻어내는 방법
			Map<String, List<String>> list = con.getHeaderFields();
			for (String k : list.keySet()) {
				System.out.println(k + " : " + list.get(k));
			}
		} catch (Exception e) {
		} finally {
			try {
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
			}
		}
	}
}
