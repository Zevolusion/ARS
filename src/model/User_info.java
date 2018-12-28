package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.DataConnect;



/*
 * 此处存放用户属性
 */
public class User_info {
	private String u_email;// 邮箱（同时作为用户名用于登陆）
	private String u_pw;// 密码
	private String u_name;// 姓名
	private String u_phone;// 电话
	private String u_IDNumber;// 身份证号

	public User_info(String u_email, String u_name,
			String u_phone, String u_IDNumber, String u_pw) {
		super();
		this.u_email = u_email;	
		this.u_name = u_name;
		this.u_phone = u_phone;
		this.u_IDNumber = u_IDNumber;
		this.u_pw = u_pw;
	}

	public String getU_email() {
		return u_email;
	}

	public void setU_email(String uEmail) {
		u_email = uEmail;
	}

	public String getU_pw() {
		return u_pw;
	}

	public void setU_pw(String uPw) {
		u_pw = uPw;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String uName) {
		u_name = uName;
	}

	public String getU_phone() {
		return u_phone;
	}

	public void setU_phone(String uPhone) {
		u_phone = uPhone;
	}

	public String getU_IDNumber() {
		return u_IDNumber;
	}

	public void setU_IDNumber(String uIDNumber) {
		u_IDNumber = uIDNumber;
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

	public Flight_info ViewFlightResult(String des) throws SQLException,
			ClassNotFoundException {
		Flight_info fr = null;
		String sql = "select * from flight_info where destination='" + des
				+ "'";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		if (rs.next()) {
			fr = new Flight_info(rs.getString(1), rs.getString(2),
					rs.getString(3), rs.getString(4), rs.getString(5), rs
							.getString(6));
		}
		return fr;
	}

}