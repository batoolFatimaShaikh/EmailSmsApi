package com.example.entities;



public class EmailSmsTemplateResponse {
	private int Status;
	private int ErrorCode;
	private String MessageType;
	private String Message;
	private EmailSmsTemplate Template;
	public EmailSmsTemplateResponse() {
		// TODO Auto-generated constructor stub
	}
	
	public EmailSmsTemplateResponse(int status, int errorCode, String messageType, String message, EmailSmsTemplate template) {
		super();
		Status = status;
		ErrorCode = errorCode;
		MessageType = messageType;
		Message = message;
	    Template = template;
		// TODO Auto-generated constructor stub
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public int getErrorCode() {
		return ErrorCode;
	}
	public void setErrorCode(int errorCode) {
		ErrorCode = errorCode;
	}
	public String getMessageType() {
		return MessageType;
	}
	public void setMessageType(String messageType) {
		MessageType = messageType;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public EmailSmsTemplate getTemplate() {
		return Template;
	}
	public void setTemplate(EmailSmsTemplate template) {
		Template = template;
	}
	@Override
	public String toString() {
		return "EmailSmsTempResponse [Template=" + Template + ", Status=" + Status + ", ErrorCode=" + ErrorCode
				+ ", MessageType=" + MessageType + ", Message=" + Message + "]";
	}
}
