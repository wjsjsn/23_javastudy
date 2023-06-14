package network.com.ict.edu6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ChatClient extends JFrame implements Runnable {
	JPanel jp;
	JTextArea jta;
	JScrollPane jsp;
	JTextField jtf;
	JButton jb;

	Socket s = null;
	BufferedReader in = null;
	PrintWriter out = null;

	public ChatClient() {
		super("멀티 채팅 ver 0.1");

		jp = new JPanel();

		jta = new JTextArea(20, 1);
		jta.setLineWrap(true);
		jta.setEditable(false);
		jta.setFont(new Font("궁서", Font.BOLD, 20));
		jta.setBackground(new Color(47, 47, 48));
		jta.setForeground(new Color(215, 210, 233));

		jsp = new JScrollPane(jta, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jtf = new JTextField(35);

		jb = new JButton("전송");

		jp.add(jtf);
		jp.add(jb);

		add(jsp, BorderLayout.CENTER);
		add(jp, BorderLayout.SOUTH);

		pack();
		// setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		connected();

		// 종료
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				// 서버에 exit 메시지 보내기

			}
		});

		jtf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMsg();
			}
		});

		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMsg();
			}
		});
	}

	// 서버에 접속
	private void connected() {
		try {
			s = new Socket("192.168.0.41", 7778);
			out = new PrintWriter(s.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));

			new Thread(this).start();
		} catch (Exception e) {
		}
	}

	// 메시지 보내기
	private void sendMsg() {
		String msg = jtf.getText().trim();
		out.println(msg);
		jtf.setText("");
		jtf.requestFocus();
	}

	// 닫기
	private void closed() {
		try {
			in.close();
			out.close();
			s.close();
			System.out.println("프로그램 종료");
			System.exit(0);
		} catch (Exception e) {
		}
	}

	// 정보받기
	@Override
	public void run() {
		while (true) {
			try {
				String msg = in.readLine();
				if (msg.equals("~~bye")) {
					break;
				} else {
					jta.append(msg + "\n");
					// 문자열 출력 후 화면을 가장 하단으로 이동하기
					jta.setCaretPosition(jta.getText().length());
				}
			} catch (Exception e) {
			}
		} // 무한 루프 끝
		closed();
	}

	public static void main(String[] args) {

		// AWT에서 관리하는 특별한 스레드 처리방법
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				ChatClient cc = new ChatClient();
				cc.setVisible(true);
			}
		});
	}
}
