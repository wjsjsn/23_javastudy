package network.com.ict.edu7;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class p_Canvas extends Canvas{

	public void paint(Graphics g) {
		Image image = Toolkit.getDefaultToolkit().getImage("src/images/IMG_5856.JPG");
		g.drawImage(image,10, 10, 300, 380, this); // 원래크기	
	}
}
