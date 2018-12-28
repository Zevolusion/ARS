package model;

/*
 * 此处存放航班详细信息
 * 航班号、航班类型、舱位数量、价格、出发时间、达到时间、始发机场 、目的地
 */
public class Flight {

	private String f_num;//航班号
	private String date;//日期
	private String startTime;// 出发时间
	private String arriveTime;// 达到时间
	private String startingPoint;// 始发机场
	private String destination;// 目的地

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
