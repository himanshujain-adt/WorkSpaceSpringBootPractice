package com.example.dto;

import java.util.Date;

import javax.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "ST_EMPLOYEE")
@Data
public class EmployeeDTO {

	@Column(name = "EMP_FIRST_NAME", length = 20)
	private String empFirstName = null;

	@Column(name = "EMP_LAST_NAME", length = 20)
	private String empLastName = null;

	@Column(name = "EMP_MOBILE_NO", length = 20)
	private String empMobileNo = null;

	@Column(name = "DOB")
	private Date dob;

}
