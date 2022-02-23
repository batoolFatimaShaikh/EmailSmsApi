package com.example.entities;

import java.util.List;


public class EmailSmsTemplate {
	private List<EmailTemplate> emailTemplate;
	private List<SmsTemplate> smsTemplate;
	public EmailSmsTemplate() {
		// TODO Auto-generated constructor stub
	}
	public List<EmailTemplate> getEmailTemplate() {
		return emailTemplate;
	}
	public void setEmailTemplate(List<EmailTemplate> emailTemplate) {
		this.emailTemplate = emailTemplate;
	}
	public List<SmsTemplate> getSmsTemplate() {
		return smsTemplate;
	}
	public void setSmsTemplate(List<SmsTemplate> smsTemplate) {
		this.smsTemplate = smsTemplate;
	}
}
