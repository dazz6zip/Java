package pack03;

// 신입 지원자 Tom
public class Ex21Tom implements Ex21Resume {
	private String irum, phone, juso;

	public Ex21Tom() {
	}

	@Override
	public void setIrum(String irum) {
		this.irum = irum;
	}

	@Override
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setJuso(String juso) { // tom 고유 메소드
		this.juso = juso;
	}
	
	@Override
	public void printData() {
//		Ex21Resume.SIZE = "b5"; // final 이므로 변경 불가
		System.out.println("용지 규격 : " + Ex21Resume.SIZE);
		System.out.println("이름 : " + irum + ", 전화번호 : " + phone + ", 주소 : " + juso);
	}

}
