package javaEx;

public class StringBuffer_Ex1 {
	public static void main(String[] args) {
		StringBuffer sf = new StringBuffer("abcdfg");
		sf.append("hijk");
		System.out.println(sf);	// abcdfghijk => 맨뒤에 'hijk 붙임'
		
		sf.insert(3, "ABC");	
		//insert() : 삽입될 위치 (0이 맨 앞), 삽입될 문자
		System.out.println(sf);		// abcABCdfghijk
		
		//delete(시작 번호, 끝 번호)
		sf.delete(6, sf.length());
		System.out.println(sf);		// abcABC
		
		StringBuilder sb = new StringBuilder("자바공부 시작했어요");
		sb.append(" 오늘");
		System.out.println(sb);
		
		int a= sb.indexOf("시작");
		System.out.println(a);		//5출력
		
		char c = sb.charAt(0);
		System.out.println(c);		//자 출력
		
	}
}