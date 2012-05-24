package sample.entity;

import java.io.Serializable;


public class CustomerPK implements Serializable{
	private String countryCode;
	private String idCardNo;

	public CustomerPK(){}
	
	public CustomerPK(String countryCode, String idCardNo) {
		super();
		this.countryCode = countryCode;
		this.idCardNo = idCardNo;
	}
	public String getCountryCode() {
		return this.countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getIdCardNo() {
		return this.idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((countryCode == null) ? 0 : countryCode.hashCode());
		result = prime * result
				+ ((idCardNo == null) ? 0 : idCardNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerPK other = (CustomerPK) obj;
		if (countryCode == null) {
			if (other.countryCode != null)
				return false;
		} else if (!countryCode.equals(other.countryCode))
			return false;
		if (idCardNo == null) {
			if (other.idCardNo != null)
				return false;
		} else if (!idCardNo.equals(other.idCardNo))
			return false;
		return true;
	}
}
