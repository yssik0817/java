package javaex;

import java.io.FileInputStream;

public class sec10_06 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("c:/workspace/data.txt");
		int ch;
		byte[] bt = new byte[1024];

		int i = 0;
		while ((ch = fis.read()) != -1) {
			bt[i] = (byte) ch;
			i++;
		}

		System.out.print(new String(bt));
		fis.close();
	}
}