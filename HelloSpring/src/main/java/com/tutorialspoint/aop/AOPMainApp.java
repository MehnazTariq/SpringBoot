package com.tutorialspoint.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("AOPConfig.xml");
      
      Student student = (Student) context.getBean("student");
      student.getName();
      student.getAge();
      //student.printThrowException();
   }
}
