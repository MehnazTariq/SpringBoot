package com.tutorialspoint;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class XmlBeanFactoryApp 
{
    public static void main( String[] args )
    {
    	 XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("Beans.xml")); 
         HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");    
         obj.getMessage1(); 
    }
}
