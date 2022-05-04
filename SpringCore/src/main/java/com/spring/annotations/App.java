package com.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//This is the sub class of Application Context which acts as a container. which is responsible
    	//for managing the life cycle.
    	
    	AnnotationConfigApplicationContext annot=new AnnotationConfigApplicationContext(StudentConfig.class);
//    	Employee e1=(Employee)annot.getBean("emp2");
//    	System.out.println("Employee name is "+e1.getEmpname());
//    	
//    	Department d=(Department)annot.getBean("dept1");
//    	System.out.println("Department name is "+d.getDeptname());
//    	Employee emp=d.getEmp();
//    	System.out.println("Employee in department "+emp.getEmpname());
    	
    	
    	College c = (College)annot.getBean("col1");
    	System.out.println("College name is"+ c.getCollege_name());
    	Student s = (Student)annot.getBean("stu1");
    	System.out.println("Student name is "+ s.getName());
    }
}


