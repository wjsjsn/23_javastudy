package network.com.ict.edu7;

import java.util.ArrayList;

public class ChatRoom {
	// 방 참여자들이 저장되어 있는 곳 => 방 나가기 or 접속 해제 시 여기서 삭제되어야 함
	// 마지막 사람이 나가면 방은 삭제
	ArrayList<CopyClient> j_list;
	String title; // 방 제목

	public ChatRoom(String title) {
		j_list = new ArrayList<>();
		this.title = title;
	}

	// 방 제목을 반환하는 기능(ChatServer에서 호출)
	public String getTitle() {
		return title;
	}

	// 현재 방의 참여자들 수를 반환(방을 나갈 때 마지막 사람일 경우 방 삭제)
	public int getJoinCount() {
		return j_list.size();
	}

	// 방 참여
	public void join(CopyClient cc) {
		j_list.add(cc);

		// 방 참여자에게 메시지 전달(대기실에 있는 사람에게는 전달 x)
		Protocol p = new Protocol();
		p.setCmd(4);
		p.setMsg(" ** " + cc.nickname + "님 입장 ** ");
		p.setNames(getJoinUsers());
		sendProtocol(p);
	}

	// 방 참여 명단 반환(방 나가기 명단 갱신 필요)
	public String[] getJoinUsers() {
		String[] arr = new String[j_list.size()];
		int i = 0;
		for (CopyClient k : j_list) {
			arr[i++] = k.nickname;
		}
		return arr;
	}

	// 채팅 기능
	public void sendProtocol(Protocol p) {
		for (CopyClient k : j_list) {
			try {
				k.out.writeObject(p);
				k.out.flush();
			} catch (Exception e) {
			}
		}
	}

	// 방 나가기
	public void getOut(CopyClient cc) {
		j_list.remove(cc);
		Protocol p = new Protocol();
		p.setCmd(1);
		p.setMsg(" ** " + cc.nickname + "님 퇴장 ** ");
		p.setNames(getJoinUsers());
		
		sendProtocol(p);
	}
}
