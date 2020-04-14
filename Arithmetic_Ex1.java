package javaEx;

public class Arithmetic_Ex1 {

	// 클래스 전체사용하는 변수, 필드, 속성
	// 클래스 내부에 있는 메소드(기능)은 멤버메소드

	public String str;
	public int data1;
	public int data2;

	// add, sub, mul, div
	// 메소드는 접근 제한자, 반환값, 이름, 인수

	// 메소드 내 인수 인 data1, data2는 지역변수
	public int add() {
		return data1 + data2;
	};

	public int sub() {
		return data1 - data2;
	};

	public int mul() {
		return data1 * data2;
	};

	public int div() {
		return data1 / data2;
	};

}
