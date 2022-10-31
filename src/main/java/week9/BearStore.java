package week9;

import java.util.Scanner;
import java.util.ArrayList;

public class BearStore
{
    ArrayList<Bear> bears = new ArrayList<>();

    //**********************************************************

    // Fill store with specified number of standard teddy bears.

    public void addStdBears(int num)
    {
        for (int i=0; i<num; i++)
        {
            bears.add(new Bear("Acme", "brown teddy"));
        }
    } // end addStdBears
    //**********************************************************

    // Fill store with specified number of customized bears.

    public void addUserSpecifiedBears(int num)
    {
        for (int i=0; i<num; i++)
        {
            bears.add(getUserSpecifiedBear());
        }
    } // end addUserSpecifiedBears

    //**********************************************************

    // Prompt user for a customized bear name and return bear.

    private Bear getUserSpecifiedBear()
    {
        Scanner stdIn = new Scanner(System.in);
        String maker, type;

        System.out.print("Enter bear's maker: ");
        maker = stdIn.nextLine();
        System.out.print("Enter bear's type: ");
        type = stdIn.nextLine();
        return new Bear(maker, type);
    } // end getUserSpecifiedBear
    //**********************************************************

    // Print all the bears in the store.

    public void displayInventory()
    {
        for (Bear bear : bears)
        {
            bear.display();
        }
    } // end displayInventory

    //**********************************************************

    public static void main(String[] args)
    {
        BearStore store = new BearStore();
        store.addStdBears(3);
        store.addUserSpecifiedBears(2);
        store.displayInventory();
    } // end main
} // end BearStore class