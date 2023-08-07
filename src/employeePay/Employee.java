package employeePay;

/*
   <Employee 클래스>
   1) 전 직원을 대표하는 Employee 클래스를 부모 클래스로 정의한다.
   2) 관리자는 하위 Staff 클래스, 임시직과 정규직 사원을 나타내는 클래스는 
   각각 TempEmployee 클래스와 RegEmployee 클래스로 나타낸다.
   3) Employee 부모 클래스의 name(사원 이름)과 sno(사원번호) 멤버변수
   - 자식 클래스에서 이 멤버를 접근할 수 있도록 접근지정자를 지정한다.
   4) Employee() 생성자는 name->ename 과 sno->esno 매개변수를 사용하여 
   생성되는 인스턴스의 변수를 초기화한다.
   5) toString() 메소드는 인스턴스의 출력할 필드의 데이터를 문자열로 연결하고 이 문자열을 반환한다. 
   6) earnings()메소드는 급여를 정하여 반환하는 메소드이다.
 */

public class Employee {
	// 필드
	protected String name; // 자식클래스에서 이 멤버를 접근할 수 있도록 해줌
	protected String sno;
	
	// 생성자
	public Employee(String ename, String esno) {
		this.name = ename;
		this.sno = esno;
	}
	public String toString() { // 이름, 번호만 받는다.
		// 리턴타입을 넣어줘야 한다.
		return String.format("이름 : %s, 사원번호 : %s", name, sno); // name, sno 필드
	}
	public long earning() {
		System.out.println("급여액");
		return 0L; // 정수형 8바이트
	}
}
