package model;

public class Ticket {
	private String price;
	private String s_price;
	private String uname;
	private String phone;
	private String com_name;
	public Ticket(String price, String sPrice, String uname, String phone,
			String comName) {
		super();
		this.price = price;
		this.s_price = sPrice;
		this.uname = uname;
		this.phone = phone;
		this.com_name = comName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getS_price() {
		return s_price;
	}
	public void setS_price(String sPrice) {
		s_price = sPrice;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCom_name() {
		return com_name;
	}
	public void setCom_name(String comName) {
		com_name = comName;
	}
}
