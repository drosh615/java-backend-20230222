package trainReservation.entity;

//정차역 Entity Class
public class StopStation {
	private String StationName;
	private String departureTime;
	private String arrivalTime;
	
	public StopStation() { }

	public StopStation(String stationName, String departureTime, String arrivalTime) {
		this.StationName = stationName;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}

	public String getStationName() {
		return StationName;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	@Override
	public String toString() {
		return "StopStation [StationName=" + StationName + ", departureTime=" + departureTime + ", arrivalTime="
				+ arrivalTime + "]";
	}
	
	
}
