package day17.com.ict.edu4;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex06_Layout extends JFrame {
public Ex06_Layout() {
	super("GridLayout");
	
	// 행이 기준
	JPanel jp = new JPanel(new GridLayout(5, 3));
	
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
	new Ex06_Layout();
}
}
