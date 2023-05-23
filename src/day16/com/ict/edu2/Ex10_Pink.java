package day16.com.ict.edu2;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Ex10_Pink extends JPanel {
	public Ex10_Pink() {
		setBackground(Color.PINK);

		JCheckBox jcb1 = new JCheckBox("+");
		JCheckBox jcb2 = new JCheckBox("-");
		JCheckBox jcb3 = new JCheckBox("*");
		JCheckBox jcb4 = new JCheckBox("/");
		
		jcb1.setBackground(Color.PINK);
		jcb2.setBackground(Color.PINK);
		jcb3.setBackground(Color.PINK);
		jcb4.setBackground(Color.PINK);

		add(jcb1);
		add(jcb2);
		add(jcb3);
		add(jcb4);
	}
}
