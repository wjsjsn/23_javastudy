package day27.com.ict.edu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// DataInputStream과 DataOutputStream
// 기본자료형의 데이터를 주고받을 때 사용
// ** 반드시 입력 순서와 출력 순서를 맞춰야 함
// 기본생성자가 없어서 BufferedStream처럼 FileStream을 이용해야 함

public class Ex01_dataStream {
	public static void main(String[] args) {
		String pathname = "D:/pcl/test03.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			
			// writeXXXX() => XXXX는 기본자료형
			dos.writeChar(97);
			dos.writeChar('A');
			dos.writeInt(245);
			dos.writeDouble(178.95);
			dos.writeBoolean(false);
			dos.writeChar('가');
			dos.writeChar(97);
			dos.writeChar('A');
			dos.flush();
			
			// readXXX() => xxx는 기본자료형
			// 반드시 쓰기 순서대로 읽어야함
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
	
		} catch (Exception e) {
		}finally {
			try {
				dis.close();
				fis.close();
				dos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}

	}
}
