package javaex;

public class sec10_01 {
	public static void main(String[] args) {
		/*
		 * int[] aa = new int[3]; 
		 * try { aa[3] = 100; } 
		 * catch(ArrayIndexOutOfBoundsException e) {
		 * System.out.println("배열 첨자가 배열 크기보다 커요 ~~"); 
		 * }
		 */
		
		int[] bb = new int[3];
		try {
			bb[2] = 100 / 0;
			bb[3] = 100;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자가 배열 크기보다 커요 ~~");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누는 등의 오류!!!"+e.getMessage());
		} finally {
			System.out.println("반드시 나와야한다. 오류 여부 상관없음");
		}
	}
}
