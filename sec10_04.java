package javaex;

import java.io.IOException;

public class sec10_04 {
	public static void main(String[] args) {
		String userName = "yun";
		String input = "";
		int key;

		try {
			System.out.print("�̸� ==> ");
			while ((key = System.in.read()) != 13) {
				input += Character.toString((char)key);
			}
			if (userName.equals(input))
				System.out.println(input + "�� ������� !!");
			else
				System.out.println(input + "�� ����� �ȵǾ����ϴ�.........");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}