package day21.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class hw_country extends JPanel{
	JPanel jp;
	JTextField jtf;
	JButton jb1, jb2, jb3;
	JTextArea jta;
	JScrollPane jsp;
	hw_main main;
	
public hw_country(hw_main main) {
	this.main = main;
	
	jp = new JPanel();
	jtf = new JTextField(15);
	jb1 = new JButton("확인");
	jb2 = new JButton("취소");
	jb3 = new JButton("뒤로가기");
	

	jp.add(new JLabel("나라 입력 : "));
	jp.add(jtf);
	jp.add(jb1);
	jp.add(jb2);
	jp.add(jb3);

	jta = new JTextArea(30, 30);
	jta.setLineWrap(true);
	jta.setEditable(false);
	jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
			ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

	add(jp, BorderLayout.NORTH);
	add(jsp, BorderLayout.CENTER);
	

	jtf.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			dataPrn();
		}
	});

	jb1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			dataPrn();
		}
	});

	jb2.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			jtf.setText("");
			jta.setText("");

			jtf.requestFocus();
		}
	});
	
	jb3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			main.card.show(main.jp, "panel");
		}
	});
}

public void dataPrn() {
	HashMap<String, String> map = new HashMap<>();
	map.put("대한민국", "서울");
	map.put("캐나다", "오타와");
	map.put("영국", "런던");
	map.put("스위스", "베른");
	
	Set<String> keys = map.keySet();
	if (jtf.getText().length() == 0) {
		jta.append("데이터를 입력하세요\n");
		jtf.requestFocus();
	}else {
		String str = jtf.getText().trim();
		if (keys.contains(str)) {
			String city = map.get(str);
			jta.append(str + "의 수도는 " + city + "입니다.\n");
		}else {
			jta.append("데이터에 없는 나라입니다.\n");
		}
		jtf.setText("");
		jtf.requestFocus();
	}
}
}
