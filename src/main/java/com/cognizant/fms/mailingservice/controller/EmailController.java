package com.cognizant.fms.mailingservice.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.fms.mailingservice.model.Mail;
import com.cognizant.fms.mailingservice.service.EmailService;

import freemarker.template.TemplateException;

@RestController
public class EmailController {

	@Autowired
	EmailService mailService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/mail")
	public void sendMail() throws MessagingException, IOException, TemplateException {
		Mail mail = new Mail();
		mail.setFrom("abhizzdrift@gmail.com");
		mail.setTo("gorai.abhi@gmail.com");
		mail.setSubject("Spring Boot - Email with FreeMarker template");

		Map<String, Object> model = new HashMap<>();
		model.put("firstName", "David");
		model.put("lastName", "Pham");
		model.put("location", "Columbus");
		model.put("signature", "www.javabycode.com");
		mail.setModel(model);

		mailService.sendEmail(mail);

		System.out.println("Done!");
	}
}
