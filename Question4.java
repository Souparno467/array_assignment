package com.example;
//Author Souparno
 class Employee {

	    // Employee class with name and salary
	    
	        String name;
	        double salary;
	    

	    // Method to initialize the employee data
	    public static Employee[] initializeEmployees() {
	        Employee[] employees = new Employee[3];

	        // Initializing the Employee objects
	        employees[0] = new Employee();
	        employees[0].name = "Ankan";
	        employees[0].salary = 25000;

	        employees[1] = new Employee();
	        employees[1].name = "Souparno";
	        employees[1].salary = 10000;

	        employees[2] = new Employee();
	        employees[2].name = "Aditya";
	        employees[2].salary = 30000;

	        return employees;
	    }

	    // Method to find the employee with the highest salary
	    public static Employee findHighestSalary(Employee[] employees) {
	        Employee highestSalary = employees[0];

	        for (int i = 1; i < employees.length; i++) {
	            if (employees[i].salary > highestSalary.salary) {
	                highestSalary = employees[i];
	            }
	        }

	        return highestSalary;
	    }

	    public static void main(String[] args) {
	        // Calling the method to initialize the Employee objects
	        Employee[] employees = initializeEmployees();

	        // Calling the method to find the employee with the highest salary
	        Employee highestSalaryEmployee = findHighestSalary(employees);

	        // Print the name and salary of the employee with the highest salary
	        System.out.println("The employee with the highest salary is: " 
	                           + highestSalaryEmployee.name + " with Salary: " 
	                           + highestSalaryEmployee.salary);
	    }
	

	    
	}

