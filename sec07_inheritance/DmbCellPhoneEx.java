package sec07_inheritance;

public class DmbCellPhoneEx {
	public static void main(String[] args) {
		//DmbCellPhone  ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("������", "ȭ��Ʈ", 10);
		
		//CellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
		System.out.println("�� : "+dmbCellPhone.model);
		System.out.println("���� : "+dmbCellPhone.color);
		
		//DmbCellPhone Ŭ�����κ��� ��ӹ��� �޼ҵ� ȣ��
		System.out.println("ä�� : "+ dmbCellPhone.channel);
		
		//CellPhone Ŭ�����κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		dmbCellPhone.bell();
		
		//DmbCellPhone Ŭ������ �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(11);
		dmbCellPhone.turnOffDmb();
	}
}
