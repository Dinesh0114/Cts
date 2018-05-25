package com.cts.employee;

public class Employee {
private int id;
private String name;
private int salary;
private Address address;

/*public Employee(int id)
{
	this.id=id;
	}
*///constructor can be called for inheritance if it is needed
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
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + salary;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (address == null) {
		if (other.address != null)
			return false;
	} else if (!address.equals(other.address))
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (salary != other.salary)
		return false;
	return true;
}
public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public void display(Address address)
{
	System.out.println (id);
	System.out.println(name);
	System.out.println(salary);
	address.setCity("chennai");
	address.setPincode(641006);
	address.setStreet("kumaran nagar");
	System.out.println("city:" +address.getCity()+"  "  + "Pincode:" +address.getPincode() +"  "+ "Street:"  + address.getStreet());
	
}

}


