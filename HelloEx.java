package javaEx;

public class HelloEx {

	public static void main(String[] args) {
	
		//public 접근제한자 모든 객체에서 사용이 가능
		//private 접근제한자 중 클래스 내부에서만 사용 가능
		//protected 상속관계에서
		//없는 것(default)는 같은 페이지
		
		System.out.println("안녕");
		
		//객체로 사용하기
		//선언하고 생성
		
		/*
		 * HelloEx he = new HelloEx(); String str = he.toString();
		 * System.out.println("객체 String: "+str);
		System.out.println(args[0]);
		 */
	int arg1 = Integer.parseInt(args[0]);
	int arg2 = Integer.parseInt(args[1]);
	int arg3 = Integer.parseInt(args[2]);
	//사칙연산(+ - * / )
	System.out.println(arg1+arg2);
	System.out.println(arg1*arg3);
	System.out.println(arg1/arg3);
	
	}

}
