package javaEx;

public class Arithmetic {
	public static void main(String[] args) {
		int result=1;
		//result = result + 2
		System.out.println(result+=2);
		System.out.println(result);
		/* System.out.println(++result); */
		System.out.println(result++);
		System.out.println(result);
		System.out.println(--result);
		
		String str = "A";
		System.out.println(1+2+str);
		System.out.println(str+1+2);
	}
	
}
