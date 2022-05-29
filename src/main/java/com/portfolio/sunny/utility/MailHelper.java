package com.portfolio.sunny.utility;


import com.portfolio.sunny.model.Contact;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class MailHelper {
    public static void sendEmail(String message, JavaMailSender javaMailSender,String subject,String... to){
        SimpleMailMessage simpleMailMessage =new SimpleMailMessage();
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(message);

        try{
            javaMailSender.send(simpleMailMessage);}
        catch(MailException exception){
            exception.printStackTrace();
        }

    }
}
