package week9;

import java.util.Scanner;

public class BookStoreDriver
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        Bookstore bookstore = new Bookstore();
        String title;  // title for requested book

        bookstore.fillTheStore();
        System.out.print("What book title are you looking for? ");
        title = stdIn.next();
        System.out.println("Book information:\n" +
                bookstore.getBook(title).toString());
    } // end main
} // end BookstoreDriver class