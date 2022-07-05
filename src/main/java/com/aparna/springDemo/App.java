package com.aparna.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Employee emp = (Employee)context.getBean(Employee.class);
        emp.setEmpName("Aparna");
        System.out.println("Emp1 " +emp);
        
    }
}
