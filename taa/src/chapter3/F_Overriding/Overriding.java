package chapter3.F_Overriding;

/*
 * 오버라이딩
 * 조상 클래스로부터 상속받은 메서드의 내용을 변경하는 것
 * 상속받은 메서드를 자손 클래스에 맞게 변경시키고자 할때 사용한다.
 */

class Human{
	String name;
	
	void eat(String food) {
		System.out.println(this.name + "가 " + food + "를 먹습니다.");
	}
}

class Developer extends Human {
	// Overload
	void eat( ) {
		System.out.println(super.name + "가 식사를 합니다.");
	}
	
	@Override //오버라이드 할 것이다. 안하면 오류로 알려준다.
	void eat(String food) {
		System.out.println(super.name + "가 " + food + "를 절반만 먹습니다.");
	}
}

public class Overriding {

	public static void main(String[] args) {
		Developer developer = new Developer();
		developer.name = "kim doe";
		developer.eat("ulljju");
		Human human = new Human();
		human.name = "dol3";
		human.eat("고기");
	}

}
