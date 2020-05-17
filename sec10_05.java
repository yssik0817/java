package javaex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class sec10_05 {
	public static void main(String[] args) throws Exception {
		//���� �����ϴ� ����
		FileInputStream fis=null;
		int ch;

		try {
			fis=new FileInputStream("c:/workspace/data.txt");
			while ((ch = fis.read()) != -1)
				System.out.print((char) ch);

		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("�Է½� ���� �߻�: "+e.getMessage());
		} finally {
			try { 	
				fis.close();
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}

	}
}