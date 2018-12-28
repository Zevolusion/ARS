package model;

/*
 * �˴���ź�����ϸ��Ϣ
 */
public class Flight_info {

	private String flightNumber;// �����
	private String date;
	private String startTime;// ����ʱ��
	private String arriveTime;// �ﵽʱ��
	private String startingPoint;// ʼ������
	private String destination;// Ŀ�ĵ�

	public Flight_info(String flightNumber, String date, String startTime, String arriveTime,
			String startingPoint, String destination) {
		super();
		this.flightNumber = flightNumber;
		this.date = date;
		this.startTime = startTime;
		this.arriveTime = arriveTime;
		this.startingPoint = startingPoint;
		this.destination = destination;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(String arriveTime) {
		this.arriveTime = arriveTime;
	}

	public String getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

}
