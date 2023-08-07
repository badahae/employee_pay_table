package employeePay;

/*
   <RegEmployee클래스>
   1) 정규직 사원을 나타내는 자식 클래스
   2) 추가로 dept, regpay, regtitle 필드와 RegEmployee()생성자
   3) 변수의 값을 연결한 문자열을 반환하는 toString()메소드
   4) 월 임금에 10만원을 더하여 급여액을 계산하는 erinings()메소드로 구성된다.
 */

public class RegEmployee extends Employee {
	// dept, regpay, regtitle 필드선언
	private String dept;
	private long regpay;
	private String regtitle;
	
	public RegEmployee(String name, String sno, String dept, long regpay, String regtitle) {
		super(name, sno);
		this.dept = dept;
		this.regpay = regpay;
		this.regtitle = regtitle;
	}

	@Override
	public String toString() {
		String result = "";
		result = super.toString() + ", 부서 : " + dept + ", 담당업무 : " + regtitle;
		return result;
	}

	@Override
	public long earning() {
		return regpay + 10;
	}
}
