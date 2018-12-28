package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.*;


/*
 * 此处存放所有功能的处理方法
 * 
 */
public class Factory {

	// 用户注册
	public static void addU(String email, String name, String phone,
			String IDNumber, String pw) throws SQLException, ClassNotFoundException {
		String sql = "insert into user values(?,?,?,?,?)";
		PreparedStatement ps = DataConnect.getCon().prepareStatement(sql);
		ps.setString(1, email);
		ps.setString(2, name);
		ps.setString(3, phone);
		ps.setString(4, IDNumber);
		ps.setString(5, pw);
		ps.executeUpdate();
	}

	// 管理员注册
	public static void addA(String email, String pw, String name, String phone,
			String IDNumber) throws SQLException, ClassNotFoundException {
		String sql = "insert into admin values(?,?,?,?,?)";
		PreparedStatement ps = DataConnect.getCon().prepareStatement(sql);
		ps.setString(1, email);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, phone);
		ps.setString(5, IDNumber);
		ps.executeUpdate();

	}

	// 客户登陆
	public static User_info Ulogin(String email, String upw)
			throws SQLException, ClassNotFoundException {
		User_info re = null;
		String sql = "select * from user where uid ='" + email + "' and upw='"
				+ upw + "'";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		if (rs.next()) {
			re = new User_info(rs.getString(1), rs.getString(2), rs
					.getString(3), rs.getString(4), rs.getString(5));
		}
		return re;
	}
	
	// 管理员登陆
	public static Admin Alogin(String email, String apw)
			throws SQLException, ClassNotFoundException {
		Admin re = null;
		String sql = "select * from admin where aid ='" + email + "' and apw='"
				+ apw + "'";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		if (rs.next()) {
			re = new Admin(rs.getString(1), rs.getString(2),
					rs.getString(3), rs.getInt(4), rs.getString(5));
		}
		return re;
	}
	
	// 航空公司登陆
	public static Com_info Clogin(String com_name, String cpw)
			throws SQLException, ClassNotFoundException {
		Com_info re = null;
		String sql = "select * from company where com_name ='" + com_name + "' and cpw='"
				+ cpw + "'";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		if (rs.next()) {
			re = new Com_info(rs.getString(1), rs.getString(2));
		}
		return re;
	}

	// 增加飞机
	public static void addP(String pnum, String snum,
			String com_name) throws SQLException, ClassNotFoundException {
		String sql = "insert into plane values(?,?,?)";
		PreparedStatement ps = DataConnect.getCon().prepareStatement(sql);
		ps.setString(1, pnum);
		ps.setString(2, snum);
		ps.setString(3, com_name);
		ps.executeUpdate();
	}
	
	// 删除飞机
	public static void delP(String p_num) throws SQLException,
			ClassNotFoundException {
		String sql = "delete from plane where p_num='" + p_num + "'";
		DataConnect.getStat().executeUpdate(sql);
	}
	
	// 修改飞机
	public static void alterP(String pnum, String snum,
			String com_name) throws SQLException, ClassNotFoundException {
		String sql = "UPDATE plane SET p_num='" + pnum + "',s_num='" + snum + "',com_name='" + com_name
				+ "' WHERE p_num='" + pnum + "'";
		DataConnect.getStat().executeUpdate(sql);
	}
	
	// 增加航班
	public static void addF(String fnum, String date, String stime, String atime, String spoint,
			String destination) throws SQLException, ClassNotFoundException {
		String sql = "insert into flight_info values(?,?,?,?,?,?)";
		PreparedStatement ps = DataConnect.getCon().prepareStatement(sql);
		ps.setString(1, fnum);
		ps.setString(2, date);
		ps.setString(3, stime);
		ps.setString(4, atime);
		ps.setString(5, spoint);
		ps.setString(6, destination);
		ps.executeUpdate();
	}

	// 删除航班
	public static void delF(String f_num) throws SQLException,
			ClassNotFoundException {
		String sql = "delete from flight_info where f_num='" + f_num + "'";
		DataConnect.getStat().executeUpdate(sql);
	}

	// 修改航班
	public static void alterF(String fnum, String date, String stime, String atime, String spoint,
			String destination) throws SQLException, ClassNotFoundException {
		String sql = "UPDATE flight_info SET f_num='" + fnum + "',date='"
				+ date + "',s_time='" + stime + "',a_time='" + atime + "',s_point='"
				+ spoint + "',destination='" + destination + "' WHERE f_num='"
				+ fnum + "'";
		DataConnect.getStat().executeUpdate(sql);
	}

	// 用户退票
	public static void delT(String fnum) throws SQLException,
			ClassNotFoundException {
		String sql = "delete from myoders where f_num='" + fnum + "'";
		DataConnect.getStat().executeUpdate(sql);
	}

	// 管理员增加公司
	public static void addCom(String company,String cpw) throws SQLException,
			ClassNotFoundException {
		String sql = "insert into company values(?,?)";
		PreparedStatement ps = DataConnect.getCon().prepareStatement(sql);
		ps.setString(1, company);
		ps.setString(2, cpw);
		ps.executeUpdate();
	}

	// 管理员删除公司
	public static void delCom(String company) throws SQLException,
			ClassNotFoundException {
		String sql = "delete from company where com_name='" + company + "'";
		DataConnect.getStat().executeUpdate(sql);
	}

	// 公司增加公告
	public static void addNoti(String notice) throws SQLException,
			ClassNotFoundException {
		String sql = "insert into notice (c_notice) values(?)";
		PreparedStatement ps = DataConnect.getCon().prepareStatement(sql);
		ps.setString(1, notice);
		ps.executeUpdate();
	}

	// 管理员增加公告
	public static void addNoti2(String notice) throws SQLException,
			ClassNotFoundException {
		String sql = "insert into notice (a_notice) values(?)";
		PreparedStatement ps = DataConnect.getCon().prepareStatement(sql);
		ps.setString(1, notice);
		ps.executeUpdate();
	}

	// 用户评论
	public static void addEva(String text) throws SQLException,
			ClassNotFoundException {
		String sql = "insert into comment (text) values(?)";
		PreparedStatement ps = DataConnect.getCon().prepareStatement(sql);
		ps.setString(1, text);
		ps.executeUpdate();
	}

	// 公司删除公告
	public static void delNoti(String notice) throws SQLException,
			ClassNotFoundException {
		String sql = "delete from notice where c_notice='" + notice + "'";
		DataConnect.getStat().executeUpdate(sql);
	}

	// 管理员删除公告
	public static void delNoti2(String notice) throws SQLException,
			ClassNotFoundException {
		String sql = "delete from notice where a_notice='" + notice + "'";
		DataConnect.getStat().executeUpdate(sql);
	}

	// 个人信息修改
	public static void alterU(String email, String uname, String phone,
			String idnumber, String upw) throws SQLException,
			ClassNotFoundException {
		String sql = "UPDATE user SET uid='" + email + "',uname='" + uname
				+ "',phone='" + phone + "',idnumber='" + idnumber + "',upw='"
				+ upw + "' WHERE uid='" + email + "'";
		DataConnect.getStat().executeUpdate(sql);
	}

	// 管理员删除用户
	public static void delU(String email) throws SQLException,
			ClassNotFoundException {
		String sql = "delete from user where uid='" + email + "'";
		DataConnect.getStat().executeUpdate(sql);
	}

	// 显示公告1
	public static String[] shownotice() throws SQLException,
			ClassNotFoundException {
		String sql;
		sql = "SELECT c_notice FROM notice";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		String[] S = new String[200];
		int i = 0;
		while (rs.next()) {
			S[i] = rs.getString("c_notice");
			i++;
		}
		return S;
	}

	// 显示公告2
	public static String[] shownotice2() throws SQLException,
			ClassNotFoundException {
		String sql;
		sql = "SELECT a_notice FROM notice";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		String[] S = new String[200];
		int i = 0;
		while (rs.next()) {
			S[i] = rs.getString("a_notice");
			i++;
		}
		return S;
	}

	// 显示评论
	public static String[] showEva() throws SQLException,
			ClassNotFoundException {
		String sql;
		sql = "SELECT * FROM comment";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		String[] S = new String[200];
		int i = 0;
		while (rs.next()) {
			S[i] = rs.getString("text");
			i++;
		}
		return S;
	}

	// 显示公司
	public static String[] showcom() throws SQLException,
			ClassNotFoundException {
		String sql;
		sql = "SELECT Com_name FROM company";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		String[] S = new String[200];
		int i = 0;
		while (rs.next()) {
			S[i] = rs.getString("Com_name");
			i++;
		}
		return S;
	}

	// 加入订单
	public static void addTic(String f_num) throws SQLException,
			ClassNotFoundException {
		String sql = "insert into myorders values(?)";
		PreparedStatement ps = DataConnect.getCon().prepareStatement(sql);
		ps.setString(1, f_num);
		ps.executeUpdate();
	}

	// 显示订单
	public static String[] showTic() throws SQLException,
			ClassNotFoundException {
		String sql;
		sql = "SELECT f_num FROM myorders";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		String[] S = new String[200];
		int i = 0;
		while (rs.next()) {
			S[i] = rs.getString("f_num");
			i++;
		}
		return S;
	}

	// 删除订单
	public static void delTic(String f_num) throws SQLException,
			ClassNotFoundException {
		String sql = "delete from myorders where f_num='" + f_num + "'";
		DataConnect.getStat().executeUpdate(sql);
	}

	// 显示收藏夹
	public static String[] showColl() throws SQLException,
			ClassNotFoundException {
		String sql;
		sql = "SELECT * FROM flight_info where f_num in (select f_num from collect)";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		String[] S = new String[200];
		int i = 0;
		while (rs.next()) {
			S[i] = rs.getString("f_num");
			i++;
		}
		return S;
	}

	// 加入收藏
	public static void addColl(String f_num) throws SQLException,
			ClassNotFoundException {
		String sql = "insert into collect values(?)";
		PreparedStatement ps = DataConnect.getCon().prepareStatement(sql);
		ps.setString(1, f_num);
		ps.executeUpdate();
	}

	// 取消收藏
	public static void cancelCol(String f_num) throws SQLException,
			ClassNotFoundException {
		String sql = "delete from collect where f_num='" + f_num + "'";
		DataConnect.getStat().executeUpdate(sql);
	}

	public static ArrayList<Flight_info> ViewAllFlight(Com_info cm)
			throws SQLException, ClassNotFoundException {
		return cm.ViewAllFlight();
	}

	public static ArrayList<Plane> ViewAllPlane(Com_info cm)
			throws SQLException, ClassNotFoundException {
		return cm.ViewAllPlane();
	}
	
	public static ArrayList<Flight_info> ViewAllFlight(User_info u)
			throws SQLException, ClassNotFoundException {
		return u.ViewAllFlight();
	}

	public static ArrayList<Admin> ViewAllUser(Admin au)
			throws SQLException, ClassNotFoundException {
		return au.ViewAllUser();
	}

	public static Flight_info ViewFlightResult(User_info u, String des)
			throws SQLException, ClassNotFoundException {
		return u.ViewFlightResult(des);
	}

	public static User_info ViewUserResult(Admin a, String name) throws SQLException, ClassNotFoundException {		
		return a.ViewUserResult(name);
	}

	

}
