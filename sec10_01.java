package javaex;

public class sec10_01 {
	public static void main(String[] args) {
		/*
		 * int[] aa = new int[3]; 
		 * try { aa[3] = 100; } 
		 * catch(ArrayIndexOutOfBoundsException e) {
		 * System.out.println("�迭 ÷�ڰ� �迭 ũ�⺸�� Ŀ�� ~~"); 
		 * }
		 */
		
		int[] bb = new int[3];
		try {
			bb[2] = 100 / 0;
			bb[3] = 100;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ÷�ڰ� �迭 ũ�⺸�� Ŀ�� ~~");
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ ���� ����!!!"+e.getMessage());
		} finally {
			System.out.println("�ݵ�� ���;��Ѵ�. ���� ���� �������");
		}
	}
}
