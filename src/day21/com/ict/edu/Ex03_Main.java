package day21.com.ict.edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex03_Main extends JFrame {
	JButton jb1, jb2;
	JPanel jp;

	public Ex03_Main() {
		super("여러 창 사용");

		jp = new JPanel();

		jb1 = new JButton("회원가입");
		jb2 = new JButton("로그인");

		jp.add(jb1);
		jp.add(jb2);

		add(jp);

		setSize(500, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 익명내부클래스에서는
				// this 사용할 때 클래스이름.this 해야함
				new Ex03_Join(Ex03_Main.this);
				setVisible(false);
			}
		});
	}

	public static void main(String[] args) {
		new Ex03_Main();
	}
}
