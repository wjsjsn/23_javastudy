package day21.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class hw_c extends JPanel {
	hw_main main;
	JPanel jp1, jp2;
	JTextField jtf1, jtf2;
	JRadioButton jrb1, jrb2, jrb3, jrb4;
	ButtonGroup bg;
	JTextArea jta;
	JScrollPane jsp;
	JButton jb1, jb2, jb3, jb4;

	public hw_c(hw_main main) {
		this.main = main;

		jp1 = new JPanel();

		jtf1 = new JTextField(10);
		jtf2 = new JTextField(10);

		jrb1 = new JRadioButton(" + ");
		jrb2 = new JRadioButton(" - ");
		jrb3 = new JRadioButton(" * ");
		jrb4 = new JRadioButton(" / ");

		bg = new ButtonGroup();

		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);

		jp1.add(new JLabel("수 1 : "));
		jp1.add(jtf1);
		jp1.add(new JLabel("수 2 : "));
		jp1.add(jtf2);
		jp1.add(new JLabel("연산자 : "));
		jp1.add(jrb1);
		jp1.add(jrb2);
		jp1.add(jrb3);
		jp1.add(jrb4);

		jta = new JTextArea(20,30);
		jta.setEditable(false);
		jta.setLineWrap(true);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jp2 = new JPanel();

		jb1 = new JButton("계산");
		jb2 = new JButton("종료");
		jb3 = new JButton("초기화");
		jb4 = new JButton("뒤로가기");

		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);

		add(jp1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp2, BorderLayout.SOUTH);

		jb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				main.card.show(main.jp, "panel");
				
			}
		});
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double su = 0;
				double d1, d2;
				JButton obj = (JButton) e.getSource();

				Enumeration<AbstractButton> list = bg.getElements();
				while (list.hasMoreElements()) {
					d1 = Double.parseDouble(jtf1.getText());
					d2 = Double.parseDouble(jtf2.getText());
					AbstractButton abstractButton = (AbstractButton) list.nextElement();
					JRadioButton jb = (JRadioButton) abstractButton;
					if (jb.isSelected()) {
						if (obj == jb1) {
							if (jb == jrb1) {
								su = d1 + d2;
								jta.setText((int) d1 + " + " + (int) d2 + " = " + (int) su);
							} else if (jb == jrb2) {
								su = d1 - d2;
								jta.setText((int) d1 + " - " + (int) d2 + " = " + (int) su);
							} else if (jb == jrb3) {
								su = d1 * d2;
								jta.setText((int) d1 + " * " + (int) d2 + " = " + (int) su);
							} else if (jb == jrb4) {
								su = d1 / d2;
								jta.setText((int) d1 + " / " + (int) d2 + " = " + (int) (su * 10) / 10.0);
							}

						}
					}
				}
			}
		});
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		jb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bg.clearSelection();
				jtf1.setText("");
				jtf2.setText("");
				jta.setText("");

			}
		});

	}
}