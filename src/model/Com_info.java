package model;

public class Com_info {
	private String c_name;// ��˾����
	private String c_pw;// ����

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
}
