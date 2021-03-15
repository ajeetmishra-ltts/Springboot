package com.ltts.SpringSec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context  =new ClassPathXmlApplicationContext("bean.xml");
    	Employee s=(Employee)context.getBean("emp");
    	Employee s1=(Employee)context.getBean("emp1");
    	System.out.println(s);
    	System.out.println(s1);
    }
}
