package co.alpha.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import co.alpha.common.BaseDTO;
import co.alpha.common.BaseForm;
import co.alpha.dto.UserDTO;

public class UserForm extends BaseForm {

	@NotEmpty(message = "please enter firstname")

	private String firstName = null;

	@NotEmpty(message = "please enter lastname")
	private String lastName = null;

	@NotEmpty(message = "please enter mobileNo")
	private String mobileNo = null;

	@NotNull(message = "please enter dob")

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

	@Override
	public BaseDTO getDTO() {
		UserDTO dto = initDTO(new UserDTO());
		dto.setFirstName(firstName);
		dto.setLastName(lastName);
		dto.setMobileNo(mobileNo);
		dto.setDob(dob);
		return dto;
	}

}
