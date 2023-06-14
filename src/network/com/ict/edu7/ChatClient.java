package network.com.ict.edu7;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ChatClient extends JFrame {
	JPanel jp, card1, card2, text, main;
	JTextField jtf1, jtf2;
	JButton jb1, jb2;
	CardLayout cardLayout;
	JTextArea jta;
	JScrollPane jsp;

	public ChatClient() {
		super("멀티 채팅방 ver 0.2");

		jp = new JPanel();
		cardLayout = new CardLayout();
		jp.setLayout(cardLayout);
		
		card1 = new JPanel();
		jtf1 = new JTextField(10);
		jb1 = new JButton("입장하기");

		main = new JPanel();
		main.add(new JLabel("닉네임 : "));
		main.add(jtf1);
		main.add(jb1);

		card1.add(new p_Canvas());
		card1.add(main, BorderLayout.SOUTH);

		card2 = new JPanel();
		card2.setLayout(new BorderLayout());
		card2.setBackground(new Color(204, 204, 255));

		jtf2 = new JTextField(20);
		jb2 = new JButton("전송");

		jta = new JTextArea(200, 300);
		jta.setFont(new Font("궁서", Font.BOLD, 20));
		jta.setEditable(false);
		jta.setLineWrap(true);

		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		text = new JPanel();
		text.add(jtf2);
		text.add(jb2);

		card2.add(jsp, BorderLayout.CENTER);
		card2.add(text, BorderLayout.SOUTH);


		jp.add("main", card1);
		jp.add("chat", card2);

		add(jp);

		setVisible(true);
		setSize(340, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String msg = jtf1.getText().trim();
				if (msg.length() > 0) {
					cardLayout.next(jp);
				} else {
					JOptionPane.showMessageDialog(getParent(), "닉네임을 입력하세용");
				}
			}
		});
	}

	public static void main(String[] args) {
		new ChatClient();
	}
}
