
package javaex;

class Car1 {
	private String color;
	private int speed;

	Car1(String color, int speed) {
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

public class sec11_02 {
	public static void main(String[] args) {
		Car1 myCar1 = new Car1("����", 0);
		Car1 myCar2 = new Car1("�Ķ�", 30);

		System.out.println("�ڵ���1�� ������ " + myCar1.getColor() 
		+ "�̸�, ����ӵ��� " + myCar1.getSpeed() + "km �Դϴ�.");
		System.out.println("�ڵ���2�� ������ " + myCar2.getColor() 
		+ "�̸�, ����ӵ��� " + myCar2.getSpeed() + "km �Դϴ�.");
	}
}