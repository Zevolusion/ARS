package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.DataConnect;

public class Com_info {
	private String c_name;// ¹«Ë¾Ãû³Æ
	private String c_pw;// ÃÜÂë

	public Com_info(String c_name, String c_pw) {
		super();
		this.c_name = c_name;
		this.c_pw = c_pw;
	}

	public String getC_pw() {
		return c_pw;
	}

	public void setC_pw(String cPw) {
		c_pw = cPw;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String cName) {
		c_name = cName;
	}

	public ArrayList<Flight_info> ViewAllFlight() throws SQLException,
			ClassNotFoundException {
		ArrayList<Flight_info> flights = new ArrayList<Flight_info>();
		String sql = "select * from flight_info";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		while (rs.next()) {
			flights.add(new Flight_info(rs.getString(1), rs.getString(2), rs
					.getString(3), rs.getString(4), rs.getString(5), rs
					.getString(6)));
		}
		return flights;
	}

	public ArrayList<Plane> ViewAllPlane() throws SQLException,
			ClassNotFoundException {
		ArrayList<Plane> planes = new ArrayList<Plane>();
		String sql = "select * from plane";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		while (rs.next()) {
			planes.add(new Plane(rs.getString(1), rs.getString(2), rs
					.getString(3)));
		}
		return planes;
	}

}
