package com.cognizant.fms.mailingservice.model;

import java.util.List;
import java.util.Map;

import lombok.*;

@Data
@AllArgsConstructor
@ToString
public class Mail {

    private String from;
    private String to;
    private String cc;
    private String bcc;
    private String subject;
    private String contentType;
    private List<Object> attachments;
    private Map<String, Object> model;
    
    public Mail() {
        contentType = "text/plain";
    }
}