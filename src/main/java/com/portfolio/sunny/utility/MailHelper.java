package com.portfolio.sunny.utility;


import com.portfolio.sunny.model.Contact;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class MailHelper {
    public static void sendEmail(String message, JavaMailSender javaMailSender){
        SimpleMailMessage simpleMailMessage =new SimpleMailMessage();
        simpleMailMessage.setTo("sunnychand01111@gmail.com");
        simpleMailMessage.setSubject("Mail from the portfolio  webpage");

        simpleMailMessage.setText(message);

        try{
            javaMailSender.send(simpleMailMessage);}
        catch(MailException exception){
            exception.printStackTrace();
        }

    }
}
