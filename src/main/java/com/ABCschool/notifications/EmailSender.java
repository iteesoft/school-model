package com.ABCschool.notifications;

/**
 * This interface was created to provide message services for the
 * model
 */
public interface EmailSender {
    public void sendTextEmail(String to, String from, String subject, String content);
    public void sendHtmlEmail(String to, String from, String subject, String content);

}
