package chapter3.E_Inheritance;

/*
 * 상속
 * 기존 클래스를 재사용해서 새로운 클래스를 작성하는 것
 * 코드의 재사용성을 높이고 코드의 중복을 제거 > 생산성 향상, 유지보수성 향상
 * 
 * 사용방법
 * class 클래스명 extends 조상클래서 { ... }
 */

class Human {
	String name;
	int age;
	String telNumber;
	String country;
	
	Human() {
		
	}
	
	Human(String name, int age) {
		this.name = name;
		this.age = age;
		this.telNumber = "010.9952.2226";
		this.country = "Korea";
	}
	
	void eat(String food) {
		System.out.println(this.name + "가 " + food + "를 먹습니다.");
	}
}

// Develop 클래스는 Human의 속성과 기능을 모두 사용 가능하다.
class Developer extends Human {
	String position;
	String language;
	
	Developer() {
		
	}
	
	Developer(String name, int age, String position, String language) {
		/*
		 * super : 부모 클래스를 지칭
		 * super() : 부모 클래스의 생성자를 지칭
		 */
		super(name, age);	
		this.position = position;
		this.language = language;
		
	}
	
	void develope() {
		System.out.println(this.name + "가 " + this.language + "로 " + this.position + " 개발을 합니다.");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Developer developer1 = new Developer();
		developer1.name = "kim doe";
		developer1.position = "full stack";
		developer1.language = "Jave";
		developer1.eat("얼쭈");
		developer1.develope();
		
		Developer developer2 = new Developer("Michle", 25, "Front end", "Java");
		developer2.eat("banana");
		developer2.develope();
	}

}











