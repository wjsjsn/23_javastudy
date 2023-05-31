package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex05_File_Save2 extends JFrame {
	JPanel jp1;
	static JTextField jtf;
	JButton jb1;
	static JTextArea jta;
	JScrollPane jsp;

	public Ex05_File_Save2() {
		super("저장하기");

		jp1 = new JPanel();
		jtf = new JTextField(20);
		jb1 = new JButton("저장");

		jp1.add(new JLabel("저장경로 : "));
		jp1.add(jtf);
		jp1.add(jb1);

		jta = new JTextArea(20, 30);
		jta.setLineWrap(true);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		add(jp1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);

		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		jb1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String pathname = jtf.getText();
				File file = new File(pathname);
				FileOutputStream fos = null;
				BufferedOutputStream bos = null;
				try {
					fos = new FileOutputStream(file);
					bos = new BufferedOutputStream(fos);
					
					String str = jta.getText();
					byte[] arr = str.getBytes();
					bos.write(arr);
					bos.flush();
				} catch (Exception e1) {
				}finally {
					try {
						bos.close();
						fos.close();
					} catch (Exception e2) {
					}
				}
			}
		});
	}
	public static void main(String[] args) {
		new Ex05_File_Save2();

	}
}
