package org.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MyService myService = context.getBean("myService", MyService.class);
        myService.performService();

        TextPrinter textFormatter = context.getBean("textPrinter", TextPrinter.class);
        textFormatter.printText(" Hello World! ");

        context.close();
    }
}