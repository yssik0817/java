package javaex;

import java.util.Scanner;

public class sec10_03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		String str1, str2;

		System.out.print("byte  : ");		a = s.nextByte();
		System.out.print("short : ");		b = s.nextShort();
		System.out.print("int   : ");		c = s.nextInt();
		System.out.print("long  : ");		d = s.nextLong();
		System.out.print("float : ");		e = s.nextFloat();
		System.out.print("double: ");		f = s.nextDouble();
		System.out.print("str1  : ");		str1 = s.next();
		System.out.print("str2  : ");		str2 = s.nextLine();
		
		s.close();
	}
}