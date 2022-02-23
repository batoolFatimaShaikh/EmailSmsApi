package com.example.entities;

public class EmailSmsBody {
	private String communicationType;
	public EmailSmsBody() {
		// TODO Auto-generated constructor stub
	}
	public EmailSmsBody(String communicationType) {
		super();
		this.communicationType = communicationType;
	}
	public String getCommunicationType() {
		return communicationType;
	}
	public void setCommunicationType(String communicationType) {
		this.communicationType = communicationType;
	}
	@Override
	public String toString() {
		return "EmailSmsBody [communicationType=" + communicationType + "]";
	}
	
	
	
}

