package javaEx;

public class For_Ex1 {
	public static void main(String[] args) {
		//1~500까지 합을 구해서 출력
		//for(초기값; 조건; 증가치){}
		// 조건이 거짓이면 빠져나옴
		
		int result = 0;
		for(int i=1; i<=500; i++) {
			result+=i;
		}
		System.out.println("1~500까지의 합:"+result);
		
		int result1 = 0;
		for(int j=1; j<=100; j++) {
			result1+=j;
		}
		System.out.println("1~100까지의 합:"+result1);
		
		int result2 = 0;
		for(int k=500; k>=1; k++) {
			result2+=k;
		}
		System.out.println("1~100까지의 합:"+result2);
	}
}
