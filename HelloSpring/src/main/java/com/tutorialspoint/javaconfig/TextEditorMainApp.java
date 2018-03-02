package com.tutorialspoint.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class TextEditorMainApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(TextEditorConfig.class);

		TextEditor te = ctx.getBean(TextEditor.class);
		te.spellCheck();
	}
}
