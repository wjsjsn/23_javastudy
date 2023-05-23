package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Ex10_Main extends JFrame{
	public Ex10_Main() {
	super("JTab_2");
	
	//JPanel을 상속한 클래스를 객체로 만들기
	Ex10_Black black = new Ex10_Black();
	Ex10_White white = new Ex10_White();
	Ex10_Pink pink = new Ex10_Pink();
	
	// JPanel들을 JTab에 넣기
	JTabbedPane jtab = new JTabbedPane();
	jtab.addTab("블랙 탭", black);
	jtab.addTab("화이트 탭", white);
	jtab.addTab("핑크 탭", pink);
	
	// JTab을 JFrame에 넣기
	add(jtab);
	
	Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
	setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	}
public static void main(String[] args) {
	new Ex10_Main();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
