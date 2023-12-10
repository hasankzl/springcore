package org.example;

import org.example.phone.SamsungPhone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       Vehicle obj =(Vehicle) context.getBean("car");
       obj.drive();

   Tyre t = (Tyre) context.getBean("tyre");
    System.out.println(t);

    ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

    SamsungPhone s7= factory.getBean(SamsungPhone.class);
    s7.config();
    }
}
