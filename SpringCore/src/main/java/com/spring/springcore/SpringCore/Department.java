package com.spring.springcore.SpringCore;

public class Department {
	private int deptid;
	private String deptname;
	private Employee empobj;
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
	public Employee getEmpobj() {
		return empobj;
	}
	public void setEmpobj(Employee empobj) {
		this.empobj = empobj;
	}
	
}
