package javaEx;

public class Grade2 {
	public static void main(String[] args) {
		//객체 생성
		Grade g1 = new Grade();
		//main 메소드로 인수갑을 받은 것 사용
		int score = Integer.parseInt(args[0]);
		String grade = g1.gradeMethod1(score);
		System.out.println("당신의 학점은:  "+grade);
	}
}
