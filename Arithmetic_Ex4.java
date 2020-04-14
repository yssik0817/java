package javaEx;

public class Arithmetic_Ex4 {
	public static void main(String[] args) {
		//data type 기본형
		// 정수형 : byte, short, int, long / char
		// 실수형 : float, double
		
		byte a = 100;		//1byte
		short b = -500;		//2byte
		char c = '가';		//2byte	=> java에서는 숫자로 인식
		int d = 65555; 		//4byte
		long e = 4554645L;	//8byte
		float f = 2345.3f;	//4byte
		double g = -2342344.4625345;	//8byte
				
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
}
