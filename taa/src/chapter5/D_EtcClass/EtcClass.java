package chapter5.D_EtcClass;

import java.math.BigDecimal;
import java.util.Timer;
import java.util.TimerTask;

/*
 * Timer - TimerTask
 * 특정 작업을 지연시킬때 사용
 * TimerTask 클래스를 상속 받아서 run 메서드를 구현
 */

class Delay extends TimerTask {

	@Override
	public void run() {
		// 지연시킬 메서드
		System.out.println("지연됨");
	}
	
}
public class EtcClass {

	public static void main(String[] args) {
		// Timer 클래스의 인스턴트로 TimerTask 구현체를 실행
		Timer timer = new Timer(true);
		Delay delay = new Delay();
		timer.schedule(delay, 1);
		
		for (int index = 0; index < 100000000; index++) {
			int a = 10;
			int b = 20;
			a += b;
			b -= a;
		}
		
		System.out.println("완료");
		
		/*
		 * BigDecimal
		 * 정확한 소수점 연산을 하기 위한 클래스
		 */
		double double1 = 9.4568156452420;
		double double2 = 1.164864554238;
		System.out.println(double1 + double2);
		
		BigDecimal bigDecimal1 = new BigDecimal(String.valueOf(double1));
		BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(double2));
		
	}

}










