package day28.com.ict.edu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

// PrintStream : 1 byte, 모든 데이터를 출력할 수 있음(System.out.println())
//                      BufferedStream처럼 OutputStream을 이용해서 사용(체인 방식)
// PrintWriter : OutputStream(바이트 출력), Writer(문자출력) 둘 다 사용 가능
// 사용방법은 PrintStream과 같음
public class Ex01_PrintWriter {
	public static void main(String[] args) {
		String pathname = "D:/pcl/exam100.txt";
		File file = new File(pathname);

		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
			// 체인방식
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);

			pw.println("PrintWriter 연습");
			pw.print(123456);
			pw.println('A');
			pw.print(true);
			pw.print(178.95);

		} catch (Exception e) {
		} finally {
			try {
				pw.close();
				bw.close();
				fw.close();
			} catch (Exception e2) {
			}
		}
	}
}
