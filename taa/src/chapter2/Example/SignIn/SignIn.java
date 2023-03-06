package chapter2.Example.SignIn;

import java.util.Scanner;

/*
 * 로그인 프로세스 구현
 */
public class SignIn {
	/*
	 * 입력
	 * 아이디, 비밀번호
	 */
	public static void main(String[] args) {
		final String ID = "qweasd";
		final String PASSWORD = "123456";
		
		// 1. 사용자로부터 아이디와 패스워드 입력받음
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디와 비밀번호를 입력하세요.");
		String userId = scanner.nextLine();
		String userPassword = scanner.nextLine();
		
		// 2. 사용자가 모두 입력했는지 검증
		if(userId.isEmpty()==true || userPassword.isEmpty()==true) {
			System.out.println("로그인시 모두 입력해주세요");
			return;
		}
		// 3. 입력된 정보가 일치한지 검증
		if(userId.equals(ID)==false || userPassword.equals(PASSWORD)==false) { //같으면 true, 다르면 false
			System.out.println("잘못 입력하셨습니다. 다시 입력해주십시오.");
			return;
		} else System.out.println("로그인에 성공하셨습니다!");
	}
	/*
	 * 결과
	 * 성공, 실패(모두 입력하지 않았을 떄, 정보가 일치하지 않을 때)
	 */

}
