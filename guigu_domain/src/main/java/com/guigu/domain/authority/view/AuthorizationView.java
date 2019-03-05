package com.guigu.domain.authority.view;

public class AuthorizationView {
	private String id;
	private String text;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public AuthorizationView(String id, String text) {
		super();
		this.id = id;
		this.text = text;
	}
	public AuthorizationView() {
		super();
	}

}
