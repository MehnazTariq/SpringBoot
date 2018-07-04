package com.tutorialspoint.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TextEditorAppContext {

	public static void main(String[] args) {

		 ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
	      
		 TextEditor te = (TextEditor) context.getBean("textEditor");
	      te.spellCheck();

	}

}
