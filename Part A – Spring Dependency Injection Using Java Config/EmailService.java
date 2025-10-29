package com.example.springdi;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String msg) {
        System.out.println("Email sent with message: " + msg);
    }
}
