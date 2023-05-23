package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex04_Layout extends JFrame{
public Ex04_Layout() {
	super("JPanel을 BorderLay로 변경");
	// 아무것도 하지 않으면 자동으로 FlowLayout임
			// JPanel jp = new JPanel();

	// JPanel을 BorderLayout으로 변경
	// 방법 1.
	// JPanel jp = new JPanel(new BorderLayout());
	
	// 방법 2. 
   JPanel jp = new JPanel();
   jp.setLayout(new BorderLayout());
	
			JButton jb1 = new JButton("버튼 1");
			JButton jb2 = new JButton("버튼 2");
			JButton jb3 = new JButton("버튼 3");
			JButton jb4 = new JButton("버튼 4");
			JButton jb5 = new JButton("버튼 5");
			JButton jb6 = new JButton("버튼 6");
			JButton jb7 = new JButton("버튼 7");
			JButton jb8 = new JButton("버튼 8");

			jp.add(jb1, BorderLayout.NORTH);
			jp.add(jb2,BorderLayout.CENTER);
			jp.add(jb3,BorderLayout.SOUTH);
			jp.add(jb4,BorderLayout.WEST);
			jp.add(jb5,BorderLayout.EAST);
		

			add(jp);
			
			Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
			setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);

}
	
	public static void main(String[] args) {
	new Ex04_Layout();
}
}
