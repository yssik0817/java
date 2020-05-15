package javaex;

public class sec09_08 {

	static void func1() {
		System.out.printf("void 형 메소드는 돌려줄게 없음.\n");
	}

	static int func2() {
		return 100;
	}

	
	static void func3(int a) {
		a = a + 1;
		System.out.printf("전달받은 a ==> %d\n", a);
	}

	
	public static void main(String[] args) {
		int b;

		func1();

		b = func2();
		System.out.printf("int 형 메소드에서 돌려준 값 ==> %d\n", b);
		
			int a = 10;

			func3(a);
			System.out.printf("func1() 실행 후의 a ==> %d\n", a);
		
		
	}
}
