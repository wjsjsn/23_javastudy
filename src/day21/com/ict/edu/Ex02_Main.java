package day21.com.ict.edu;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02_Main extends JFrame {
	JPanel pg1;
	CardLayout cardLayout;

	public Ex02_Main() {
		super("카드 레이아웃2");

		pg1 = new JPanel();
		cardLayout = new CardLayout();
		pg1.setLayout(cardLayout);

		Ex02_Login login = new Ex02_Login(cardLayout, pg1);
		Ex02_Join join = new Ex02_Join(this);
		Ex02_Login_Okay okay = new Ex02_Login_Okay(this);
		pg1.add("login", login);
        pg1.add("join", join);
        pg1.add("okay", okay);
        
		add(pg1);
       
		// cardLayout.show(pg1, "okay");	
		setSize(500, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Ex02_Main();
	}
}
