package javaex;
class Car3 {
	String color;
	int speed;
	static int count = 0;

	Car3() {
		count++;
	}
}

public class sec11_04 {
	public static void main(String[] args) {
		Car3 myCar1 = new Car3();
		System.out.println("���� ����� �ڵ��� ���� ==> " + myCar1.count);

		Car3 myCar2 = new Car3();
		System.out.println("���� ����� �ڵ��� ���� ==> " + myCar2.count);

		Car3 myCar3 = new Car3();
		System.out.println("���� ����� �ڵ��� ���� ==> " + Car3.count);
	}
}