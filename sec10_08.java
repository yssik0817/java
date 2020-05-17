package javaex;

import java.io.File;
import java.util.Scanner;

public class sec10_08 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("C:/workspace/data3.txt"));
		int hap = 0;

		while (sc.hasNextLine())
			hap += sc.nextInt();

		System.out.println("гу╟Х : " + hap);
		sc.close();
	}
}