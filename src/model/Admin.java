package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.DataConnect;


public class Admin {
	private static String a_email;// 邮箱（同时作为用户名用于登陆）
	private String a_pw;// 密码
	private String a_name;// 姓名
	private int a_phone;// 电话
	private String a_IDNumber;// 身份证号
	private String u_email;// 邮箱（同时作为用户名用于登陆）
	private String u_pw;// 密码
	private String u_name;// 姓名
	private String u_phone;// 电话
	private String u_IDNumber;// 身份证号

	public static String getA_email() {
		return a_email;
	}

	public static void setA_email(String aEmail) {
		a_email = aEmail;
	}

	public String getA_pw() {
		return a_pw;
	}

	public void setA_pw(String aPw) {
		a_pw = aPw;
	}

	public String getA_name() {
		return a_name;
	}

	public void setA_name(String aName) {
		a_name = aName;
	}

	public int getA_phone() {
		return a_phone;
	}

	public void setA_phone(int aPhone) {
		a_phone = aPhone;
	}

	public String getA_IDNumber() {
		return a_IDNumber;
	}

	public void setA_IDNumber(String aIDNumber) {
		a_IDNumber = aIDNumber;
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

	@SuppressWarnings("static-access")
	public Admin(String a_email, String a_pw, String a_name, int a_phone,
			String a_IDNumber) {
		super();
		this.a_email = a_email;
		this.a_pw = a_pw;
		this.a_name = a_name;
		this.a_phone = a_phone;
		this.a_IDNumber = a_IDNumber;
	}

	public Admin(String u_email, String u_name, String u_phone,
			String u_IDNumber, String u_pw) {
		super();
		this.u_email = u_email;	
		this.u_name = u_name;
		this.u_phone = u_phone;
		this.u_IDNumber = u_IDNumber;
		this.u_pw = u_pw;
	}

	public ArrayList<Admin> ViewAllUser() throws SQLException,
			ClassNotFoundException {
		ArrayList<Admin> users = new ArrayList<Admin>();
		String sql = "select * from user";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		while (rs.next()) {
			users.add(new Admin(rs.getString(1), rs.getString(2), rs
					.getString(3), rs.getString(4), rs.getString(5)));
		}
		return users;
	}

	public User_info ViewUserResult(String name) throws SQLException, ClassNotFoundException {
		User_info ar = null;
		String sql = "select * from user where uname='" + name
				+ "'";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		if (rs.next()) {
			ar = new User_info(rs.getString(1), rs.getString(2),
					rs.getString(3), rs.getString(4), rs.getString(5));
		}
		return ar;
	}
	

}
