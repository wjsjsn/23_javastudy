package network.com.ict.edu3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
 public static void main(String[] args) {
	Socket s = null;
	OutputStream os = null;
	InputStream is = null;
	Scanner scan = new Scanner(System.in);
	
	try { 
		s = new Socket("192.168.0.91", 7777);
		System.out.println("클라이언트 연결 성공");
		
		// 입출력 스트림
		os = s.getOutputStream();
		is = s.getInputStream();
		
		// 메세지 전송
		System.out.print("메세지를 입력하세요 >>> ");
		String msg = scan.next();
		os.write(msg.getBytes());
		os.flush();
		
		// 서버에서 전송된 데이터 수신
		byte[] buff = new byte[100];
		is.read(buff);
        
		String receive_msg = new String(buff).trim();
		System.out.println("에코메세지 : " + receive_msg);
	} catch (Exception e) {
	}finally {
		try {
			s.close();
			is.close();
			os.close();
		} catch (Exception e2) {
		}
	}
}
}
