package day21.com.ict.edu;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class hw_panel extends JPanel {
	CardLayout card;
	JPanel jp;
	JButton c, country, grade, end;

	public hw_panel(CardLayout card, JPanel jp) {
	
		this.card = card;
	    this.jp = jp;

		c = new JButton("계산기");
		country = new JButton("나라입력");
		grade = new JButton("성적");
		end = new JButton("나가기");
	
		add(c);
		add(country);
	    add(grade);
		add(end);
	    
		c.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(jp, "c");
			}
		});

		country.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(jp, "country");

			}
		});

		grade.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(jp, "grade");
			}
		});
		
		end.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
	}
}
