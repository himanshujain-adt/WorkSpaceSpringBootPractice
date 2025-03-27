package com.example.common;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ORSResoponse {
	public static final String INPUT_ERROR = "inputerror";
	public static final String DATA = "data";
	public static final String MESSAGE = "message";

	private Map<String, Object> result = new HashMap<String, Object>();
	public boolean success = false;

	public ORSResoponse(boolean success) {
		this.success = success;
	}

	public void addInputError(Object value) {
		result.put(INPUT_ERROR, value);

	}

	public void addData(Object value) {
		result.put(DATA, value);
	}

	public void addMessage(Object value) {
		result.put(MESSAGE, value);
	}

	public void addResult(String key, Object value) {
		result.put(key, value);
	}

}
