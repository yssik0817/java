package javaex;
//�����ε�
class Calc {
	void addValue (double v1, double v2) {
		System.out.println("double�� ��� ==> " + (v1 + v2));
	}
	void addValue (int v1, int v2) {
		System.out.println("int�� ��� ==> " + (v1 + v2));
	}
}

public class sec11_05 {
	public static void main(String[] args) {
		Calc myCalc = new Calc();
		
		myCalc.addValue(2.0, 2.0);	
		myCalc.addValue(1, 1);
	}
}
