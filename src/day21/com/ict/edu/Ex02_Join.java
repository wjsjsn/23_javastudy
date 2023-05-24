package day21.com.ict.edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

// Main에 있는 cardLayout, pg1을 이용하기 위해 정보 받기
	// 새로 만들면 정보 교류 x
// 단, 전달 정보가 많으면 클래스(객체) 정보 받기
public class Ex02_Join extends JPanel{
	Ex02_Main main;
	JButton jb;
	
public Ex02_Join(Ex02_Main main) {
	// 생성자에서 받은 인자는 무조건 전역변수로 만듦
	this.main = main;
	
	jb = new JButton("뒤로가기");
	add(new JLabel("회원가입 창입니다."));
	
	add(jb);
	
	jb.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
         main.cardLayout.show(main.pg1, "login");
		}
	});
			
}
}
