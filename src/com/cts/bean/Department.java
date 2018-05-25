package com.cts.bean;

public class Department {
public int id;
public String name;
public EmployeeDetails employee;

public Department(int id, String name, EmployeeDetails employee) {
	super();
	this.id = id;
	this.name = name;
	this.employee = employee;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public EmployeeDetails getEmployee() {
	return employee;
}
public void setEmployee(EmployeeDetails employee) {
	this.employee = employee;
}

}
