package chapter1.F_Operator;

/*
 * 산술연산자, 대입연산자, 비교연산자, 논리연산자, 삼항연산자
 */
public class Operator {

	public static void main(String[] args) {
		/*
		 * 산술 연산자
		 * 덧셈 연산자: +
		 * 좌항에 우항을 더한 값을 반환
		 */
		int addResult = 8 + 5;
		System.out.println(addResult);
		
		/*
		 * 뺄셈 연산자: -
		 * 좌항에 우항을 뺀 값을 반환
		 */
		int minusResult = 9 - 4;
		System.out.println(minusResult);
		
		/*
		 * 곱셈 연산자: *
		 * 좌항에 우항을 곱한 값을 반환
		 */
		int multiResult = 8 * 3;
		System.out.println(multiResult);
		
		/*
		 * 나눗셈 연산자: /
		 * 좌항에 우항을 나눈 값을 반환
		 */
		double divisionResult = 7.0 / 2;
		System.out.println(divisionResult);
		
		/*
		 * 나머지 연산자: %
		 * 좌항에 우항을 나눈 나머지를 반환
		 */
		int remainderResult2 = 8 % 3;
		System.out.println(remainderResult2);
		
		/*
		 * 정수와 정수를 연산하면 정수가 반환된다.
		 * 실수와 정수를 연산하면 실수가 반환된다.
		 * 실수와 실수를 연산하면 실수가 반환된다.
		 */
		
		/*
		 * 증감연산자: "변수" 자신을 1증가 혹은 감소
		 * 증가연산자: ++
		 */
		int integer1 = 10;
		System.out.println(integer1);	//10
		System.out.println(++integer1);	//11 증가하고 읽는다
		System.out.println(integer1);	//11
		System.out.println(integer1++);	//11 읽고 증가한다
		System.out.println(integer1);	//12
		
		/*
		 *  상수에는 증감연산자 사용 불가
		 *  final int NUMBER = 0;
		 *  NUMBER++;
		 *  0++;
		 */
		
		// 감소연산자: --
		int integer2 = 10;
		int integer3 = 5;
		int sampleinteger = integer2 / --integer3;
		
		/*
		 * 대입 연산자
		 * 좌항에 우항을 (누적) 대입
		 * 좌항에는 무조건 변수만 지정할 수 있다.
		 * =: 좌항에 우항을 대입
		 * +=: 좌항에 우항을 더한 값을 대입
		 */
		int number3 = 10;
		number3 += 2;
		System.out.println(number3);
		
		// -=: 좌항에 우항을 뺀 값을 대입
		number3 -= 5;
		System.out.println(number3);
		
		// *=: 좌항에 우항을 곱한 값을 대입
		number3 *= 3;
		System.out.println(number3);
		
		// /=: 좌항에 우항을 나눈 값을 대입
		number3 /= 4;
		System.out.println(number3);
		
		// &=: 좌항에 우항을 나눈 나머지 값을 대입
		number3 %= 3;
		System.out.println(number3);
		
		/*
		 * 비교 연산자
		 * 좌항을 우항과 비교한 결과를 논리값(true, false) 으로 반환
		 * 
		 * ==: 좌항이 우항과 같다면 true, 아니면 false 반환
		 */
		boolean boolean1 = 10 == 12;
		System.out.println(boolean1);
		
		// !=: 좌항이 우항과 다르다면 true, 아니면 false 반환
		boolean boolean2 = 10 != 12;
		System.out.println(boolean2);
		
		/*
		 *  >: 좌항이 우항보다 크면 true, 아니면 false 반환
		 *  >=: 좌항이 우항보다 크거나 같으면 true, 아니면 false 반환
		 *  <: 좌항이 우항보다 작으면 true, 아니면 false 반환
		 *  <=: 좌항이 우항보다 작거나 같으면 true, 아니면 false 반환
		 */
		boolean boolean3 = 10 > 10;
		boolean boolean4 = 10 >= 10;
		System.out.println(boolean3);
		System.out.println(boolean4);
		boolean boolean5 = 10 < 10;
		boolean boolean6 = 10 <= 10;
		System.out.println(boolean5);
		System.out.println(boolean6);
		
		/*
		 * 논리 연산자
		 * 논리 값을 연산하는 연산자. 좌항과 우항에 논리가 있어야한다
		 * 
		 * &&: and 연산
		 * 좌항과 우항이 모두 true일 때 true, 아니면 false 반환
		 */
		int number4 = 5;
		int number5 = 4;
		boolean boolean7 = (number4 > number5) && true;
		
		/*
		 * ||: or 연산자
		 * 좌항과 우항 중 하나라도 true이면 true, 아니면 false 반환
		 */
		int number6 = 5;
		int number7 = 4;
		boolean boolean8 = (number6 > number7) || true;	
		
		boolean boolean9 = (number4 < number5) && (number5++ < number4);
		// && 보고서 앞에 논리가 false이니까 뒤 논리는 보지도 않는다. 증가되지 않음
		
		/*
		 * !: not
		 * 논리값의 부정을 반환
		 */
		boolean boolean10 = !(number6 > number7);
		System.out.println(boolean10);
		
		/*
		 * 삼항 연산자
		 * 조건에 따라 다른 결과를 반환하는 연산자
		 * 조건 ? 참일 때 결과 : 거짓일 떄 결과
		 */
		String string1 = number6 > number7 ? "앞수가 더 큽니다" : "뒷수가 더 큽니다";
		System.out.println(string1);
	}

}














