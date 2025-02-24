package com.wipro.java.microservices.solid;

interface Book {
    void displayDetails();
}

class StoryBook implements Book {
    String title;
    String author;

    public StoryBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Story Book: " + title + " by " + author);
    }
}

public class Books {
    public static void main(String[] args) {
        Book storyBook = new StoryBook("My First Book", "John Doe");
        storyBook.displayDetails();
    }
}
