package javaex;

import java.util.Scanner;

public class sec09_02 {
	public static void main(String[] args) {
		String str = "Java�� �����ϴ� ��, Java�� ��վ��.^^";

		System.out.println("���ڿ� ==> " + str);

		System.out.print("���� ó�� ������ Java ��ġ ==> ");
		System.out.println(str.indexOf("Java"));
		System.out.print("�������� ������ Java ��ġ ==> ");
		System.out.println(str.lastIndexOf("Java"));
		
		String str1 = "   �ѱ�   ABCD  efgh  ";

		System.out.println("�� ���ڿ� ==> [" + str1 + "]");
		System.out.println("�빮�ڷ�  ==> [" + str1.toUpperCase() + "]");
		System.out.println("�ҹ��ڷ�  ==> [" + str1.toLowerCase() + "]");
		System.out.println("��������  ==> [" + str1.trim() + "]");
		
		Scanner s = new Scanner(System.in);
		String str2, strRep, strSub, strAry[];

		System.out.print("���ڿ��� �Է��ϼ��� : ");
		str2 = s.nextLine();

		strRep = str2.replace(" ", "$");
		strSub = str2.substring(3, 8);
		strAry = str2.split(" ");

		System.out.println("�Է� ���ڿ� ==> " + str2);
		System.out.println("�ٲ� ���ڿ� ==> " + strRep);
		System.out.println("�Ϻ� ���ڿ� ==> " + strSub);
		for (int i = 0; i < strAry.length; i++)
			System.out.println("�и��� ���ڿ�" + i + "==> " + strAry[i]);
		
		s.close();
	}
}
