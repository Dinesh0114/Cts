package com.cts.employeetest;

import com.cts.employee.Address;
import com.cts.employee.ContractEmployee;
import com.cts.employee.Employee;

public class EmployeeTest {
	
	
public static void main(String[] args) {
	Employee employee=new Employee();
	Address address=new Address();

	Employee emp=new Employee();
	Employee emp1=new Employee();
	System.out.println(emp.equals(emp1));
	//
	ContractEmployee contractemployee=new ContractEmployee();
employee.setId(101);
	
	employee.setName("saravana");
	
	employee.setSalary(10000);
	
	employee.setAddress(address);
	
	employee.display(address);	
	
	contractemployee.setId(102);
	contractemployee.setName("dinesh");
	contractemployee.setSalary(103);
	contractemployee.setDuration(18);
	contractemployee.display();
	/*String s1="Hello";
	String s2="Hello";*/
	
	/*if(emp.equals(emp1)) {
		
		System.out.println("true");
	} else
		System.out.println("false");*/
}


}
