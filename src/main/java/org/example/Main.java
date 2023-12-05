package org.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Replace the line below instantiating MyService with fetching it from the context. (required modification of applicationContext.xml)
        MyService myService = new MyService();
        myService.performService();

        // This will fail. Fix this by defining beans in applicationContext.xml
        TextPrinter textFormatter = context.getBean("textPrinter", TextPrinter.class);
        textFormatter.printText(" Hello World! ");

        context.close();
    }
}