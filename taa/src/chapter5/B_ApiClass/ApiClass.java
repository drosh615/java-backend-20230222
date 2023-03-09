package chapter5.B_ApiClass;

import java.util.Scanner;

/*
 * API class
 * Java 자체에서 제공해주는 개발에 도움을 주는 각종 라이브러리
 */
public class ApiClass {

	public static void main(String[] args) {
		/*
		 * Object class
		 * 모든 클래스의 조상 클래스
		 */
		Object object = new Scanner(System.in);
		object = new int[10];
		
		/*
		 * String class
		 * 문자열 처리에 대한 메서드가 정의되어 있는 클래스
		 */
		String string = "This is string contents";
		
		/*
		 * .substring(시작인덱스, 종료인덱스);
		 */
		String subString = string.substring(6, 6);
		System.out.println(subString);
		
		/*
		 * .toUpperCase();
		 * 모든 문자를 대문자로 교체
		 * .toLowerCase();
		 * 모든 문자를 소문자로 교체
		 */
		String upperCase = string.toUpperCase();
		String LowerCase = string.toLowerCase();
		System.out.println(upperCase);
		System.out.println(LowerCase);
		
		/*
		 * .indesOf(문자열);
		 * 해당하는 문자열이 존재한다면 그 위치의 첫번째 인덱스 번호를 반환
		 * 해당하는 문자열이 존재하지 않으면 -1 반환
		 */
		int stringIndex = string.indexOf("is");
		System.out.println(stringIndex);
	}

}











