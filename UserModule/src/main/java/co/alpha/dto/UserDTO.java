package co.alpha.dto;

import java.util.Date;


import co.alpha.common.BaseDTO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "ST_USER_HOME_PRACTICE")
public class UserDTO extends BaseDTO {

	@Column(name = "FIRST_NAME", length = 20)
	private String firstName = null;

	@Column(name = "LAST_NAME", length = 20)
	private String lastName = null;

	@Column(name = "MOBILE_NO", length = 20)
	private String mobileNo = null;

	@Column(name = "DOB")
	private Date dob;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
