package dd.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FileDialog;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class hw_custid extends JFrame {
	JPanel jp1, jp2;
	JLabel jlb1, jlb2, jlb3, jlb4;
	JTextField custid, name, address, phone;
	JTextArea jta;
	JScrollPane jsp;
	JButton all, insert, delete, search, call, fix;
	String id, nm, ad, ph;

	Connection con = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	int result = 0;

	public hw_custid() {

		super("DB 연동 정보");

		jp1 = new JPanel(new GridLayout(4, 1));
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
		jta.setEditable(false);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
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

		all.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String user = "c##pcl";
					String password = "1111";

					con = DriverManager.getConnection(url, user, password);
					String sql = "select * from customer테이블";
					pstm = con.prepareStatement(sql);
					rs = pstm.executeQuery();

					while (rs.next()) {
						id = rs.getString(1);
						nm = rs.getString(2);
						ad = rs.getString(3);
						ph = rs.getString(4);

						jta.append(id + "\t");
						jta.append(nm + "\t");
						jta.append(ad + "\t");
						jta.append(ph + "\n");
					}

				} catch (Exception e2) {
				} finally {
					try {
						rs.close();
						pstm.close();
						con.close();
					} catch (Exception e3) {
					}
				}
			}
		});

		insert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String user = "c##pcl";
					String password = "1111";
					con = DriverManager.getConnection(url, user, password);

					String sql = "insert into customer테이블(custid, name, address, phone) values ( ?, ?, ?, ?)";

					pstm = con.prepareStatement(sql);
					pstm.setString(1, custid.getText());
					pstm.setString(2, name.getText());
					pstm.setString(3, address.getText());
					pstm.setString(4, phone.getText());

					result = pstm.executeUpdate();

					jta.append(custid.getText() + "\t");
					jta.append(name.getText() + "\t");
					jta.append(address.getText() + "\t");
					jta.append(phone.getText() + "\n");

					if (result > 0) {
						sql = "select * from customer테이블";
						pstm = con.prepareStatement(sql);
						rs = pstm.executeQuery();
						while (rs.next()) {
							id = rs.getString(1);
							nm = rs.getString(2);
							ad = rs.getString(3);
							ph = rs.getString(4);

							jta.append(id + "\t");
							jta.append(nm + "\t");
							jta.append(ad + "\t");
							jta.append(ph + "\n");
						}
					}
				} catch (Exception e2) {
				} finally {
					try {
						rs.close();
						pstm.close();
						con.close();
					} catch (Exception e3) {
					}
					custid.setText("");
					name.setText("");
					address.setText("");
					phone.setText("");
				}
			}
		});

		delete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String user = "c##pcl";
					String password = "1111";
					con = DriverManager.getConnection(url, user, password);
					String sql = "delete from customer테이블 where custid = ?";

					pstm = con.prepareStatement(sql);
					pstm.setString(1, custid.getText());
					result = pstm.executeUpdate();

					if (result > 0) {
						sql = "select * from customer테이블";
						pstm = con.prepareStatement(sql);
						rs = pstm.executeQuery();
						while (rs.next()) {
							id = rs.getString(1);
							nm = rs.getString(2);
							ad = rs.getString(3);
							ph = rs.getString(4);

							jta.append(id + "\t");
							jta.append(nm + "\t");
							jta.append(ad + "\t");
							jta.append(ph + "\n");
						}
					} else {
						System.out.println("삭제 실패");
					}

				} catch (Exception e2) {
				} finally {
					try {
						rs.close();
						pstm.close();
						con.close();
					} catch (Exception e3) {
					}
					custid.setText("");
					name.setText("");
					address.setText("");
					phone.setText("");
				}
			}
		});

		search.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String user = "c##pcl";
					String password = "1111";
					con = DriverManager.getConnection(url, user, password);

					String sql = "select * from customer테이블 where custid = ?";
					pstm = con.prepareStatement(sql);
					pstm.setString(1, custid.getText());
					rs = pstm.executeQuery();
					while (rs.next()) {
						id = rs.getString(1);
						nm = rs.getString(2);
						ad = rs.getString(3);
						ph = rs.getString(4);

						jta.append(id + "\t");
						jta.append(nm + "\t");
						jta.append(ad + "\t");
						jta.append(ph + "\n");

					}
				} catch (Exception e2) {
				} finally {
					try {
						rs.close();
						pstm.close();
						con.close();
					} catch (Exception e3) {
					}
				}
			}
		});

		call.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String user = "c##pcl";
					String password = "1111";
					con = DriverManager.getConnection(url, user, password);

					String sql = "select * from customer테이블 where custid = ?";
					pstm = con.prepareStatement(sql);
					pstm.setString(1, custid.getText());
					rs = pstm.executeQuery();
					while (rs.next()) {
					id = rs.getString(1);
					nm = rs.getString(2);
					ad = rs.getString(3);
					ph = rs.getString(4);

					custid.setText(id);
					name.setText(nm);
					address.setText(ad);
					phone.setText(ph);
					}
				} catch (Exception e2) {
				} finally {
					try {
						rs.close();
						pstm.close();
						con.close();
					} catch (Exception e3) {
					}
				}
			}
		});

		custid.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jta.setText("");
			}
		});
	}

	public static void main(String[] args) {
		new hw_custid();
	}
}
