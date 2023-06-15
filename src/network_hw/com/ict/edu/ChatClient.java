package network_hw.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ChatClient extends JFrame implements Runnable {
	JPanel jp, card1, card2, text, main, nickname, nick_bt;
	JTextField jtf1, jtf2;
	JButton jb1, jb2;
	CardLayout cardLayout;
	JTextArea jta;
	JScrollPane jsp;

	// 접속
	Socket s = null;
	ObjectOutputStream out = null;
	ObjectInputStream in = null;

	public ChatClient() {
		super("멀티 채팅방 ver 0.2.5");

		jp = new JPanel();
		cardLayout = new CardLayout();
		jp.setLayout(cardLayout);
		add(jp);

		// 첫번째 카드
		card1 = new JPanel();
		jp.add(card1, "main");
		card1.setLayout(new BorderLayout());

		main = new JPanel();
		card1.add(main, BorderLayout.SOUTH);
		main.setLayout(new GridLayout(2, 1));

		nickname = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		nickname.add(new JLabel("닉네임 : "));

		jtf1 = new JTextField(10);
		nickname.add(jtf1);

		main.add(nickname);

		nick_bt = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jb1 = new JButton("입장");
		nick_bt.add(jb1);

		main.add(nick_bt);

		card1.add(new p_Canvas(), BorderLayout.CENTER);

		card2 = new JPanel();
		jp.add(card2, "chat");
		card2.setLayout(new BorderLayout());

		jta = new JTextArea(200, 300);
		jta.setBackground(new Color(90, 90, 94));
		jta.setForeground(new Color(204, 204, 255));
		jta.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		jta.setEditable(false);
		jta.setLineWrap(true);

		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		card2.add(jsp, BorderLayout.CENTER);

		text = new JPanel(new BorderLayout());
		jtf2 = new JTextField(20);
		text.add(jtf2, BorderLayout.CENTER);

		jb2 = new JButton("전송");
		text.add(jb2, BorderLayout.EAST);

		card2.add(text, BorderLayout.SOUTH);

		setVisible(true);
		setSize(340, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = jtf1.getText().trim();
				if (name.length() > 0) {
					// 서버 접속
					if (connected()) {
						try {
							// 닉네임 보내기
							Protocol p = new Protocol();
							p.setCmd(1);
							p.setMsg(name);
							out.writeObject(p);
							// 화면 바뀜
							cardLayout.show(jp, "chat");
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				} else {
					JOptionPane.showMessageDialog(getParent(), "닉네임을 입력하세용");
					jtf1.setText("");
					jtf1.requestFocus();
				}
			}
		});

		// 창 종료했을 때
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if (s != null) {
					try {
						Protocol p = new Protocol();
						p.setCmd(0);
						out.writeObject(p);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				} else {
					closed();
				}
			}
		});

		// 메시지 보내기
		jtf2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMsg();
			}
		});

		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMsg();
			}
		});
	}

	// 메시지 보내기
	private void sendMsg() {
		String msg = jtf2.getText().trim();
		if (msg.length() > 0) {
			try {
				// 메시지 보내기
				Protocol p = new Protocol();
				p.setCmd(2);
				p.setMsg(msg);
				out.writeObject(p);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		jtf2.setText("");
		jtf2.requestFocus();
	}

	private boolean connected() {
		boolean value = true;
		try {
			s = new Socket("192.168.0.91", 7778);
			out = new ObjectOutputStream(s.getOutputStream());
			in = new ObjectInputStream(s.getInputStream());

			new Thread(this).start();
			return value;
		} catch (Exception e) {
		}
		return false;
	}

	// 받기
	@Override
	public void run() {
		esc: while (true) {
			try {
				Object obj = in.readObject();
				if (obj != null) {
					Protocol p = (Protocol) obj;
					switch (p.getCmd()) {
					case 0: // 종료
						break esc;

					case 2: // 메시지 전달
						jta.append(p.getMsg() + "\n");
						jta.setCaretPosition(jta.getText().length());
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		closed();
	}

	// 프로그램 종료
	private void closed() {
		try {
			out.close();
			in.close();
			s.close();
			System.exit(0);
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				ChatClient cc = new ChatClient();
				cc.setVisible(true);
			}
		});
	}
}
