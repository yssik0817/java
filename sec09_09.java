package javaex;
class myInt {
	int a;
}

public class sec09_09 {

	static void func1(myInt m) {
		m.a = m.a + 1;
		System.out.printf("���޹��� a ==> %d\n",  m.a);
	}

	public static void main(String[] args) {
		myInt m = new myInt();
		m.a = 10;
		
		func1(m);
		System.out.printf("func1() ���� ���� a ==> %d\n",  m.a);
	}
}
