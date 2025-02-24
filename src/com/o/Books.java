package com.o;

//Demonstrating the Open/Closed Principle

interface Book {
 void displayDetails();
 double calculatePrice();
}

class PhysicalBook implements Book {
 String title;
 String author;
 double price;

 public PhysicalBook(String title, String author, double price) {
     this.title = title;
     this.author = author;
     this.price = price;
 }

 @Override
 public void displayDetails() {
     System.out.println("Physical Book: " + title + " by " + author);
 }

 @Override
 public double calculatePrice() {
     return price;
 }
}

class EBook implements Book {
 String title;
 String author;
 double price;
 double discountRate;

 public EBook(String title, String author, double price, double discountRate) {
     this.title = title;
     this.author = author;
     this.price = price;
     this.discountRate = discountRate;
 }

 @Override
 public void displayDetails() {
     System.out.println("E-Book: " + title + " by " + author);
 }

 @Override
 public double calculatePrice() {
     return price * (1 - discountRate);
 }
}

class Audiobook implements Book {
 String title;
 String author;
 double price;
 double lengthInHours;

 public Audiobook(String title, String author, double price, double lengthInHours) {
     this.title = title;
     this.author = author;
     this.price = price;
     this.lengthInHours = lengthInHours;
 }

 @Override
 public void displayDetails() {
     System.out.println("Audiobook: " + title + " by " + author + " (" + lengthInHours + " hours)");
 }

 @Override
 public double calculatePrice() {
     return price;
 }
}

public class Books {
 public static void main(String[] args) {
     Book physicalBook = new PhysicalBook("Java Basics", "John Doe", 500);
     Book eBook = new EBook("Spring Boot Guide", "Jane Smith", 300, 0.1);
     Book audiobook = new Audiobook("Clean Code", "Robert C. Martin", 700, 10);

     physicalBook.displayDetails();
     System.out.println("Price: " + physicalBook.calculatePrice());
     
     eBook.displayDetails();
     System.out.println("Price after discount: " + eBook.calculatePrice());
     
     audiobook.displayDetails();
     System.out.println("Price: " + audiobook.calculatePrice());
 }
}