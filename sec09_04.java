package javaex;

public class sec09_04 {
	public static void main(String[] args) {
	      String str1 = "Java Programming";
	      String str2 = "Java IT CookBook";
	      
	      System.out.println("�� ���ڿ�1 ==> [" + str1 + "]");
	      System.out.println("�� ���ڿ�2 ==> [" + str2 + "]");
	      
	      System.out.println(str1.compareTo(str2));		//P�� I�� �ƽ�Ű �� ����(80-73=7)
	      System.out.println("P�� I�� �ƽ�Ű �� ����(80-73=7)");		//P�� I�� �ƽ�Ű �� ����(80-73=7)
	      System.out.println(str1.contains("Java"));
	      
	      String str3 = "Java Programming";
			String str4 = "Java Programming";
			String str5 = new String("Java Programming");

			System.out.println("�� ���ڿ�3 ==> [" + str3 + "]");
			System.out.println("�� ���ڿ�4 ==> [" + str4 + "]");
			System.out.println("�� ���ڿ�5 ==> [" + str3 + "]\n");

			System.out.println("���ڿ�3==���ڿ�4 ��� :\t " + (str3 == str4));
			System.out.println("���ڿ�3.equals(���ڿ�4) ��� : " + str3.equals(str4));
			System.out.println("���ڿ�3==���ڿ�5 ��� :\t " + (str3 == str5));
			System.out.println("���ڿ�3�� ���ڿ� 5�� ����� ���� �ٸ�");
			System.out.println("���ڿ�3.equals(���ڿ�3) ��� : " + str3.equals(str5));
	}
}
