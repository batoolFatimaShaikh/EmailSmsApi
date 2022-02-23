package com.example.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entities.EmailSmsTemplate;
import com.example.entities.EmailTemplate;
import com.example.entities.SmsTemplate;


@Repository
public class EmailSmsDao {
	@Autowired
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public EmailSmsTemplate getEmailSmsTemplate(String commType){
		boolean flag = false;
		String typeOfObject = "EmailTemp";
		if(commType.equals("S")) {
			flag = true;
			typeOfObject = "SmsTemp";
		}
		StoredProcedureQuery query = em.createStoredProcedureQuery("GetEmailSmsTemplate", typeOfObject)
				.registerStoredProcedureParameter("CommunicationType", String.class, ParameterMode.IN)
				.setParameter("CommunicationType", commType);
		query.execute();
		List<SmsTemplate> smsTemp = null;
		List<EmailTemplate> emailTemp = null;
		if(flag) {
			smsTemp = query.getResultList();
		}else {
			emailTemp = query.getResultList();
		}
		EmailSmsTemplate template = new EmailSmsTemplate();
		template.setEmailTemplate(emailTemp);
		template.setSmsTemplate(smsTemp);
		return template;
	}
	
}
