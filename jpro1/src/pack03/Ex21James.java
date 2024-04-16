package pack03;

// 신입 지원자 James
public class Ex21James implements Ex21Resume {
	private String irum, phone, skill;

	public Ex21James() {
	}

	@Override
	public void setIrum(String irum) {
		if (irum.equals(null)) { // String 값이기 때문에 .equals 사용
			this.irum = "아무개";
		} else {
			this.irum = irum;
		}
	}

	@Override
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setSkill(String skill) { // tom 고유 메소드
		this.skill = skill;
	}

	@Override
	public void printData() {
//		Ex21Resume.SIZE = "b5"; // final 이므로 변경 불가
		System.out.println("이력서 용지 규격 : " + Ex21Resume.SIZE);
		System.out.println("이름 : " + irum + ", 전화번호 : " + phone + ", 보유 기술 : " + skill);
	}

}
