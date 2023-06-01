package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex06_File_Open extends JFrame {
	JPanel jp1;
	static JTextField jtf;
	JButton jb1;
	static JTextArea jta;
	JScrollPane jsp;

	public Ex06_File_Open() {
		super("불러오기");

		jp1 = new JPanel();
		jtf = new JTextField(20);
		jb1 = new JButton("불러오기");

		jp1.add(new JLabel("파일 경로 : "));
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
				f_open();
			}
		});
		jtf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f_open();
			}
		});
		jtf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "불러오기", FileDialog.LOAD);
				fd.setVisible(true);
				String msg = fd.getDirectory() + fd.getFile();
				if(! msg.equals("nullnull")) {
				jtf.setText(msg);
				}
			}
		});
	}

	private void f_open() {
		String pathname = jtf.getText().trim();
		if(pathname.length()>0){
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			byte[] b = new byte[(int) file.length()]; 
			bis.read(b);
			String msg = new String(b).trim();
			jta.setText(msg);
			f_open();

		} catch (Exception e1) {
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
	}
	public static void main(String[] args) {
		new Ex06_File_Open();

	}
}
