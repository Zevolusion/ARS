package model;

/*
 * �˴���ź�����ϸ��Ϣ
 * ����š��������͡���λ�������۸񡢳���ʱ�䡢�ﵽʱ�䡢ʼ������ ��Ŀ�ĵ�
 */
public class Flight {

	private String f_num;//�����
	private String date;//����
	private String startTime;// ����ʱ��
	private String arriveTime;// �ﵽʱ��
	private String startingPoint;// ʼ������
	private String destination;// Ŀ�ĵ�

	public Flight(String f_num, String date, String startTime, String arriveTime,
			String startingPoint, String destination) {
		super();
		this.f_num = f_num;
		this.date = date;
		this.startTime = startTime;
		this.arriveTime = arriveTime;
		this.startingPoint = startingPoint;
		this.destination = destination;
	}

	public String getF_num() {
		return f_num;
	}

	public void setF_num(String fNum) {
		this.f_num = fNum;
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

//	public ArrayList<Ticket> ViewAllResult() throws SQLException,
//			ClassNotFoundException {
//		ArrayList<Ticket> results = new ArrayList<Ticket>();
//		String sql = "select * from result where  =" + flightNumber;
//		ResultSet rs = DataConnect.getStat().executeQuery(sql);
//		while (rs.next()) {
//			results.add(new Ticket(rs.getInt(1), rs.getString(2), rs.getInt(3),
//					rs.getDouble(4), rs.getString(5), rs.getString(6), rs
//							.getString(7), rs.getString(8)));
//		}
//		return results;
//	}

}
