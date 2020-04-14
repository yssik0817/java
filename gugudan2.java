package javaEx;

public class gugudan2 {
	public static void main(String[] args) {
		
		/*
		  for(int j=2; j<10; j++) { 
		  System.out.println("===="+j+" 단 출력"+"=========");
		  
		  for( int i=1; i<=9; i++) { 
		  System.out.println(j+" * "+i+" = "+(i*j)); }
		  System.out.println("==========================="); }
		 */
		
		
		for(int j=2; j<10; j*=2) {
			System.out.printf("=="+j+" 단 출력"+"=="+"\t");
			System.out.println("=="+(j+1)+" 단 출력"+"==");
			
		for( int i=1; i<=9; i++) {
			System.out.printf(j+" * "+i+" = "+(i*j)+"\t");
			System.out.println((j+1)+" * "+i+" = "+(i*(j+1)));
		}
		System.out.println("**************************"+"\n");
	}
	}
}
