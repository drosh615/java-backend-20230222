package chapter2.B_Switch;

import java.util.Scanner;

/*
 * switch 조건문
 * 비교할 변수를 case 값과 비교하여 같은 case를 찾아서 해당 case 구문을 실행
 * break 문으로 해당 switch를 종료
 * default 문으로 해당하는 case가 없을 때 실행할 구문을 작성
 */
public class Switch {

	public static void main(String[] args) {
		// switch 사용 방법
		Scanner scanner = new Scanner(System.in);
		int chapter = scanner.nextInt();
		switch (chapter) {
		case 1:
			System.out.println("기본 문법 공부");
		case 2:
			System.out.println("제어문 공부");
			break;
		case 3:
			System.out.println("객체지향 기본 공부");
		case 4:
			System.out.println("객체지향 응용 공부");
		case 5:
			System.out.println("자바 고급 공부");
			break;
		default:
			System.out.println("범위초과");
		}
	}

}
