package com.solid;

interface Employee {
 void showDetails();
 void performDuties();
}

abstract class BaseEmployee implements Employee {
 protected String name;
 protected String role;

 public BaseEmployee(String name, String role) {
     this.name = name;
     this.role = role;
 }

 @Override
 public void showDetails() {
     System.out.println("Name: " + name + ", Role: " + role);
 }
}

interface Workable {
 void work();
}

interface Securable {
 void secure();
}

class Manager extends BaseEmployee implements Workable {
 public Manager(String name) {
     super(name, "Manager");
 }

 @Override
 public void performDuties() {
     work();
 }

 @Override
 public void work() {
     System.out.println(name + " is managing the team and projects.");
 }
}

class Developer extends BaseEmployee implements Workable {
 public Developer(String name) {
     super(name, "Developer");
 }

 @Override
 public void performDuties() {
     work();
 }

 @Override
 public void work() {
     System.out.println(name + " is writing and debugging code.");
 }
}

class SecurityGuard extends BaseEmployee implements Securable {
 public SecurityGuard(String name) {
     super(name, "Security Guard");
 }

 @Override
 public void performDuties() {
     secure();
 }

 @Override
 public void secure() {
     System.out.println(name + " is monitoring the premises and ensuring security.");
 }
}

class Company {
 private List<Employee> employees = new ArrayList<>();

 public void addEmployee(Employee employee) {
     employees.add(employee);
 }

 public void showAllEmployees() {
     for (Employee emp : employees) {
         emp.showDetails();
         emp.performDuties();
         System.out.println("----------------------");
     }
 }
}

public class Solid {
 public static void main(String[] args) {
     Company company = new Company();

     Developer dev = new Developer("Alice");
     Manager manager = new Manager("Bob");
     SecurityGuard guard = new SecurityGuard("Charlie");

     company.addEmployee(dev);
     company.addEmployee(manager);
     company.addEmployee(guard);

     company.showAllEmployees();
 }
}
