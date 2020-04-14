package javaEx;

public class gugudan {
	public static void main(String[] args) {
		
		int arg = Integer.parseInt(args[0]);
		int i, result=1;
		if(arg>10) {
			return;
		} else {
			for(i=1; i<10; i++) {
				result=arg*i;
				System.out.println(arg+"X"+i+"="+result);
			}
		}	
			
		int dan = Integer.parseInt(args[0]);
		if(dan>=1 && dan<=9) {
			System.out.println("***"+dan+"출력");
			for(int j=0; j<3; j++) {
				for(int k=1; k<=9; k++) {
				System.out.println(dan+" * " + k + " = "+(dan*k));
				}
			}
		}	
		
		/*
		  int dan = Integer.parseInt(args[0]); 
		  if(dan>=1 && dan<=9) {
		  System.out.println("***"+dan+"출력"); 
		  for(int j=1; j<10; j++) {
		  System.out.println(dan+" * " + j + " = "+(dan*j)); 
		  		} 
		  }
		 */
			
	}
}
