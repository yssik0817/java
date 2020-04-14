package javaEx;

public class String_Ex1 {
	public static void main(String[] args) {
		String s1 = "안녕한가?";
		String s2 = "안녕한가?";
		boolean r;			// true or false
		r= (s1==s2);		// 레퍼런스 변수 값을 비교
		System.out.println("s1과 s2는 같나? "+r);
		System.out.println("s1 "+s1.toString());
		System.out.println("s1 "+s2.toString());
		
		String st1 = new String("안녕");
		String st2 = new String("안녕");
		r= (st1.equals(st2));		// 내용 비교
		System.out.println("st1과 st2는 같나? "+r);
		System.out.println("st1 "+st1.toString());
		System.out.println("st2 "+st2.toString());
		
	}
}
