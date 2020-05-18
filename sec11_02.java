
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
		Car1 myCar1 = new Car1("빨강", 0);
		Car1 myCar2 = new Car1("파랑", 30);

		System.out.println("자동차1의 색상은 " + myCar1.getColor() 
		+ "이며, 현재속도는 " + myCar1.getSpeed() + "km 입니다.");
		System.out.println("자동차2의 색상은 " + myCar2.getColor() 
		+ "이며, 현재속도는 " + myCar2.getSpeed() + "km 입니다.");
	}
}