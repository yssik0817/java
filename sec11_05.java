package javaex;
//오버로딩
class Calc {
	void addValue (double v1, double v2) {
		System.out.println("double값 계산 ==> " + (v1 + v2));
	}
	void addValue (int v1, int v2) {
		System.out.println("int값 계산 ==> " + (v1 + v2));
	}
}

public class sec11_05 {
	public static void main(String[] args) {
		Calc myCalc = new Calc();
		
		myCalc.addValue(2.0, 2.0);	
		myCalc.addValue(1, 1);
	}
}
