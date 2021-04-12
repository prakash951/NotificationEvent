package com.target.flow.requests;

import javax.validation.constraints.NotNull;


public class NotificationRequest {

	@NotNull
	private String from;
	@NotNull
	private String body;
	@NotNull
	private String subject;
	@NotNull
	private String[] to;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String[] getTo() {
		return to;
	}

	public void setTo(String[] to) {
		this.to = to;
	}

}
