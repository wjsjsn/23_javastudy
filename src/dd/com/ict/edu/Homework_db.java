package dd.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Homework_db extends JFrame{
	JPanel jp1, jp2;
	JLabel jlb1, jlb2, jlb3, jlb4;
	JTextField custid, name, address, phone;
	JTextArea jta;
	JScrollPane jsp;
	JButton all, insert, delete, search, call, fix;
	
    public Homework_db() {
	super("DB 연동 정보");
	
	jp1 = new JPanel(new GridLayout(4,1));
	jlb1 = new JLabel("CUSTID :            ");
	jlb1.setHorizontalAlignment(JLabel.CENTER);
	jlb2 = new JLabel("NAME :               ");
	jlb2.setHorizontalAlignment(JLabel.CENTER);
	jlb3 = new JLabel("ADDRESS :          ");
	jlb3.setHorizontalAlignment(JLabel.CENTER);
	jlb4 = new JLabel("PHONE :             ");
	jlb4.setHorizontalAlignment(JLabel.CENTER);

	custid = new JTextField(30);
	name = new JTextField(30);
	address = new JTextField(30);
	phone = new JTextField(30);
	
    jp1.add(jlb1);
	jp1.add(custid);
	jp1.add(jlb2);
	jp1.add(name);
	jp1.add(jlb3);
	jp1.add(address);
	jp1.add(jlb4);
	jp1.add(phone);

	jta = new JTextArea(20, 40);
	jta.setLineWrap(true);
	jsp = new JScrollPane(jta, 
			ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
			ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	
	jp2 = new JPanel();
	all = new JButton("전체보기");
	insert = new JButton("삽입");
	delete = new JButton("삭제");
	search = new JButton("검색");
	call = new JButton("불러오기");
	fix = new JButton("고치기");
	fix.setEnabled(false);
	
	jp2.add(all);
	jp2.add(insert);
	jp2.add(delete);
	jp2.add(search);
	jp2.add(call);
	jp2.add(fix);
	
	add(jp1, BorderLayout.NORTH);
	add(jsp, BorderLayout.CENTER);
	add(jp2, BorderLayout.SOUTH);
	
	pack();
	setVisible(true);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
public static void main(String[] args) {
	new Homework_db();
}
}
