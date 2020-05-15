package javaex;

import java.util.Scanner;

public class sec09_02 {
	public static void main(String[] args) {
		String str = "Java를 공부하는 중, Java는 재밌어요.^^";

		System.out.println("문자열 ==> " + str);

		System.out.print("제일 처음 나오는 Java 위치 ==> ");
		System.out.println(str.indexOf("Java"));
		System.out.print("마지막에 나오는 Java 위치 ==> ");
		System.out.println(str.lastIndexOf("Java"));
		
		String str1 = "   한글   ABCD  efgh  ";

		System.out.println("원 문자열 ==> [" + str1 + "]");
		System.out.println("대문자로  ==> [" + str1.toUpperCase() + "]");
		System.out.println("소문자로  ==> [" + str1.toLowerCase() + "]");
		System.out.println("공백제거  ==> [" + str1.trim() + "]");
		
		Scanner s = new Scanner(System.in);
		String str2, strRep, strSub, strAry[];

		System.out.print("문자열을 입력하세요 : ");
		str2 = s.nextLine();

		strRep = str2.replace(" ", "$");
		strSub = str2.substring(3, 8);
		strAry = str2.split(" ");

		System.out.println("입력 문자열 ==> " + str2);
		System.out.println("바꾼 문자열 ==> " + strRep);
		System.out.println("일부 문자열 ==> " + strSub);
		for (int i = 0; i < strAry.length; i++)
			System.out.println("분리한 문자열" + i + "==> " + strAry[i]);
		
		s.close();
	}
}
