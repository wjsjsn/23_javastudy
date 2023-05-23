package day19.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Homework_grade extends JFrame implements ActionListener {
	JPanel jp1, jp2, jp3, sp1;
	JTextField name, kor, eng, math;
	JTextArea jta;
	JScrollPane jsp;
	JButton jb1, jb2, jb3;

	public Homework_grade() {
		super("성적");

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

		jta = new JTextArea(20, 0);
		jta.setEditable(false);
		jta.setLineWrap(true);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jp3 = new JPanel();
		jb1 = new JButton("계산");
		jb2 = new JButton("종료");
		jb3 = new JButton("초기화");

		jp3.add(jb1);
		jp3.add(jb2);
		jp3.add(jb3);

		add(sp1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp3, BorderLayout.SOUTH);

		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton) e.getSource();
	
		if (obj == jb2) {
			System.exit(0);
		} else if (obj == jb3) {
			name.setText("");
			kor.setText("");
			eng.setText("");
			math.setText("");
			jta.setText("");
		}
	
		String name;
		int sum;
		String hak;
		double avg;
		int su1 = 0, su2 = 0, su3 = 0;
	
		if (obj == jb1) {
			su1 = Integer.parseInt(kor.getText());
			su2 = Integer.parseInt(eng.getText());
			su3 = Integer.parseInt(math.getText());
		
			name = this.name.getText();
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
			jta.setText("이름 : " + name + "\n"
			+ "총점 : " + sum + "\n" 
			+ "평균 : " + avg + "\n" 
			+ "학점 : " + hak);
		}
	}

	public static void main(String[] args) {
		new Homework_grade();
	}
}
