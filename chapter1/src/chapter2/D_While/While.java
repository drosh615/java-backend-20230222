package chapter2.D_While;

/*
 * while 반복문
 * 일반적으로 반복 횟수가 지정되어 있지 않을 때 사용하는 반복문
 */
public class While {

	public static void main(String[] args) {
		/*
		 * while
		 * 조건을 검사하고 해당 조건이 true 일 경우 코드 블록을 싱행하는 반복문
		 * if문의 반복 형태
		 * 반복 실행할 코드블록이 종료되면 조건을 다시 검사한다.
		 * true면 다시 반복, false면 탈출
		 * 사용방법:
		 * 		while (조건) {실행할 코드}
		 */
		int number = 0;
		while (true) {
			if (number % 2 ==0) {
				number++;
				continue;	//continue문을 만나면 코드불록내에서 
			}				//아래에 오는 모든 코드를 무시하고 다시 조건을 검사
							//일반적으로 continue문은 조건문과 함게 쓴다.
							//조건문의 코드블록 내에 해당 변수를 변경시켜주는 코드가 존재해야한다.
			System.out.println(number);
			number++;
			if(number ==200) break; // 반복문의 코드불록을 강제로 종료시킬 때 사용
									// 일반적으로 break문은  조건문과 함께 사용
		}
		
		/*
		 * do - while
		 * 반복 실행할 코드를 무조건 한번 실행한 후에 조건을 검사하는 반복문
		 * 사용방법:
		 * 		do {실행할 코드} while (조건) ;
		 */
		
		do {
			System.out.println(number);
			number++;
		} while (number < 200);
		System.out.println(number);
	}

}






