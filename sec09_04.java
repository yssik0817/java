package javaex;

public class sec09_04 {
	public static void main(String[] args) {
	      String str1 = "Java Programming";
	      String str2 = "Java IT CookBook";
	      
	      System.out.println("원 문자열1 ==> [" + str1 + "]");
	      System.out.println("원 문자열2 ==> [" + str2 + "]");
	      
	      System.out.println(str1.compareTo(str2));		//P와 I의 아스키 값 차이(80-73=7)
	      System.out.println("P와 I의 아스키 값 차이(80-73=7)");		//P와 I의 아스키 값 차이(80-73=7)
	      System.out.println(str1.contains("Java"));
	      
	      String str3 = "Java Programming";
			String str4 = "Java Programming";
			String str5 = new String("Java Programming");

			System.out.println("원 문자열3 ==> [" + str3 + "]");
			System.out.println("원 문자열4 ==> [" + str4 + "]");
			System.out.println("원 문자열5 ==> [" + str3 + "]\n");

			System.out.println("문자열3==문자열4 결과 :\t " + (str3 == str4));
			System.out.println("문자열3.equals(문자열4) 결과 : " + str3.equals(str4));
			System.out.println("문자열3==문자열5 결과 :\t " + (str3 == str5));
			System.out.println("문자열3과 문자열 5의 저장된 곳이 다름");
			System.out.println("문자열3.equals(문자열3) 결과 : " + str3.equals(str5));
	}
}
