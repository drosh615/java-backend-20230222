package chapter1.B_Constant;

/*
 * 2. 상수
 * 변수와 마찬가지로 데이터를 보관할 수 있는 공간
 * 단, 상수는 한번 초기화하면 변경 불가능 (데이터를 담아서 밀봉하는 상자)
 * 
 * 일반적으로 값을 변경하면 안되는 데이터를 지정할때나,
 * 데이터에 이름을 부여하고 싶을 때 사용.
 * 
 * 상수 또한 선언 후 초기화가 반드시 이루어져야한다.
 */

public class Constant {

	public static void main(String[] args) {
		/*
		 * 상수 선언 방법
		 * final데이터타입 상수명 ; 
		 */
		final int NUMBER; 
		
		// 선언과 동시에 초기화
		final double PIE = 3.14; //한번도 사용하지 않아서 노란줄
		/*
		 * 상수 명명 규칙
		 * 1~3. 변수와 동일
		 * 4. Java 상수는 UPPER_SNAKE_CASE 명명 규칙을 사용
		 * 		(모든 문자를 대문자로 작성하고, 띄어쓰기를 _로 표기)
		 */
		final int WINDOW_WIDTH = 1920;
		final int WINDOW_HEIGTH = 1080;
		int size = WINDOW_WIDTH * WINDOW_HEIGTH;
		/*
		 *  리터럴 상수
		 *  프로그래밍 언어에는 데이터를 담아두는 상수와 리터럴 상수가 존재.
		 *  리터럴 상수는 데이터 그 자체를 의미. 1920
		 */
		
		
	}

}
