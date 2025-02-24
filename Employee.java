package com.wipro.java.microservices.solid;

class Emp {
    String name;
    String position;
    double salary;

    public Emp(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }
}

class SalaryCalculator {
    public double calculateAnnualSalary(Emp employee) {
        return employee.salary * 12;
    }
}

class EmployeeFileManager {
    public void saveEmployeeToFile(Emp employee, String filename) {
        // Add file-saving logic here
        System.out.println("Saving employee details to " + filename);
    }
}

public class Employee {
    public static void main(String[] args) {
        Emp employee = new Emp("Alice Johnson", "Software Engineer", 75000);
        SalaryCalculator calculator = new SalaryCalculator();
        EmployeeFileManager fileManager = new EmployeeFileManager();

        employee.printEmployeeDetails();
        System.out.println("Annual Salary: " + calculator.calculateAnnualSalary(employee));
        fileManager.saveEmployeeToFile(employee, "employee_data.txt");
    }
}
