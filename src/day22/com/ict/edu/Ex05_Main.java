package day22.com.ict.edu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Ex05_Main extends JFrame {
	Ex05_Canvas canvas = new Ex05_Canvas();

	public Ex05_Main() {
		super("원 찍기");

		add(canvas);

		setSize(300, 300);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 마우스 이벤트
		// MouseEvent : 컴포넌트 영역 내에서 마우스를 움직였을 때 발생하는 이벤트
		// ItemListener, ActionListener처럼 오버라이딩 메서드가 하나가 아니라
		// 두 개 이상이면 불필요한 메서드까지 오버라이딩 하게 됨
		// 이러한 단점을 고친 것이 Adapter()
		// getPoint() : int - 마우스 이벤트가 발생한 x 좌표를 얻어옴
//		canvas.addMouseListener(new MouseListener() {
//			
//			@Override
//			public void mouseReleased(MouseEvent e) {}			
//			@Override
//			public void mousePressed(MouseEvent e) {}
//	@Override
//			public void mouseExited(MouseEvent e) {}
//		@Override
//			public void mouseEntered(MouseEvent e) {}
//			@Override
//			public void mouseClicked(MouseEvent e) {}
//		});
		canvas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				canvas.x = e.getX();
				canvas.y = e.getY();
				canvas.repaint();
			}
		});
	}

	public static void main(String[] args) {
		new Ex05_Main();
	}
}
