package day21.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class hw_grade extends JPanel {
	JPanel jp1, jp2, jp3, sp1;
	JTextField name, kor, eng, math;
	JTextArea jta;
	JScrollPane jsp;
	JButton jb1, jb2, jb3, jb4;
	hw_main main;

	public hw_grade(hw_main main) {
		this.main = main;

		jp1 = new JPanel();
		name = new JTextField(10);

		jp2 = new JPanel();
		kor = new JTextField(10);
		eng = new JTextField(10);
		math = new JTextField(10);

		jp1.add(new JLabel("이름 : "));
		jp1.add(name);
		jp2.add(new JLabel("국어 : "));
		jp2.add(kor);
		jp2.add(new JLabel("영어 : "));
		jp2.add(eng);
		jp2.add(new JLabel("수학 : "));
		jp2.add(math);

		sp1 = new JPanel(new GridLayout(2, 1));
		sp1.add(jp1);
		sp1.add(jp2);

		jta = new JTextArea(30, 30);
		jta.setEditable(false);
		jta.setLineWrap(true);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jp3 = new JPanel();
		jb1 = new JButton("계산");
		 jb2 = new JButton("종료");
		jb3 = new JButton("초기화");
		jb4 = new JButton("뒤로가기");

		jp3.add(jb1);
		 jp3.add(jb2);
		jp3.add(jb3);
		jp3.add(jb4);

		add(sp1, BorderLayout.NORTH);
		add(jsp);
		add(jp3, BorderLayout.SOUTH);

		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name2;
				int sum;
				String hak;
				double avg;
				int su1 = 0, su2 = 0, su3 = 0;

				su1 = Integer.parseInt(kor.getText());
				su2 = Integer.parseInt(eng.getText());
				su3 = Integer.parseInt(math.getText());

				name2 = name.getText();
				sum = su1 + su2 + su3;
				avg = (int) (sum / 3.0 * 10) / 10.0;
				if (avg >= 90) {
					hak = "A학점";
				} else if (avg >= 80) {
					hak = "B학점";
				} else if (avg >= 70) {
					hak = "C학점";
				} else {
					hak = "F학점";
				}
				jta.setText("이름 : " + name2 + "\n" + "총점 : " + sum + "\n" + "평균 : " + avg + "\n" + "학점 : " + hak);
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
				name.setText("");
				kor.setText("");
				eng.setText("");
				math.setText("");
				jta.setText("");
			}
		});

		jb4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				main.card.show(main.jp, "panel");
			}
		});

	}
}
