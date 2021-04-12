package com.target.flow.entity;

import javax.validation.constraints.NotNull;

public class Notification {

	@NotNull
	private String id;
	@NotNull
	private String from;
	@NotNull
	private String body;
	@NotNull
	private String subject;
	@NotNull
	private String[] to;

	public Notification(@NotNull String id, @NotNull String from, @NotNull String body, @NotNull String subject,
			@NotNull String[] to) {
		super();
		this.id = id;
		this.from = from;
		this.body = body;
		this.subject = subject;
		this.to = to;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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
