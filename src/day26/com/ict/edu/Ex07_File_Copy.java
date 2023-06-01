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
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex07_File_Copy extends JFrame {
	JPanel jp1, jp2;
	JLabel jl1, jl2;
	JButton jb;
	JTextField jtf1, jtf2;

	public Ex07_File_Copy() {
		super("복사하기");

		JPanel sp = new JPanel(new GridLayout(2, 1));

		jp1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jl1 = new JLabel("원본위치 : ");
		jtf1 = new JTextField(10);

		jp1.add(jl1);
		jp1.add(jtf1);

		jp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jl2 = new JLabel("사본위치 : ");
		jtf2 = new JTextField(10);
		jb = new JButton("복사하기");

		jp2.add(jl2);
		jp2.add(jtf2);
		jp2.add(jb);

		sp.add(jp1);
		sp.add(jp2);

		add(sp, BorderLayout.CENTER);

		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		
		jtf1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String pathname = jtf1.getText().trim();
				if (pathname.length() > 0) {
					File file = new File(pathname);
					FileInputStream fis = null;
					BufferedInputStream bis = null;
					try {
						fis = new FileInputStream(file);
						bis = new BufferedInputStream(fis);
						byte[] b = new byte[(int) file.length()];
						bis.read(b);
						String msg = new String(b).trim();
						jtf1.setText(msg);
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
		});

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

		jtf2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "불러오기", FileDialog.LOAD);
				fd.setVisible(true);
				String msg = fd.getDirectory() + fd.getFile();
				if (!msg.equals("nullnull")) {
					jtf2.setText(msg);
				}
		}
		});
		
		jtf2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "불러오기", FileDialog.LOAD);
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
				String pathname = jtf2.getText().trim();
				if (pathname.length() > 0) {
					File file = new File(pathname);
					FileOutputStream fos = null;
					BufferedOutputStream bos = null;
					try {
						fos = new FileOutputStream(file);
						bos = new BufferedOutputStream(fos);

						String str = jtf1.getText().trim();
						byte[] arr = str.getBytes();
						bos.write(arr);
						bos.flush();

					} catch (Exception e1) {
					} finally {
						try {
							bos.close();
							fos.close();
						} catch (Exception e2) {
						}
					}
				}
			}
		});
	}

	public static void main(String[] args) {
		new Ex07_File_Copy();
	}
}
