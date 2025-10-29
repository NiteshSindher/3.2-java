package com.example.banking;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankingApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        AccountService service = ctx.getBean(AccountService.class);
        service.transferMoney(101, 102, 5000);

        System.out.println("Transaction Successful!");
        ctx.close();
    }
}
