package day17.com.ict.edu4;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 화면 배치 종류
// 1. FlowLayout : 화면 상단 가운데 정렬(JPanel)
// 2. BorderLayout : 동, 서, 남, 북, 가운데 배치
//                            방향 표시를 하지 않으면 마지막 컴포넌트가 화면을 채움(JFrame)
// 3. GridLayout : 격자 형태(행과 열)
// 4. BoxLayout : 하나의 행, 하나의 열로 만듦
// 5. CardLayout : 여러 장의 카드를 쌓아두고 하나씩 보여주는 형태
// 6. 절대좌표 : 컴포넌트마다 좌표를 직접 지정해서 배치

public class Ex02_Layout extends JFrame {
	public Ex02_Layout() {
		super("FlowLayout");
// 아무것도 하지 않으면 자동으로 FlowLayout임
		JPanel jp = new JPanel();

		JButton jb1 = new JButton("버튼 1");
		JButton jb2 = new JButton("버튼 2");
		JButton jb3 = new JButton("버튼 3");
		JButton jb4 = new JButton("버튼 4");
		JButton jb5 = new JButton("버튼 5");
		JButton jb6 = new JButton("버튼 6");
		JButton jb7 = new JButton("버튼 7");
		JButton jb8 = new JButton("버튼 8");

		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		jp.add(jb7);
		jp.add(jb8);

		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Ex02_Layout();
	}
}
