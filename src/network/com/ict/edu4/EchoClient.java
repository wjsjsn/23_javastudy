package network.com.ict.edu4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient implements Runnable {
	Socket s = null;
	OutputStream os = null;
	BufferedOutputStream bos = null;
	
	InputStream is = null;
	BufferedInputStream bis = null;
	
	Scanner scan = new Scanner(System.in);
	public EchoClient() {
	new  Thread(this).start();
	}

	@Override
	public void run() {
		while(true) {
			try {
				System.out.print("데이터 입력 : ");
				String msg = scan.next();
				
				s = new Socket("196.168.0.91", 7778);
				
				// 출력
				os = s.getOutputStream();
				bos = new BufferedOutputStream(os);
				
				bos.write(msg.getBytes());
				bos.flush();
				
				// 읽어오기
				is = s.getInputStream();
				bis = new BufferedInputStream(is);
				byte[] b = new byte[1024];
				bis.read(b);
				
				String str = new String(b).trim();
				if(str.equals("exit")) break;
				System.out.println("서버에서 받은 내용 : " + str);
			} catch (Exception e) {
			}finally {
				try {
					s.close();
					bis.close();
					is.close();
					bos.close();
					os.close();
				} catch (Exception e2) {
				}
			}
		}
	}

	public static void main(String[] args) {
		new EchoClient();
	}
}
