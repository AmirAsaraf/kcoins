package com.kcoins.mail;

import com.sendgrid.SendGrid;
import com.sendgrid.SendGridException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Created by asaraf on 25/11/2016.
 */
public class MailService {
    final Logger logger          = LogManager.getLogger(MailService.class.getName());

    private static MailService mailService                      = null;

    public static final String SENDGRID_API_KEY                 = "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";
    public static final String FROM                             = "kcoins@kenshoo.com";

    public static MailService getInstance() {
        if (mailService == null) {
            mailService = new MailService();
        }
        return mailService;
    }

    public String sendMail(String subject, String title, String content, String[] to) {
        SendGrid sendgrid = new SendGrid(SENDGRID_API_KEY);
        SendGrid.Email email = new SendGrid.Email();

        email.setHtml("<div>Test Mail<div/>");

        email.setSubject(subject);
        email.setTo(to);

        email.setFrom(FROM);

        try {
            SendGrid.Response response = sendgrid.send(email);
            return response.getMessage();
        }
        catch (SendGridException e) {
            logger.error("Error sending mail! " + e.getMessage());
            return e.getMessage();
        }
    }
}
