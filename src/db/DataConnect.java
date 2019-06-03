package db;

import java.sql.*;

public class DataConnect {
	private static Statement stat;
	private static Connection con;
	private static PreparedStatement pstat;

	private static void init() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://173.82.186.106:3306/ars?"
				+ "user=xyz&password=Xyz123..";
		con = DriverManager.getConnection(url);
	}

	public static Statement getStat() throws ClassNotFoundException,
			SQLException {
		if (stat == null) {
			init();
			stat = con.createStatement();
		}
		return stat;
	}

	public static PreparedStatement getPStat(String sql)
			throws ClassNotFoundException, SQLException {
		if (pstat == null) {
			init();
		}
		pstat = con.prepareStatement(sql);
		return pstat;
	}

	public static Connection getCon() throws ClassNotFoundException,
			SQLException {
		if (con == null)
			init();
		return con;
	}

}
