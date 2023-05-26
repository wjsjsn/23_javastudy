package day22.com.ict.edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Ex01_JProgressBar extends JFrame {
	JPanel jp;
	JButton jb;
	JProgressBar jpb1, jpb2;

	public Ex01_JProgressBar() {
		super("프로그레스바 스레드");

		jp = new JPanel();
		jb = new JButton("start");
		jpb1 = new JProgressBar();
		jpb2 = new JProgressBar();

		jp.add(jb);
		jp.add(jpb1);
		jp.add(jpb2);

		add(jp);

		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 단일 스레드 처리
//		jb.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
		// 프로그레스바의 값
//				int cnt1 = 0;
//				int cnt2 = 0;

		// while (cnt1 <= jpb1.getMaximum() || cnt2 <= jpb2.getMaximum()) {
//					cnt1 = cnt1 + 1;
//					cnt2 = cnt2 + 1;

		// 바 표시
		// jpb1.setValue(cnt1);
		// jpb2.setValue(cnt2);

		// }
		// }
		// });

		// 멀티스레드
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {

					@Override
					public void run() {
						int cnt = 0;
						while (cnt < jpb1.getMaximum()) {
							cnt = cnt + (int) (Math.random() * 10);
							jpb1.setValue(cnt);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}

					}
				}).start();

				new Thread(new Runnable() {
					@Override
					public void run() {
						int cnt = 0;
						while (cnt < jpb2.getMaximum()) {
							cnt = cnt + (int) (Math.random() * 10);
							jpb2.setValue(cnt);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}).start();

			}
		});
	}

	public static void main(String[] args) {
		new Ex01_JProgressBar();
	}
}
