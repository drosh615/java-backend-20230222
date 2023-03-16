package trainReservation;

import java.util.Scanner;

import trainReservation.controller.ReservationController;

/*
 * 기차정보
 * 열차번호, 출발시간, 도착시간, 걸리는시간, 기차종류, 비용, 정차역, 남아있는 좌석
 * 
 * 예약정보
 * 이름, 좌석번호, 예약번호, 출발역, 도착역, 출발시간, 도착시간
 */
public class MainApplication {
	
	private static ReservationController reservationController =
			new ReservationController();
	
	public static void main(String[] args) {
		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			String endPoint = scanner.nextLine();
			
			if(endPoint.equals("POST /reservation"))
				reservationController.reservation();
			if(endPoint.equals("GET /reservation"))
				reservationController.getReservation();
		}
	}

}
