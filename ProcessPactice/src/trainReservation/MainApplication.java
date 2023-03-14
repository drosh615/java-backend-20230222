package trainReservation;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import trainReservation.dto.GetTrainListDto;
import trainReservation.entity.Cost;
import trainReservation.entity.Seat;
import trainReservation.entity.StopStation;
import trainReservation.entity.Train;

/*
 * 기차정보
 * 열차번호, 출발시간, 도착시간, 걸리는시간, 기차종류, 비용, 정차역, 남아있는 좌석
 * 
 * 예약정보
 * 이름, 좌석번호, 예약번호, 출발역, 도착역, 출발시간, 도착시간
 */
public class MainApplication {
	
	private static List<Train> trains = new ArrayList<Train>();
	private static List<Cost> costs = new ArrayList<Cost>();
	private static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
	
	public static void main(String[] args) {
		initDate();

		while (true) {
			GetTrainListDto dto = new GetTrainListDto(); 
			
			LocalTime departureTime = null;
			
			// 입력 검증
			if (dto.isEmpty()) {
				System.out.println("모두 입력하세요.");
				continue;
			}
			
			try {
				LocalTime.parse(dto.getDepartureTime(), timeFormatter);
			} catch(Exception exception) {
				System.out.println("잘못된 시간입니다. 'HH:mm'형식으로 작성해주세요");
				continue;
			}
			
			if (dto.getNumberOfPeople() <= 0) {
				System.out.println("잘못된 인원입니다");
				continue;
			}
			
			if (dto.isEqualStation()) {
				System.out.println("출발역과 도착역이 같습니다.");
				continue;
			}
			
			// 받아올 내용 생성
			List<Train> possibleTrains = new ArrayList<>();
			
			// 검색
			for (Train train: trains) {
				List<StopStation> stopStations = train.getStopStation();
				// 
				int sameStationIndex = -1;
				
				for (int stopStationIndex = 0; stopStationIndex < stopStations.size(); stopStationIndex++) {
					String stopStationName = stopStations.get(stopStationIndex).getStationName();
					if(!dto.getDepartureStation().equals(stopStationName)) {
						continue;
					}
					
					// 이미 출발한 열차인지 아닌지 확인하기 위한
					LocalTime stationDepartureTime = LocalTime.parse(dto.getDepartureStation(), timeFormatter);
					
					if (stationDepartureTime.isBefore(departureTime)) {
						break;	//이미 지나간 열차 
					}
					
					sameStationIndex = stopStationIndex;
					break;
				}
				if (sameStationIndex == -1) {
					continue;
				}
				
				// 출발할 역 이후에 도착할 역이 있는지 확인
				for (int stopStationIndex = 0; stopStationIndex < stopStations.size(); stopStationIndex++) {
					String stationName = stopStations.get(stopStationIndex).getStationName();
					
					if (!dto.isEqualArrivalStation(stationName)) {
						continue;
					}
					
					if (stopStationIndex <= sameStationIndex) {
						break;	//열차 방향이 다름
					}
					
					possibleTrains.add(train);
					break;
				}
				
			}
			
			
			//시스템 출력 확인은 정확한 단계를 소화했는지 점검하는 것이다.
			System.out.println(possibleTrains.toString());
		}
	}

	private static void initDate() {
		costs.add(new Cost("부산역", "서울역", 30000));
		costs.add(new Cost("부산역", "대전역", 20000));
		costs.add(new Cost("부산역", "대구역", 10000));
		costs.add(new Cost("대구역", "서울역", 20000));
		costs.add(new Cost("대구역", "대전역", 10000));
		costs.add(new Cost("대전역", "서울역", 10000));
		
		costs.add(new Cost("서울역", "부산역", 30000));
		costs.add(new Cost("대전역", "부산역", 20000));
		costs.add(new Cost("대구역", "부산역", 10000));
		costs.add(new Cost("서울역", "대구역", 20000));
		costs.add(new Cost("대전역", "대구역", 10000));
		costs.add(new Cost("서울역", "대전역", 10000));
		
		Train train;
		List<Seat> seats = new ArrayList<>();
		List<StopStation> stopStations = new ArrayList<>();
		seats.add(new Seat(1, "A1", false));
		seats.add(new Seat(1, "B1", false));
		seats.add(new Seat(1, "A2", false));
		seats.add(new Seat(1, "B2", false));
		seats.add(new Seat(2, "A1", false));
		seats.add(new Seat(2, "B1", false));
		seats.add(new Seat(2, "A2", false));
		seats.add(new Seat(3, "B2", false));
		seats.add(new Seat(3, "A1", false));
		seats.add(new Seat(3, "B1", false));
		seats.add(new Seat(3, "A2", false));
		seats.add(new Seat(3, "B2", false));
		
		stopStations.add(new StopStation("서울역", "", "06:00"));
		stopStations.add(new StopStation("대전역", "06:45", "07:00"));
		stopStations.add(new StopStation("대구역", "07:45", "08:00"));
		stopStations.add(new StopStation("부산역", "09:00", ""));
		
		train = new Train("KTX001", "서울역", "06:00", "부산역", "9:00", 180, "KTX", stopStations, seats);
		trains.add(train);
		
		seats = new ArrayList<>();
		stopStations = new ArrayList<>();
		seats.add(new Seat(1, "A1", false));
		seats.add(new Seat(1, "B1", false));
		seats.add(new Seat(1, "A2", false));
		seats.add(new Seat(1, "B2", false));
		seats.add(new Seat(2, "A1", false));
		seats.add(new Seat(2, "B1", false));
		seats.add(new Seat(2, "A2", false));
		seats.add(new Seat(3, "B2", false));
		seats.add(new Seat(3, "A1", false));
		seats.add(new Seat(3, "B1", false));
		seats.add(new Seat(3, "A2", false));
		seats.add(new Seat(3, "B2", false));
		
		stopStations.add(new StopStation("부산역", "", "09:00"));
		stopStations.add(new StopStation("대구역", "09:45", "10:00"));
		stopStations.add(new StopStation("대전역", "10:45", "11:00"));
		stopStations.add(new StopStation("서울역", "12:00", ""));
		
		train = new Train("KTX002", "부산역", "09:00", "서웋역", "12:00", 180, "KTX", stopStations, seats);
		trains.add(train);
	}
}
