package com.sp.springannotation;

import java.text.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {	
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
    	
        Sony z5 = factory.getBean(Sony.class);
        z5.config();
    }
}
