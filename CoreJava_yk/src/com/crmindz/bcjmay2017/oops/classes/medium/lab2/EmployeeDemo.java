package com.crmindz.bcjmay2017.oops.classes.medium.lab2;

/**
 * @author Yeshwanth Konakanchi
 * Class to demonstrate performance of employee entity class
 */
public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Siva", "Yarram", 27000);
		Employee emp2 = new Employee("Krishna", "Yarram", 22000);
		
		System.out.println("Employee 1 Salary " + emp1.getSalary());
		System.out.println("Employee 2 Salary " + emp2.getSalary());
		
		emp1.setSalary(emp1.getSalary() + (emp1.getSalary()*10)/100);
		emp2.setSalary(emp2.getSalary() + (emp2.getSalary()*10)/100);
		
		System.out.println("Employee 1 Salary after incr " + emp1.getSalary());
		System.out.println("Employee 2 Salary after incr " + emp2.getSalary());
	}

}
