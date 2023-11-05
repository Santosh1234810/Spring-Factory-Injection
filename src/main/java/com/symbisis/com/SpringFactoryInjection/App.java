package com.symbisis.com.SpringFactoryInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.A;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
    	A obj = (A) context.getBean("a");
    	
    	obj.msg();
    }
}
