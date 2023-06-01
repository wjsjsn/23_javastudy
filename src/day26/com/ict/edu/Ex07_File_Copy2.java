package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex07_File_Copy2 extends JFrame {
	JPanel jp1, jp2;
	JButton jb;
	JTextField jtf1, jtf2;
	
	public Ex07_File_Copy2() {
		super("복사하기");

		JPanel sp = new JPanel(new GridLayout(2, 1));

		jp1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jtf1 = new JTextField(15);

		jp1.add(new JLabel("원본위치 : "));
		jp1.add(jtf1);

		jp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jtf2 = new JTextField(15);

		jb = new JButton("복사하기");

		jp2.add(new JLabel("사본위치 : "));
		jp2.add(jtf2);
		jp2.add(jb);

		sp.add(jp1);
		sp.add(jp2);

		add(sp);

		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		// 원본파일 불러오기 : LOAD
		jtf1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "불러오기", FileDialog.LOAD);
				fd.setVisible(true);
				String msg = fd.getDirectory() + fd.getFile();
				if (!msg.equals("nullnull")) {
					jtf1.setText(msg);
				}
			}
		});

		// 사본파일 저장 : SAVE
		jtf2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "저장하기", FileDialog.SAVE);
				fd.setVisible(true);
				String msg = fd.getDirectory() + fd.getFile();
				if (!msg.equals("nullnull")) {
					jtf2.setText(msg);
				}
			}
		});

		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String oldPathName = jtf1.getText().trim();
				FileInputStream fis = null;
				BufferedInputStream bis = null;

				String newPathName = jtf2.getText().trim();
				FileOutputStream fos = null;
				BufferedOutputStream bos = null;

				try {
					fis = new FileInputStream(oldPathName);
					bis = new BufferedInputStream(fis);

					fos = new FileOutputStream(newPathName);
					bos = new BufferedOutputStream(fos);

					// 모든 파일의 복사, 이동은 해당 방식으로
					int b = 0;
					while ((b = bis.read()) != -1) {
						bos.write(b);
					}
					bos.flush();
					jtf1.setText("");
					jtf2.setText("");

				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				} finally {
					try {
						bos.close();
						fos.close();
						bis.close();
						fis.close();
					} catch (Exception e2) {
					}
				}
			}
		});
	}

	public static void main(String[] args) {
		new Ex07_File_Copy2();
	}
}
