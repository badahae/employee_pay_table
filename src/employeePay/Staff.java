package employeePay;

/*
   <Staff클래스>
   1) Staff클래스는 Employee클래스의 name, sno 필드와 toString() 메소드를 상속 받는다.
   2) 추가로 자신의 title와 staffpay변수를 갖으며 상속받는 2개의 변수와 자신의 변수를 초기화할 생성자를 갖는다.
   3) 자식클래스의 생성자의 매개변수는 자신의 변수를 초기화하기 위한 2개의 매개변수뿐만 아니라 상속받는 2개의 변수를 초기화 하기 위한 매개변수도 나타내야 한다.
   4) Employee 부모클래스의 name - > ename 매개변수의 값, sno - > esno 매개변수의 값을 가지고 온다.
   5) 클래스의 각 변수의 값
   출력할 형태로 연결된 문자열을 반환하는 toString()메소드
   super를 넣으면 toString을 재정의 할 수 있다.(다시 부모것을 불러올 수 있다.)
   급여를 정하여 반환하는 earnings() 메소드
 */

public class Staff extends Employee {
	// 필드추가 
	// 자신의 title와 staffpay변수
	String title;
	Long staffpay;

	public Staff(String ename, String esno, String title) {
		super(ename, esno);
		this.title = title;
	}
	public Long getStaffpay() {
		return staffpay;
	}
	public void setStaffpay(Long staffpay) {
		this.staffpay = staffpay;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", 직책 : " + title + ", ";
	}
	// 급여를 정하여 반환하는 earnings() 메소드 오버라이딩
	@Override
	public long earning() {
		return staffpay + 20;
	}
}
