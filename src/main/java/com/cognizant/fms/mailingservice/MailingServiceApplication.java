package com.cognizant.fms.mailingservice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.fms.mailingservice.model.Mail;
import com.cognizant.fms.mailingservice.service.EmailService;

@SpringBootApplication
public class MailingServiceApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(MailingServiceApplication.class, args);
	}

}
