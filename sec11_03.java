package javaex;

class Car {
	private String color;
	private int speed;

	Car() {
	}

	Car(String color) {
		this.color = color;
	}

	Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}
}

public class sec11_03 {
	public static void main(String[] args) {
		Car myCar1 = new Car();
		Car myCar2 = new Car("����");
		Car myCar3 = new Car("�Ķ�", 30);

		System.out.println("�ڵ���1�� ������ " + myCar1.getColor() 
		+ "�̸�, ����ӵ��� " + myCar1.getSpeed() + "km �Դϴ�.");
		System.out.println("�ڵ���2�� ������ " + myCar2.getColor() 
		+ "�̸�, ����ӵ��� " + myCar2.getSpeed() + "km �Դϴ�.");
		System.out.println("�ڵ���3�� ������ " + myCar3.getColor() 
		+ "�̸�, ����ӵ��� " + myCar3.getSpeed() + "km �Դϴ�.");
	}
}