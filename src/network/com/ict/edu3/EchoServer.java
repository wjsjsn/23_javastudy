package network.com.ict.edu3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer implements Runnable {
	ServerSocket ss = null;
	Socket s = null;

	InputStream is = null;
	BufferedInputStream bis = null;

	OutputStream os = null;
	BufferedOutputStream bos = null;

	public EchoServer() {
		try {
			ss = new ServerSocket(7778);
			System.out.println("서버 대기 중 ... ");
			new Thread(this).start();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				s = ss.accept();
				String ip = s.getInetAddress().getHostAddress();
				
				is = s.getInputStream();
				bis = new BufferedInputStream(is);

				os = s.getOutputStream();
				bos = new BufferedOutputStream(os);

				byte[] b = new byte[1024];
				bis.read(b);

				String msg = new String(b).trim();

				bos.write(msg.getBytes());
				bos.flush();

			} catch (Exception e) {
			} finally {
				try {
					s.close();
					bos.close();
					os.close();
					bis.close();
					is.close();
				} catch (Exception e2) {
				}
			}
		}
	}

	public static void main(String[] args) {
		new EchoServer();
	}
}
