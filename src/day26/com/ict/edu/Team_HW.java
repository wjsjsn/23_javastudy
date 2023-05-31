package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Team_HW extends JFrame{
	JPanel jp1, jp2, jp3;
	JTextField id, name, phone, address, com, jtf;
	GridLayout gl1;
	JButton add, delete, update, search, clear, all;
	JComboBox jcb1;
	JTable jtb;
	JScrollPane jsp;

	public Team_HW() {
		super("표");
		
		JLabel jl = new JLabel("Address Book");
		jl.setHorizontalAlignment(JLabel.CENTER);
		
		jp1 = new JPanel(new GridLayout(5,1));
	
		id = new JTextField(15);
		name = new JTextField(15);
		phone = new JTextField(15);
		address = new JTextField(15);
		com = new JTextField(15);
		
		jp1.add(new JLabel("ID : "));
		jp1.add(id);
		jp1.add(new JLabel("이름 : "));
		jp1.add(name);
		jp1.add(new JLabel("전화 : "));
		jp1.add(phone);
		jp1.add(new JLabel("주소 : "));
		jp1.add(address);
		jp1.add(new JLabel("회사 : "));
		jp1.add(com);
		
	   jp2 = new JPanel();
	
		add = new JButton("추가");
		delete = new JButton("삭제");
		update = new JButton("수정");
		search = new JButton("검색");
		clear = new JButton("지우기");
		all = new JButton("전체보기");
		
		String[] arr = {"이름", "ID", "전화", "주소", "회사"};
		jcb1 = new JComboBox<String>(arr);
		
		jtf  = new JTextField(15);
		
		jp2.add(add);
		jp2.add(delete);
		jp2.add(update);
		jp2.add(jcb1);
		jp2.add(jtf);
		jp2.add(search);
		jp2.add(clear);
		jp2.add(all);
		
		Team_Table table = new Team_Table();
		jtb = new JTable(table);
		jsp = new JScrollPane(jtb);
		
		add(jl, BorderLayout.NORTH);
		add(jp1, BorderLayout.WEST);
		add(jsp, BorderLayout.EAST);
		add(jp2, BorderLayout.SOUTH);
		
		pack();
	    setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
public static void main(String[] args) {
	new Team_HW();
}
}
