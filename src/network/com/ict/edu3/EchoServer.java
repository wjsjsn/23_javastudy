package network.com.ict.edu3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) {
		ServerSocket ss = null;
		InputStream is = null;
		OutputStream os = null;
		Socket s = null;

		try {
			// 생성
			ss = new ServerSocket(7777);
			System.out.println("서버 대기 중 ...");

			// 무한반복
			while (true) {
				// 클라이언트에게 요청이 올 때까지 대기하다가
				// 요청이 오면 클라이언트와 통신할 소켓 만들기
				s = ss.accept(); // 무한 대기상태

				// 입출력스트림 만들기
				is = s.getInputStream();
				os = s.getOutputStream();

				// 데이터 수신
				byte[] buff = new byte[100]; // 한글 깨지지 말라고 배열 사용
				is.read(buff);

				String read_data = new String(buff).trim();
				String client_ip = s.getInetAddress().getHostAddress();
				System.out.println("서버에 수신된 데이터 : " + read_data + "(" + client_ip + ")");

				// 데이터 송신
				os.write(read_data.getBytes());
				os.flush();
			}
		} catch (Exception e) {
		} finally {
			try {
				s.close();
				os.close();
				is.close();
			} catch (Exception e2) {
			}
		}
	}
}
