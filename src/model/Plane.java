package model;

public class Plane {

	private String p_num;// �ɻ��ͺ�
	private String s_num;// ��λ��
	private String com_name;// ��˾����

	public Plane(String pNum, String sNum, String comName) {
		super();
		this.p_num = pNum;
		this.s_num = sNum;
		this.com_name = comName;
	}

	public String getP_num() {
		return p_num;
	}

	public void setP_num(String pNum) {
		p_num = pNum;
	}

	public String getS_num() {
		return s_num;
	}

	public void setS_num(String sNum) {
		s_num = sNum;
	}

	public String getCom_name() {
		return com_name;
	}

	public void setCom_name(String comName) {
		com_name = comName;
	}

}
