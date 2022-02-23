package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.EmailSmsBody;
import com.example.entities.EmailSmsTemplateResponse;
import com.example.services.Services;

@RestController
public class MyController {

	@Autowired
	private Services service;

	
	@PostMapping(path = "/GetEmailSmsTemplate",
			consumes = {MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE})
	public EmailSmsTemplateResponse getEmailSmsTemplate(@RequestHeader String Header, @RequestBody EmailSmsBody Comm ) {
//		System.out.println(Header);
//		System.out.print(Comm.getCommunicationType());
//	    System.out.println(Comm.toString());
		EmailSmsTemplateResponse resp = this.service.getEmailSmsTempResponse(Comm.getCommunicationType());
		System.out.println(resp.toString());
		return resp;
	}
}
