package javaex;

public class coffeeOreder {
public static void main(String[] args) {
	//연한 커피만 주문(1)
	//보통 커피만 주문(2)
	//진한 커피만 주문(3)
	//연한 커피, 설탕만으로 주문(1,1)
	//보통 커피, 설탕만으로 주문(2,2)
	
	coffee cm= new coffee();
	cm.make(1);
	cm.make(2);
	cm.make(3);
	
	cm.make(1,1);
	cm.make(2,2);
	cm.make(3,3);
	
	cm.make(1,1,1);
	cm.make(2,2,2);
	cm.make(3,3,3);
	
	}
}
