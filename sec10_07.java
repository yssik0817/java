package javaex;

import java.io.BufferedReader;
import java.io.FileReader;

public class sec10_07 {
	public static void main(String[] args) throws Exception {
		FileReader fReader = new FileReader("C:\\workspace\\data2.txt");
		BufferedReader bReader = new BufferedReader(fReader);

		String str = null;

		while ((str = bReader.readLine()) != null) {
			System.out.println(str);
		}

		bReader.close();
		fReader.close();
	}
}