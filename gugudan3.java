package javaEx;

public class gugudan3 {
public static void main(String[] args) {
		
	
		for(int j=2; j<10; j+=3) {
			System.out.print("=="+j+" 단 출력"+"=="+"\t");
			System.out.print("=="+(j+1)+" 단 출력"+"=="+"\t");
			System.out.println("=="+(j+2)+" 단 출력"+"==");
			
		for( int i=1; i<=9; i++) {
			System.out.print(j+" * "+i+" = "+(i*j)+"\t");
			System.out.print((j+1)+" * "+i+" = "+(i*(j+1))+"\t");
			System.out.println((j+2)+" * "+i+" = "+(i*(j+2)));
		}
		System.out.println("*******************************************"+"\n");
	}
	}
}
