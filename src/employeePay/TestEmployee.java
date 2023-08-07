package employeePay;

import java.util.Scanner;

/*
   <TestEmployee클래스> - 다음조건에 맞추어 직접 작성한다
   1. 입력 자료 수는main(String[] args) 이용하여 입력 받는다.
   2. 사원번호, 이름을 입력
   3. 사원의 근무유형은 관리직(1), 정규직(2), 임시직(3)으로 구분한다.
   사원번호가 잘 못 입력되면 “근무유형 오류 재입력….”을 출력하고 다시 입력을 받는다.
   4. 관리자 - 직책과 임금을 입력
   정규직 - 부서, 업무, 임금을 입력
   임시직 - 부서, 월 근무시간수
   5. 직무 유형에 따라 수당
   관리자 : 20만원 정규직 : 10만원을 더해서 급여액을 더하여 출력한다.
   임시직 : 시간당 3만원으로 정하고 시간 수에 월급여액을 구해서 출력한다.
 */

public class TestEmployee {
	public static void main(String[] args) {
		// 필드선언시 클래스타입 => 임시직, 정규직
		TempEmployee tp;
		RegEmployee rp;
		// 필드선언시 기본타입변수, String no, name
		String no = null, name = null; // 가비지값이 들어가서 null을 넣어주는 것
		
		// 입력자료수 5개 => main메서드 매개변수인 args를 배열로 선언한다.
		int n = Integer.parseInt(args[0]);
		Scanner scan = new Scanner(System.in);
		// 부모의 클래스를 입력하는 개수로 배열을 만든다.
		Employee[] emp = new Employee[n];
		
		System.out.println("입력 자료 수 : " + n);
		// 1. 입력 자료수 만큼 반복문 for
		for(int i = 0; i < n; i++) {
			// 2. System.out.print("사원번호, 이름..");
			System.out.print("\n사원번호, 이름...");
			// 3. no, name에 사원번호와 이름을 넣는다.
			no = scan.next();
			name = scan.next();
			// 4. System.out.print("사원의 근무유형 : (1:CEO, 2:정규직, 3:임시직)...");
			System.out.print("사원의 근무유형 : (1:CEO, 2:정규직, 3:임시직)...");
			int eno = scan.nextInt(); // 5
			
			// 6. 입력된 no 1과 3사이에 있어야 된다. => if(no < 1 || no > 3)
			if(eno < 1 || eno > 3) {
				System.out.println("금무입력오류 재입력 ...."); // 1과 3 사이에 없으면 오류
				i--; // ++i해서 들어오기 때문에 --i로 해줘서 원래 숫자로 넣어줘야한다.
				continue; // for문으로 간다.
			}
			// 7. switch(eno) {
			switch(eno) {
			// 8. case 1 : Staff클래스적용
			//    입력은 직책(String) title, 급여(long)는 pay
			//    Staff sa = new Staff(name, no, title, pay)
			//	  emp[i] = sa
			case 1 :
				System.out.println("직책, 월 임금...");
				String title = scan.next();
				Long pay = scan.nextLong();
				Staff sa = new Staff(name, no, title);
				sa.setStaffpay(pay);
				emp[i] = sa;
				break;
			// 9. case 2 : RegEmployee클래스적용
			case 2 : 
				System.out.print("부서, 업무, 월 임금...");
				String dept = scan.next();
				String regtitle = scan.next();
				long regpay = scan.nextLong();
				rp = new RegEmployee(name, no, dept, regpay, regtitle);
				emp[i] = rp;
				break;
			// 10. case 3 : TempEmployee클래스적용
			case 3 :
				System.out.println("부서, 월 근무시간 수...");
				String hdept = scan.next();
				long temphour = scan.nextLong();
				tp = new TempEmployee(name, no, hdept, temphour);
				// tp.getTemphour();
				emp[i] = tp;
				break;
				// 11. default : 
			default : 
			}
		}
		
		// 급여보고서는 print로 출력
		// 향상된 for(데이터타입 변수 : 배열 emp) {
		// system.out.println(변수 + "급여액:"+변수.earningd()+"만원"	}
		// }
		System.out.println("\n                  급여 보고서");
		for(Employee e : emp) {
			System.out.println(e + ", 급여액 : " + e.earning() + "만원");
		}
		scan.close();
	}
}
