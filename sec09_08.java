package javaex;

public class sec09_08 {

	static void func1() {
		System.out.printf("void �� �޼ҵ�� �����ٰ� ����.\n");
	}

	static int func2() {
		return 100;
	}

	
	static void func3(int a) {
		a = a + 1;
		System.out.printf("���޹��� a ==> %d\n", a);
	}

	
	public static void main(String[] args) {
		int b;

		func1();

		b = func2();
		System.out.printf("int �� �޼ҵ忡�� ������ �� ==> %d\n", b);
		
			int a = 10;

			func3(a);
			System.out.printf("func1() ���� ���� a ==> %d\n", a);
		
		
	}
}
