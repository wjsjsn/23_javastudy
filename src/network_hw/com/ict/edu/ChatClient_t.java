package network_hw.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ChatClient_t extends JFrame implements Runnable {
	JPanel contentPane;
	JTextField nickname_tf;
	JButton join_bt;
	JPanel card1;
	JPanel card2;
	JTextField input_tf;
	JTextArea jta;
	JScrollPane jsp;
	JButton send_bt;
	CardLayout cardLayout;

	// 접속
	Socket s = null;
	ObjectOutputStream out = null;
	ObjectInputStream in = null;

	public ChatClient_t() {
		super("멀티채팅 ver 0.2");

		// setBounds(120, 120, 340, 520);
		setLocationRelativeTo(null);
		cardLayout = new CardLayout();
		contentPane = new JPanel();
		// contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(cardLayout);
		add(contentPane);

		// 첫번째 카드
		card1 = new JPanel();
		contentPane.add(card1, "login");
		card1.setLayout(new BorderLayout());

		JPanel jp1 = new JPanel();
		card1.add(jp1, BorderLayout.SOUTH);
		jp1.setLayout(new GridLayout(2, 1));

		JPanel jp2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jp2.add(new JLabel("닉네임 : "));

		nickname_tf = new JTextField(10);
		jp2.add(nickname_tf);

		jp1.add(jp2);

		JPanel jp3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		join_bt = new JButton("입장하기");
		jp3.add(join_bt);

		jp1.add(jp3);

		JLabel img = new JLabel();
		img.setHorizontalAlignment(SwingConstants.CENTER);
		// img.setIcon(new
		// ImageIcon(ChatClient_t.class.getResource("/images/IMG_5856.JPG")));
		card1.add(new p_Canvas(), BorderLayout.CENTER);

		card2 = new JPanel();
		contentPane.add(card2, "chat");
		card2.setLayout(new BorderLayout());

		jta = new JTextArea();
		jta.setEditable(false);
		jta.setLineWrap(true);
		jta.setBackground(new Color(90, 90, 94));
		jta.setForeground(new Color(204, 204, 255));
		jta.setFont(new Font("궁서", Font.BOLD, 15));

		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		card2.add(jsp, BorderLayout.CENTER);

		JPanel jp4 = new JPanel(new BorderLayout());

		input_tf = new JTextField(10);
		jp4.add(input_tf, BorderLayout.CENTER);

		send_bt = new JButton("전송");
		jp4.add(send_bt, BorderLayout.EAST);
		card2.add(jp4, BorderLayout.SOUTH);

		setSize(340, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		join_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 사용자 닉네임 받기
				String name = nickname_tf.getText().trim();
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
							cardLayout.show(contentPane, "chat");
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				} else {
					JOptionPane.showMessageDialog(getParent(), "닉네임을 입력하세용");
					nickname_tf.setText("");
					nickname_tf.requestFocus();
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

		input_tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMsg();
			}
		});

		send_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMsg();
			}
		});
	}

	// 메시지 보내기
	private void sendMsg() {
		String msg = input_tf.getText().trim();
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
		input_tf.setText("");
		input_tf.requestFocus();
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
				ChatClient_t cc = new ChatClient_t();
				cc.setVisible(true);
			}
		});
	}
}
