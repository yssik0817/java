package javaex;

public class sec10_02 {
	public static void main(String[] args) {
		int a = 100, b = 0;
		int result;
		try {
			result = a / b;
		} catch (ArithmeticException e) {
			System.out.print("�߻� ���� ==> ");
			System.out.println(e.getMessage());
		}
		System.out.println("===============================");
		int c = 1234;
		float d = 100.12345f;
		char ch = 'K';
		String s = "IT_Cookbook";

		System.out.printf("������ 10���� ==> %d\n", c);
		System.out.printf("������ 16���� ==> %X\n", c);
		System.out.printf("������  8���� ==> %o\n", c);
		System.out.printf("�Ǽ� ==> %10.3f\n", d);
		System.out.printf("�Ǽ�(���п�) ==> %e\n", d);
		System.out.printf("���� ==> %c\n", ch);
		System.out.printf("���ڿ� ==> %s\n", s);
	}
}
