package com.app;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
	  Scanner sc= new Scanner (System.in);
	private int id;
	private String name;
	private double salary;
	
	
	Employee(){
		
	}


	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public Employee acceptData() {
		System.out.println("Enter id:");
		int id=sc.nextInt();
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter salary:");
		double salary = sc.nextDouble();
		Employee e= new Employee(id,name,salary);
		return  e;
	}


	@Override
	public int hashCode() {
		return Objects.hash(name, salary);
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
		return Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}
	
	
	
}
