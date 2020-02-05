package com.cognizant.fms.mailingservice.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties("email")
public class EmailProperties {
	
	private String host;
	private String port;
	private String username;
	private String password;
	
}