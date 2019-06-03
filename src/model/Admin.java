package model;

public class Admin {
	private static String a_email;// 邮箱（同时作为用户名用于登陆）
	private String a_pw;// 密码
	private String a_name;// 姓名
	private int a_phone;// 电话
	private String a_IDNumber;// 身份证号

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
}
