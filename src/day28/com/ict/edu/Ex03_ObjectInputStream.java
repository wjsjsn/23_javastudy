package day28.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//ObjectInputStream : 객체 입력 스트림
//readObject() : 객체 역질렬화 메서드

public class Ex03_ObjectInputStream {
	public static void main(String[] args) {
		String pathname = "D:/pcl/object01.ser";
		File file = new File(pathname);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			//역질렬화
			ArrayList<Ex03_VO> list = //cast
					(ArrayList<Ex03_VO>) ois.readObject();
			
			for (Ex03_VO k : list) {
				System.out.print(k.getName() + "\t");
				System.out.print(k.getAge() + "\t");
				System.out.print(k.getAddr() + "\t");
				System.out.print(k.isGender() + "\t");
//				if(k.isGender()) {
//					System.out.print("남성\t");
//				}else {
//					System.out.print("여성\t");
//				}
				System.out.println(k.getHeight() + "\n");
			}
			
		} catch (Exception e) {
		}finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
		
	}
}