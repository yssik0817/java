package sec07_inheritance;

public class CellPhone {
	//�ʵ�
	
	String model;
	String color;
	//������
	
	void powerOn() {System.out.println("������ �մϴ�.");}
	void powerOff() {System.out.println("������ ���ϴ�.");}
	void bell() {System.out.println("��ȭ�� �︳�ϴ�.");};
	
	void sendVoice(String message) {System.out.println("�ڱ�: "+message);}
	void receiveVoice(String message) {System.out.println("����: "+message);}
	
	//�޼ҵ�

}
