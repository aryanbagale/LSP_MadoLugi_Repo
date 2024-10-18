package org.howard.edu.lsp.midterm.question1;

public class BookDriver {
    public static void main(String[] args) {
        // Instantiating Book objects
        Book firstBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book secondBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book thirdBook = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);

        // Checking equality between the first and second book
        System.out.println(firstBook.equals(secondBook)); // Output: true
        
        // Checking equality between the first and third book
        System.out.println(firstBook.equals(thirdBook)); // Output: false

        // Displaying the string representation of the first book
        System.out.println(firstBook); // Output: Title: The Great Gatsby, Author: F. Scott Fitzgerald, ISBN: 123456789, Year Published: 1925
    }
}
