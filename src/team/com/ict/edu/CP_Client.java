package team.com.ict.edu;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

import team_db.com.ict.edu.DAO;
import team_db.com.ict.edu.VO;


public class CP_Client extends Thread {
	Socket s;
	DB_Server server;
	ObjectInputStream in;
	ObjectOutputStream out;

	public CP_Client(Socket s, DB_Server server) {
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
		while (true) {
			try {
				Object obj = in.readObject();
				if(obj != null) {
					Protocol p = (Protocol)obj;
					switch (p.getCmd()) {
					case 1:
						List<VO> list = DAO.getList();
						p.setList(list);
						
						out.writeObject(p);
						out.flush();
						break;
					case 2:
						
						break;
					case 3:
						
						break;
					case 4:
						
						break;
					case 5:
						
						break;

					}
				}
			} catch (Exception e) {

			}
		}
	}
}
