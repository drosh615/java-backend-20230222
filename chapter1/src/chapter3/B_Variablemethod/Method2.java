package chapter3.B_Variablemethod;

class  Triangle {
	double undersize;
	double height;
	double diagonal;
	double area;
	double circumference;
}

class TriangleMath {
	
	/* 
	 * 파라미터로 참조변수를 받는다면 메모리 주소가 복사되어서 넘어오기 때문에
	 * 실제 작업도 해당 메모리 주소에에서 작업을 진행한다.
	 * 실제 데이터가 변경된다.
	 */
	static void setArea(Triangle triangle) {
		double area = 0.5 * triangle.undersize * triangle.height;
		triangle.area = area;
	}
	static void setDiagonal (Triangle triangle) {
		double squareDiagonal = Math.pow(triangle.undersize, 2) + Math.pow(triangle.height, 2);
		double diagonal = Math.sqrt(squareDiagonal);
		triangle.diagonal = diagonal;
	}
	static void setCircumference (Triangle triangle) {
		triangle.circumference = triangle.height + triangle.undersize + triangle.diagonal;
	}
	static Triangle createTriangle(double underside, double height) {
		Triangle triangle = new Triangle();
		triangle.undersize = underside;
		triangle.height = height;
		setDiagonal(triangle);
		setArea(triangle);
		setCircumference(triangle);
		return triangle;
	}
}
public class Method2 {

	public static void main(String[] args) {
		Triangle triangle1 = new Triangle();
		triangle1.undersize = 3;
		triangle1.height = 4;
		triangle1.diagonal = 5;
		
		TriangleMath.setArea(triangle1);
		System.out.println(triangle1.area);
		
		Triangle triangle2 = TriangleMath.createTriangle(10, 10);
		System.out.println(triangle2.circumference);
	}

}
