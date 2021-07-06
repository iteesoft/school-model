package com.ABCschool.notifications.impl;

import com.ABCschool.notifications.EmailSender;

public class MailchimpEmailSender implements EmailSender {

    @Override
    public void sendTextEmail(String to, String from, String subject, String content) {
        System.out.printf("[Mailchimp]: %s is sending a TEXT email to: %s\nWith subject: %s\n and message: %s", from, to, subject, content);
    }

    @Override
    public void sendHtmlEmail(String to, String from, String subject, String content) {
        System.out.printf("[Mailchimp]: %s is sending a TEXT email to: %s\nWith subject: %s\n and message: %s", from, to, subject, content);
    }
}
