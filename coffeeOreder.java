package javaex;

public class coffeeOreder {
public static void main(String[] args) {
	//���� Ŀ�Ǹ� �ֹ�(1)
	//���� Ŀ�Ǹ� �ֹ�(2)
	//���� Ŀ�Ǹ� �ֹ�(3)
	//���� Ŀ��, ���������� �ֹ�(1,1)
	//���� Ŀ��, ���������� �ֹ�(2,2)
	
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
