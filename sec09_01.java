package javaex;

import java.io.UnsupportedEncodingException;

public class sec09_01 {
	public static void main(String[] args) {
	String str = "IT CookBook. Java";
	int len = str.length();
	int len2 = 0;
	int len3 = 0;
	try {
		len2=str.getBytes("EUC-KR").length;
		len3=str.getBytes("UTF-8").length;
	} catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	}
	System.out.printf("���ڿ�  : %s \n", str);
	System.out.printf("���ڿ� ���� : %d \n", len);
	System.out.printf("���ڿ� ���� 2: %d \n", len2);
	System.out.printf("���ڿ� ���� 3: %d \n", len3);
	}
}
