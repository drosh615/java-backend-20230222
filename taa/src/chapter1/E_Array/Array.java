package chapter1.E_Array;

/*
 * 배열
 * "같은 타입"의 변수가 나열된 형태
 * 배열은 "생성"해서 사용한다. 이러한 변수를 참조 변수라고 한다.
 * new 연산자로 생성할 수 있다.
 * 배열은 실제 데이터가 저장되는 것이 아니라, 저장된 첫번째 메모리 주소가 저장되는 것이다.
 */
public class Array {

	public static void main(String[] args) {
		// 동일한 그룹의 데이터를 변수로만 선언해서 사용할 때
		int score1, score2, score3, score4, score5;
		score1 = 90;
		score2 = 100;
		score3 = 79;
		/*
		 * 변수로만 선언하게 되면 관리가 어렵고, 특정 조건에 따른 데이터를 가져오기 힘들다.
		 */
		
		/*
		 *  배열.
		 *  선언 방법: 데이터타입[] 배열명;
		 */
		int[] scores; //s를 붙이거나 List를 붙여서 표기
		
		// 생성 방법: 배열명 = new 데이터타입[배열의 길이];
		scores = new int[5];
		System.out.println(scores); //실주소
		
		/*
		 *  초기화 방법: 배열명[인덱스번호] = 데이터;
		 *  **인덱스는 0부터 시작한다.
		 */
		scores[0] = 90;
		scores[1] = 59;
		scores[2] = 79;
		scores[3] = 97;
		scores[4] = 87;
		// scores[5] = 100; 실행시 예외 발생. Exception
		
		/*
		 * 선언과 동시에 생성 및 초기화
		 * 1. 데이터타입[] 배열명 = new 데이터타입[] {요소1, 요소2, ...};
		 */
		int[] scoreList = new int[] {90, 70, 79};
		System.out.println(scoreList.length); //길이 지정 안해도 자동
		
		// 2. 데이터타입[] 배열명 = {요소1, 요소2, ...};
		char[] string = {'h','e','l','l','o'};
		System.out.println(string);
		string[0] = 'm';
		System.out.println(string);
		System.out.println(string[0]);
		
		/*
		 * 다차원 배열
		 * 선언 방법: 데이터타입[][] 배열명;
		 * 생성 방법: 배열명 = new 데이터타입[배열길이][배열길이];
		 * 선언과 동시에 초기화
		 * 	1. 데이터타입[][] 배열명 = new 데이터타입[][] { {요소11, ...}, {요소 21, ...}, ...};
		 * 	2. 데이터타입[][] 배열명 = { {요소11, ...}, {요소 21, ...}, ...};
		 */
		
		// 배열 복사
		int[] extraScoreList = scoreList; //값이 대입이 되는 것이 아니라 주소가 넘어가는 것이므로
		System.out.println(scoreList);
		System.out.println(extraScoreList);
		
		extraScoreList[0] = 80;
		System.out.println(scoreList[0]);
	}

}
