package com.target.flow.response;

public class NotificationResponse {

	private String responseText;
	private String responseBody;

	public NotificationResponse(String responseText, String responseBody, int code) {
		super();
		this.responseText = responseText;
		this.responseBody = responseBody;
		this.code = code;
	}

	private int code;

	public String getResponseText() {
		return responseText;
	}

	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}

	public String getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
