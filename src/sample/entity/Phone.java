package sample.entity;

public class Phone {
	private String areaCode;
	private String telNo;
	
	public Phone(){}
	
	public Phone(String areaCode, String telNo) {
		// TODO Auto-generated constructor stub
		this.areaCode = areaCode;
		this.telNo = telNo;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
}
