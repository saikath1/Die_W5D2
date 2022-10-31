package Week5_6_7; /*************************************************************
 * ContactList.java
 * Dean & Dean
 *
 * This program creates a cell phone contacts phone number
 * list and prints the created list.
 *************************************************************/

import java.util.Scanner;

public class ContactList
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        long[] phoneList; // list of phone numbers
        int sizeOfList;   // number of phone numbers
        long phoneNum;    // an entered phone number

        System.out.print(
                "How many contact numbers would you like to enter? ");
        sizeOfList = stdIn.nextInt();
        phoneList = new long[sizeOfList];
        for (int i=0; i<sizeOfList; i++)
        {
            System.out.print("Enter phone number: ");
            phoneNum = stdIn.nextLong();
            phoneList[i] = phoneNum;
        } // end for

        System.out.println("\nContacts List:");
        for (int i=0; i<sizeOfList; i++)
        {
            System.out.println((i + 1) + ". " + phoneList[i]);
        } // end for
    } // end main
} // end class ContactList
