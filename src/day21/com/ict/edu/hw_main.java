package day21.com.ict.edu;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class hw_main extends JFrame{
	CardLayout card;
	JPanel jp;

	public hw_main() {
		super("숙제");
		
		jp = new JPanel();
		card = new CardLayout();
	    jp.setLayout(card);
		
	hw_panel panel = new hw_panel(card, jp);
	hw_c c = new hw_c(this);
	hw_country country = new hw_country(this);
	hw_grade grade = new hw_grade(this);
	
	jp.add("panel",panel);
	jp.add("c", c);
	jp.add("country", country);
    jp.add("grade", grade);
				
		add(jp);
		  	
		//pack();
		setSize(500, 700);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {
		new hw_main();
	}
}
