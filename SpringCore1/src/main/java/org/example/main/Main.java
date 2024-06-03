package org.example.main;

import org.example.beans.Amazon;
import org.example.beans.FedEx;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Amazon obj = context.getBean("amazon",Amazon.class);
//        Amazon obj = (Amazon) context.getBean("amazon");
        Amazon obj = context.getBean(Amazon.class);
        obj.delivery(2344);
//       FedEx obj =  context.getBean("fedex",FedEx.class);
//        obj.courierService(2344);
    }
}