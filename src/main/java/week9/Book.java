package week9;

/*************************************************************
 * Book.java
 * Dean & Dean
 *
 * This class stores a book's information and retrieves a book
 * based on the book's ISBN number.
 *************************************************************/

public class Book extends Object {
    private String title;
    private String author;
    private String isbn;

    //**********************************************************

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    } // end Book constructor

    //**********************************************************

    public String getTitle() {
        return title;
    }

    //**********************************************************

    public String toString() {
        return title + " " + author + " " + isbn;
    }
} // end class Book
