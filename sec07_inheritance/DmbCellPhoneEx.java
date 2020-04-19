package sec07_inheritance;

public class DmbCellPhoneEx {
	public static void main(String[] args) {
		//DmbCellPhone  객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("갤럭시", "화이트", 10);
		
		//CellPhone 클래스로부터 상속받은 필드
		System.out.println("모델 : "+dmbCellPhone.model);
		System.out.println("색상 : "+dmbCellPhone.color);
		
		//DmbCellPhone 클래스로부터 상속받은 메소드 호출
		System.out.println("채널 : "+ dmbCellPhone.channel);
		
		//CellPhone 클래스로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		dmbCellPhone.bell();
		
		//DmbCellPhone 클래스의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(11);
		dmbCellPhone.turnOffDmb();
	}
}
