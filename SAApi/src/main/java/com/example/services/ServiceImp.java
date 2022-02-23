package com.example.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmailSmsDao;
import com.example.entities.EmailSmsTemplate;
import com.example.entities.EmailSmsTemplateResponse;

@Service
public class ServiceImp implements Services {
	

	
	@Autowired
	private EmailSmsDao emailSmsDao;
	@Override
	public EmailSmsTemplateResponse getEmailSmsTempResponse(String commType) {
		// TODO Auto-generated method stub
		EmailSmsTemplate list = emailSmsDao.getEmailSmsTemplate(commType);
		EmailSmsTemplateResponse response = new EmailSmsTemplateResponse(1, 0, "I", "Success", list);
		return response;
	}
	
}
