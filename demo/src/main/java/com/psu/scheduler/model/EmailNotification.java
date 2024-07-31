package com.psu.scheduler.model;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailNotification 
{
    @Autowired
    private JavaMailSender mailSender;

    private String from;
    private String to;
    private String subject;
    private String body;

    public void sendNotification() 
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        mailSender.send(message);
    }

    // Getters and Setters
    public void setSender(JavaMailSender sender) 
    {
        this.mailSender = sender;
    }

    public void setRecipient(String to) 
    {
        this.to = to;
    }

    public void setSubject(String subject) 
    {
        this.subject = subject;
    }

    public void setBody(String body) 
    {
        this.body = body;
    }
}