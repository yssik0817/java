package javaex;

public class sec09_05 {
	static int coffee_machine(int button) {
		System.out.printf("\n# 1.(자동으로) 뜨거운 물을 준비한다\n");
		System.out.printf("# 2.(자동으로) 종이컵을 준비한다\n");

		switch (button) {
		case 1:
			System.out.printf("# 3.(자동으로) 보통커피를 탄다\n");	break;
		case 2:
			System.out.printf("# 3.(자동으로) 설탕커피를 탄다\n");	break;
		case 3:
			System.out.printf("# 3.(자동으로) 블랙커피를 탄다\n");	break;
		default:
			System.out.printf("# 3. (자동으로) 아무거나 탄다\n");	break;
			
			
			
			
			
		}
	}
}