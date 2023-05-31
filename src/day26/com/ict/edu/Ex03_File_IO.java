package day26.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// D:/pcl/test01.txt를 읽어서 D:/pcl/test02.txt에 내용 추가
public class Ex03_File_IO {
	public static void main(String[] args) {
		String pathname = "D:/pcl/test01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;

		String pathname2 = "D:/pcl/test02.txt";
		File file2 = new File(pathname2);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {

			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);

			fos = new FileOutputStream(file2, true);
			bos = new BufferedOutputStream(fos);

			// 모든 파일의 복사, 이동은 해당 방식으로
			int b = 0;
			while((b = bis.read()) != -1) {
				bos.write(b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
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
}
