package com.ABCschool.notifications.impl;


import com.ABCschool.notifications.EmailSender;

public class MailGunEmailSender implements EmailSender {
    @Override
    public void sendTextEmail(String to, String from, String subject, String content) {
        System.out.printf("[Mailgun]: %s is sending a TEXT email to %s\nWith subject: %s\n and details: %s\n", from, to, subject, content);
    }

    @Override
    public void sendHtmlEmail(String to, String from, String subject, String content) {
        System.out.printf("[Mailgun]: %s is sending a TEXT email to %s\nWith subject: %s\n and details: %s\n", from, to, subject, content);
    }
}
