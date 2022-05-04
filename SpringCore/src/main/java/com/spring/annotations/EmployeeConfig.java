package com.spring.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//To create any class as configuration class. it is substitute of XML File
@Configuration
public class EmployeeConfig {
	
	@Bean(name="emp1")
	public Employee getEmp()
	{
		Employee e1=new Employee();
		e1.setEmpid(1);
		e1.setEmpname("John");
		e1.setSalary(23432.33);
		return e1;
	}
	@Bean(name="emp2")
	public Employee getEmp1()
	{
		Employee e1=new Employee();
		e1.setEmpid(2);
		e1.setEmpname("Vanshita");
		e1.setSalary(23432.33);
		return e1;
	}
	
	@Bean(name="dept1")
	public Department getDept()
	{
		Department d=new Department();
		d.setDeptid(101);
		d.setDeptname("Finance");
		d.setCity("Chicago");
		return d;
	}
}
