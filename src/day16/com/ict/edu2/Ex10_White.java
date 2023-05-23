package day16.com.ict.edu2;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex10_White extends JPanel {
	public Ex10_White() {
		setBackground(Color.WHITE);

		JRadioButton jrb1 = new JRadioButton("+");
		JRadioButton jrb2 = new JRadioButton("-");
		JRadioButton jrb3 = new JRadioButton("*");
		JRadioButton jrb4 = new JRadioButton("/");
        
		jrb1.setBackground(Color.WHITE);
		jrb2.setBackground(Color.WHITE);
		jrb3.setBackground(Color.WHITE);
		jrb4.setBackground(Color.WHITE);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);

		add(jrb1);
		add(jrb2);
		add(jrb3);
		add(jrb4);
	}
}
