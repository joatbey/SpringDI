package com.muhammet.springFW;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");   // spring.xml dosyasını okuyoruz.
        IPrinter printer= beanFactory.getBean("printer", IPrinter.class);                   // spring.xml dosyasındaki printer bean'ini alıyoruz.
        printer.print();                                                                          // printer bean'ini kullanıyoruz.
    }
}
