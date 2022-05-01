package com.spring.springcore.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext cont = new ClassPathXmlApplicationContext("beans.xml");
//    	Product p=(Product)cont.getBean("productobj");
//    	System.out.println("Product name "+p.getProductname());
//    	System.out.println("Price is "+p.getPrice());
//    	
//
//    	Employee obj =(Employee)cont.getBean("empobj");
//    	System.out.println("Employee name "+ obj.getEmpname());
//    	System.out.println("Employee salary "+ obj.getSalary());
//    	
//    	Product p1=(Product)cont.getBean("productobj1");
//    	System.out.println("Product name "+p1.getProductname());
//    	System.out.println("Price is "+p1.getPrice());
//    	
//    	Cart c = (Cart) cont.getBean("cart1");
//    	System.out.println("Cart name is "+ c.getCart_name());
//    	Product p2 = c.getProd();
//    	System.out.println("Product name is "+ p2.getProductname());
    	
    	
    	Department d = (Department)cont.getBean("depobj");
    	System.out.println("Department name" + d.getDeptname());
    	Employee e = d.getEmpobj();
    	System.out.println("Employee name" + e.getEmpname());
    	
    	
    	
    	
    	
    	
    }
}
