package com.spring.annotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//Autowiring-autowiring is concept in spring framework which allows to inject object
//in respective class automatically

@Component
public class Department {
	private int deptid;
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	private String deptname;
	private String city;
	@Autowired//by default it is bytype
	@Qualifier("emp1")//now i m making it by name
	
	private Employee emp;

}
/*
 * We can two Type of autowire
 * byName-it will check property name and bean name defined in configuration file 
 * it will inject according to name
 * byType-class type of property and return type of method should be same 
 */