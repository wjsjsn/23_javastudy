package day19.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

// 계산기 만들기(이벤트 처리)

public class Homework extends JFrame implements ActionListener, ItemListener{
	
	JPanel jp1, jp2;
	JTextField jtf1, jtf2;
	JRadioButton jrb1, jrb2, jrb3, jrb4;
	ButtonGroup bg;
	JTextArea jta;
	JScrollPane jsp;
	JButton jb1, jb2, jb3;
	
	public Homework() {
		 super("계산기");
		 
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
		 
		 jta = new JTextArea(20,0);
		 jta.setEditable(false);
		 jta.setLineWrap(true);
		 jsp = new JScrollPane(jta,
				 ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				 ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				 );
		 
		 jp2 = new JPanel();
		 
		 jb1 = new JButton("계산");
		 jb2 = new JButton("종료");
		 jb3 = new JButton("초기화");
		 
		 jp2.add(jb1);
		 jp2.add(jb2);
		 jp2.add(jb3);
		 
		 add(jp1, BorderLayout.NORTH);
		 add(jsp, BorderLayout.CENTER);
		 add(jp2, BorderLayout.SOUTH);
		 
		 pack();
		 setLocationRelativeTo(null);
		 setVisible(true);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		 jtf1.addActionListener(this);
		 jtf2.addActionListener(this);
		
		 jrb1.addItemListener(this);
		 jrb2.addItemListener(this);
		 jrb3.addItemListener(this);
		 jrb4.addItemListener(this);
		
		 jb1.addActionListener(this);
		 jb2.addActionListener(this);
		 jb3.addActionListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		JRadioButton obj = (JRadioButton)e.getSource();
		if (e.getStateChange() == e.SELECTED) {
			jta.append(obj.);
		}else if(e.getStateChange() == e.DESELECTED) {
			jta.append(obj.);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
	new Homework();
}

}
