package javaex;

public class sec10_02 {
	public static void main(String[] args) {
		int a = 100, b = 0;
		int result;
		try {
			result = a / b;
		} catch (ArithmeticException e) {
			System.out.print("발생 오류 ==> ");
			System.out.println(e.getMessage());
		}
		System.out.println("===============================");
		int c = 1234;
		float d = 100.12345f;
		char ch = 'K';
		String s = "IT_Cookbook";

		System.out.printf("정수의 10진수 ==> %d\n", c);
		System.out.printf("정수의 16진수 ==> %X\n", c);
		System.out.printf("정수의  8진수 ==> %o\n", c);
		System.out.printf("실수 ==> %10.3f\n", d);
		System.out.printf("실수(공학용) ==> %e\n", d);
		System.out.printf("문자 ==> %c\n", ch);
		System.out.printf("문자열 ==> %s\n", s);
	}
}
