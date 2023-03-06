package chapter2.A_If;

/*
 * if 구문
 * 조건에 따라 실행시키고자 하는 로직이 다를 때 사용하는 구문
 */
public class If {

	public static void main(String[] args) {
		/*
		 * 단순 if 구문
		 * 조건이 true일 때 실행할 코드를 지정하는 구문
		 * 사용 방법: if (조건) { 조건이 true일 때 실행할 코드 }
		 */
		int age = 12;
		if (age > 19) {
			System.out.println("성인입니다.");
		}
		// if (age > 19) System.out.println("성인입니다.");
		System.out.println("조건 검사 완료");
		
		/*
		 * if - else 구문
		 * 조건이 true일 경우와 false일 경우 실행되는 코드를 각각 지정하는 구문
		 * 사용 방법: if (조건) { 조건이 true일 때 실행할 코드 }
		 * 			else { 조건이 false일 때 실행할 코드 }
		 */
		if (age > 19) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년자입니다.");
		}
		//if (age > 19) System.out.println("성인입니다.");
		//else System.out.println("미성년자입니다.");
		
		/*
		 * 중첩 if 구문 /어쩔 수 없는 경우에만 사용한다. 별로 안좋음
		 * if 구문 혹은 else 구문의 코드 블록 안에 if구문을 작성
		 */
		if (age <= 19) {
			if (age < 8) System.out.println("미취학 아동입니다.");
			else System.out.println("청소년입니다.");
		} else {
			System.out.println("미성년자입니다.");
		}
		
		if (age > 19) {
			System.out.println("성인입니다.");
		} else {
			if (age < 8) System.out.println("미취학 아동입니다.");
			else System.out.println("청소년입니다.");
		}
		
		/*
		 *  if - else if - else 구문
		 *  else 구문의 코드블록에 오는 코드가 한 줄일 때 {}를 제거할 수 있음을 이용
		 */
		if (age > 19) {
			System.out.println("성인입니다.");
		}else if (age < 8) {
			System.out.println("미취학 아동입니다.");
		}else {
			System.out.println("청소년입니다.");
		}
		
		boolean nomal = true;
		if (!nomal) System.out.println("오류 발생1");
		boolean nomal2 = true;
		if (!nomal2) System.out.println("오류 발생2");
		System.out.println("정상작동");
		// if -else 구문보다 훨씬 깔끔. 정상루트에서 비정상을 꺼내서 
		
	}
}












