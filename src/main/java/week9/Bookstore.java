package week9;

/***************************************************************
 * BookstoreDriver.java
 * Dean & Dean
 *
 * This program stores books and retrieves a book based on title.
 ***************************************************************/


/**************************************************************
 * Bookstore.java
 * Dean & Dean
 *
 * This class implements storage and retrieval functionality for
 * a bookstore.
 **************************************************************/

import java.util.ArrayList;

public class Bookstore
{
    private ArrayList<Book> books = new ArrayList<Book>();

    //***********************************************************

    // This method adds books to the bookstore.

    public void fillTheStore()
    {
        books.add(new Book("How to Program C++", "Detiel", "11111"));
        books.add(new Book("Introduction to JAVA", "Dean", "22222"));
    } // end stockTheStore

    //***********************************************************

    // This method searches for title and returns information.

    public Book getBook(String title)
    {
        for (Book book : books)
        {
            if (book.getTitle().equals(title))
            {
                return book;
            }
        }
        return new Book("Sorry - book not found.", "", "");
    } // end getbook
} // end Bookstore class

