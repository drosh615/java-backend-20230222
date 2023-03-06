package chapter3.C_Overloading;

/*
 * 오버로딩
 * 한 클래스 내에서 같은 이름으로 메서드를 여러 개 정의하는 것
 * 이미 같은 이름의 메서드가 존재한다고 하더라도 
 * 매개변수의 타입과 갯수가 다르면 같은 이름으로 정의 할 수 있다.
 * 
 * 조건
 * 메서드명이 같아야 하고, 매개변수 갯수 혹은 타입이 달라야 한다.
 * 반환타입은 오버로딩에 영향을 미치지 않는다.
 */
public class Overloading {
	
	int add(int x, int y) {
		return x + y;
	}
	double add(double x, int y ) {
		return x + y;
	}
	
	//
	public static void main(String[] args) {
		
	}

}
