package chapter2.C_For;

/*
 * for 반복문
 * 규칙이 있는 작업을 반복하는 제어문
 * 일반적으로 반복 횟수가 정해져 있을 때 사용하는 반복문
 */
public class For {

	public static void main(String[] args) {
		/*
		 * for 반복문
		 * 특정한 변수가 증감하며 조건에 부 함하는 동안 반복하는 반복문
		 * 사용방법:
		 * 		for(변수 선언 혹은 초기화; 조건; 증감식) {실행할 코드}
		 * 변수 선언 혹은 초기화: 반복문을 위해 사용할 변수를 선언 혹은 초기화
		 * 조건: 반복을 계속하기 위한 조건, true이면 반복하고 false면 탈출
		 * 실행할 코드: 조건이 true일 때 실행할 코드
		 */
		int[] intArray5= new int[5];
		for(int index=0; index < intArray5.length; index++) {
			intArray5[index] = index +1;
			System.out.println(intArray5[index]);
			intArray5[index]=10;
		}
		
		for(int index=0; index < 5; index++) intArray5[index] = index +1;
		// 실행할 코드가 한 구문이면 
		
		
		
		/*
		 * for each 반복문
		 * 배열의 요소 값을 직접 사용하고자 할 때 배열을 반복하면서
		 * 요소를 하나씩 복사해서 사용할 수 있다.
		 * 사용방법: 
		 * 		for(배열 요소의 데이터타입 변수명: 배열)  {실행할 코드}
		 */
		for(int number:  intArray5) {
			System.out.println(number);
			number=10;
		}
	}

}








