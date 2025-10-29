package com.example.springdi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    private MessageService service;

    public MyApp(MessageService service) {
        this.service = service;
    }

    public void processMessage(String msg) {
        service.sendMessage(msg);
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        MyApp app = context.getBean(MyApp.class);
        app.processMessage("Hello Spring DI (Java Config)!");
        context.close();
    }
}
