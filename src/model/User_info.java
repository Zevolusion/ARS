package model;

/*
 * �˴�����û�����
 */
public class User_info {
	private String u_email;// ���䣨ͬʱ��Ϊ�û������ڵ�½��
	private String u_pw;// ����
	private String u_name;// ����
	private String u_phone;// �绰
	private String u_IDNumber;// ���֤��

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
}