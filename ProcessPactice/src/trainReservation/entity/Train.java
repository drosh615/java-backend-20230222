package trainReservation.entity;

import java.util.List;

// 기차 정보 Entity Class
public class Train {
	private String trainNumber;
	private String departureStation;
	private String arrivalStation;
	private String departureTime;
	private String arrivalTime;
	private int takeMinute;
	private String type;
	private List<StopStation> stopStation;
	private List<Seat> seats;
	
	public Train() { }

	public Train(String trainNumber, String departureStation, String arrivalStation, String departureTime,
			String arrivalTime, int takeMinute, String type, List<StopStation> stopStation, List<Seat> seats) {
		super();
		this.trainNumber = trainNumber;
		this.departureStation = departureStation;
		this.arrivalStation = arrivalStation;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.takeMinute = takeMinute;
		this.type = type;
		this.stopStation = stopStation;
		this.seats = seats;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public String getDepartureStation() {
		return departureStation;
	}

	public String getArrivalStation() {
		return arrivalStation;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public int getTakeMinute() {
		return takeMinute;
	}

	public String getType() {
		return type;
	}

	public List<StopStation> getStopStation() {
		return stopStation;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	@Override
	public String toString() {
		return "Train [trainNumber=" + trainNumber + ", departureStation=" + departureStation + ", arrivalStation="
				+ arrivalStation + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", takeMinute="
				+ takeMinute + ", type=" + type + ", stopStation=" + stopStation + ", seats=" + seats + "]";
	}
	
}
