package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex05_File_Save extends JFrame {
	JPanel jp;
	JButton jb;
	JTextArea jta;
	JTextField jtf;
	JScrollPane jsp;
	JLabel jlb;

	public Ex05_File_Save() {
		super("저장하기");
		jp = new JPanel();
		jlb = new JLabel("파일경로 : ");
		jb = new JButton("save");
		jtf = new JTextField(30);
		jp.add(jlb);
		jp.add(jtf);
		jp.add(jb);

		jta = new JTextArea(40, 60);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

		add(jp, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 300, ds.height / 2 - 300, 600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String strpath = jtf.getText();
				String sj = jta.getText();
				if (strpath.length() > 0) {
					String tmp = Ex05_team.team(strpath, sj);
				}

			}
		});
	}

	public static void main(String[] args) {
		new Ex05_File_Save();
	}
}
