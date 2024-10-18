package org.howard.edu.lsp.midterm.question1;

public class Book {
 // Properties of the Book class
 private String bookTitle;  // Title of the book
 private String bookAuthor; // Author of the book
 private String bookISBN;   // ISBN number (unique identifier)
 private int publicationYear;  // Year the book was published

 // Constructor to initialize the Book object
 public Book(String bookTitle, String bookAuthor, String bookISBN, int publicationYear) {
     this.bookTitle = bookTitle;
     this.bookAuthor = bookAuthor;
     this.bookISBN = bookISBN;
     this.publicationYear = publicationYear;
 }

 // Getter and setter for bookTitle
 public String getBookTitle() {
     return bookTitle;
 }

 public void setBookTitle(String bookTitle) {
     this.bookTitle = bookTitle;
 }

 // Getter and setter for bookAuthor
 public String getBookAuthor() {
     return bookAuthor;
 }

 public void setBookAuthor(String bookAuthor) {
     this.bookAuthor = bookAuthor;
 }

 // Getter and setter for bookISBN
 public String getBookISBN() {
     return bookISBN;
 }

 public void setBookISBN(String bookISBN) {
     this.bookISBN = bookISBN;
 }

 // Getter and setter for publicationYear
 public int getPublicationYear() {
     return publicationYear;
 }

 public void setPublicationYear(int publicationYear) {
     this.publicationYear = publicationYear;
 }

 // Overriding equals() to compare books based on ISBN and author
 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;
     if (obj == null || getClass() != obj.getClass()) return false;
     Book otherBook = (Book) obj;
     return bookISBN.equals(otherBook.bookISBN) && bookAuthor.equals(otherBook.bookAuthor);
 }

 // Overriding toString() to return a string representation of the Book object
 @Override
 public String toString() {
     return "Title: " + bookTitle + 
            ", Author: " + bookAuthor + 
            ", ISBN: " + bookISBN + 
            ", Year Published: " + publicationYear;
 }
}
