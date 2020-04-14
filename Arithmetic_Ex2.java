package javaEx;

public class Arithmetic_Ex2 {

	public static void main(String[] args) {
		Arithmetic_Ex1 ath1 = new Arithmetic_Ex1();
		// 이름, data에 숫자 2개 넣기
		ath1.str = "윤성식";
		ath1.data1 = 1024;
		ath1.data2 = 16;
		int temp;
		// 출력할 때 메소드 실행 결과
		System.out.println(ath1.str);
		temp = ath1.add();
		System.out.println(temp);
		temp = ath1.sub();
		System.out.println(temp);
		temp = ath1.mul();
		System.out.println(temp);
		temp = ath1.div();
		System.out.println(temp);
	}

}
