package network.com.ict.edu7;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class CopyClient extends Thread {
	Socket s;
	ChatServer server;

	// 객체 직렬화
	ObjectInputStream in;
	ObjectOutputStream out;

	// 닉네임 받기
	String nickname;

	public CopyClient(Socket s, ChatServer server) {
		this.s = s;
		this.server = server;
		try {
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectOutputStream(s.getOutputStream());

		} catch (Exception e) {
		}
	}

	@Override
	public void run() {
		esc: while (true) {
			try {
				Object obj = in.readObject();
				if (obj != null) {
					Protocol p = (Protocol) obj;
					switch (p.getCmd()) {
					case 0: // 접속 종료
						out.writeObject(p);
						break esc;

					case 1: // 닉네임 받기
						nickname = p.getMsg();
						p.setCmd(2); // 다른 사람들에게는 일반 메시지로 전달돼서 2번
						p.setMsg(nickname + "님 입장");

						// 접속자 모두에게 전달
						server.sendMsg(p);
						break;

					case 2: // 메시지 일반 채팅
						p.setCmd(2); 
						p.setMsg(nickname + " : " + p.getMsg());
						server.sendMsg(p);
						break;
					}
				}
			} catch (Exception e) {
			}
		} // 무한루프 끝
		try {
			out.close();
			in.close();
			s.close();

			server.removeClient(this);
			Protocol p2 = new Protocol();
			p2.setCmd(2);
			p2.setMsg(nickname + "님 퇴장");
			server.sendMsg(p2);
		} catch (Exception e) {
		}
	}
}
