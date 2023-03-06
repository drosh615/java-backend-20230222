package chapter3.B_Variablemethod;

/*
 * 메서드
 * 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것
 * 작업을 미리 작성해둔 것
 * 메서드에 넣을 값과 반환 값만 알면 된다. (Black Box 구조)
 * 
 * 메서드의 장점
 * 1. 높은 재사용성: 한번 만들어 놓은 메서드를 반복해서 사용 가능
 * 2. 중복 코드 제거: 반복적으로 나타나는 문장들을 메서드로 만들어서 사용,
 * 					수정이 발생하면 하나의 코드만 수정해도 된다.
 * 3. 프로그램 구조화: 작업 단위로 여러 개의 메서드에 담아 프로그램을 구조화
 */

class HigherMathematics {
	static final double  PIE = 3.14;
	
	static double getTriangleSize(double underside, double height) {
		if(underside <= 0 || height <= 0 ) {
			System.out.println("밑변과 높이는 양수여야합니다.");
			return 0;
		}
		double size = 0.5 * underside * height;
		return size;
	}
	static double getCircleSize(double radius) {
		if(radius <= 0) {
			System.out.println("반지름은 양수여야합니다.");
			return 0;
		}
		double size = PIE * radius * radius;
		return size;
	}
	static double getCircumference(double radius) {
		if(radius <= 0) {
			System.out.println("반지름은 양수여야합니다.");
			return 0;
		}
		double Circumference = PIE * 2 * radius;
		return Circumference;
	}
}

public class Method1 {
	/*
	 * 메서드의 선언부
	 * [접근제어자 기타제어자] 반환타입 메서드명([매개변수[, ...])
	 */
	public static void main(String[] args) {
		/*
		 * 메서드의 구현부
		 * 실제 프로그램의 절차를 작성하는 부분
		 * return 데이터; 로 결과를 반환시켜줌
		 * 반환타입이 void이면 return; 으로 메서드를 종료시킨다. 
		 */
		
		double size = HigherMathematics.getTriangleSize(10, 0);
		System.out.println(size);
		double circlsize = HigherMathematics.getCircleSize(5);
		System.out.println(circlsize);
		
	}

}














