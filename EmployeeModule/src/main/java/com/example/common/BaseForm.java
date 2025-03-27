package com.example.common;

import lombok.Data;

@Data
public class BaseForm {

	private Long id;

	public BaseDTO getDTO() {
		return null;
	}

	public <T extends BaseDTO> T initDTO(T dto) {
		if (id != null && id > 0) {
			dto.setId(id);
		} else {
			dto.setId(null);
		}
		return dto;
	}

}
