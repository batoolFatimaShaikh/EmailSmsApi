package com.example.entities;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;



@Entity
@Table
@SqlResultSetMapping(name = "SmsTemp", classes = @ConstructorResult(targetClass = SmsTemplate.class,
                   columns = {@ColumnResult(name = "ID", type = Integer.class),
                		   @ColumnResult(name = "SenderName", type = String.class),
                		   @ColumnResult(name = "MessageBody", type = String.class),
                		   @ColumnResult(name = "DlTTemplateId", type = String.class)}))
public class SmsTemplate {
	@Id
	private int ID;
	private String SenderName;
	private String MessageBody;
	private String D1TTemplateID;
	public SmsTemplate() {
		super();
	}
	public SmsTemplate(int iD, String senderName, String messageBody, String d1TTemplateID) {
		super();
		ID = iD;
		SenderName = senderName;
		MessageBody = messageBody;
		D1TTemplateID = d1TTemplateID;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getSenderName() {
		return SenderName;
	}
	public void setSenderName(String senderName) {
		SenderName = senderName;
	}
	public String getMessageBody() {
		return MessageBody;
	}
	public void setMessageBody(String messageBody) {
		MessageBody = messageBody;
	}
	public String getD1TTemplateID() {
		return D1TTemplateID;
	}
	public void setD1TTemplateID(String d1TTemplateID) {
		D1TTemplateID = d1TTemplateID;
	}
}
