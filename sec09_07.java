package javaex;

public class sec09_07 {
	static int a = 100;

	static void func1() {
		int a = 200;
		System.out.printf("func1()���� a�� ��==> %d\n", a);			//200
	}

	public static void main(String[] args) {
		func1();
		System.out.printf("main() ���� a�� ��==> %d\n", a);			//100
	}
}
