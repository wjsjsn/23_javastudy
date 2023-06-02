package day28.com.ict.edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// OutputStreamWriter : 바이트 스트림을 문자 스트림으로 상호 변경
// OutputStream(바이트 스트림) => OutputStreamWriter => BufferedWriter(문자 스트림)

// InputStreamReader : 바이트 스트림을 문자 스트림으로 상호 변경
// InputStream => InputStreamReader => BufferedReader

public class Ex02_OutputStreamWriter {
	public static void main(String[] args) {
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;

		InputStreamReader isr = null;
		BufferedReader br = null;

		try {
			// System.out.print("원하는 문자 : ");

			// 모니터에 정보 내보내기
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			bw.write("원하는 문자 : ");
			bw.flush(); // 시간절약을 위해서 write 쓸 때 공식처럼 사용
			
			// 키보드를 통해서 정보 입력받기
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String msg = br.readLine();
			
			// 받은 정보 출력
			bw.write("받은 문자 : " + msg);
			bw.flush();

		} catch (Exception e) {
		} finally {
			try {
				br.close();
				isr.close();
				bw.close();
				osw.close();
			} catch (Exception e2) {
			}
		}
	}
}
