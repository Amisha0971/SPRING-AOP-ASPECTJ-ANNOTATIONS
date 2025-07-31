package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.service.BankService;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BankService bank = (BankService) context.getBean("bankService");
        bank.withdraw(5000);

        ((ClassPathXmlApplicationContext) context).close();
    
}
}
