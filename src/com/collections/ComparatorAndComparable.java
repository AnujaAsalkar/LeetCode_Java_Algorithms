package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class ComparatorAndComparable {
	
	static class Employee{
		int employeeId;
		String name;
		String department;
		
		public Employee(){
			
		}
		
		public Employee(int employeeId, String name, String department){
			this.employeeId=employeeId;
			this.name=name;
			this.department=department;
		}
		
		public int getEmployeeId(){
			return employeeId;
		}
		public String getName(){
			return name;
		}
		public String getDepartment(){
			return department;
		}
		
		public String toString(){
			return "ID: " +this.employeeId+ " name: "+this.name+ " department: "+ this.department;
		}
		
	}
	
	public static class NameComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee emp1, Employee emp2) {
			// TODO Auto-generated method stub
			return emp1.getName().compareTo(emp2.getName());
		}
		
	}
	
	
	public static void main(String args[]){
		
		List<Employee> list=new ArrayList<Employee>();
		
		
		
		Employee e1 = new Employee(4,"nihar","engineering");
		list.add(e1);
		Employee e2 = new Employee(3,"anuj","science");
		list.add(e2);
		Employee e3 = new Employee(5,"xyz","anthrology");
		list.add(e3);
		Employee e4 = new Employee(1,"neha","managemant");
		list.add(e4);
		
		Collections.reverse(list);
		
		System.out.println("reversed list:");
		
		System.out.println(list);
		
		
		Collections.sort(list, new Comparator<Employee>(){

			@Override
			public int compare(Employee emp1, Employee emp2) {
				return emp1.getDepartment().compareTo(emp2.getDepartment());
			}
			
		});
		System.out.println("sorting by department");
		for(Employee e: list){
			System.out.println(e);

		}
		System.out.println("Sorting by name");
		Collections.sort(list, new NameComparator());
		for(Employee e: list){
			System.out.println(e);

		}
	}

}
