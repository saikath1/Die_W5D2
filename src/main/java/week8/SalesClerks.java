package week8;

class SalesClerks
{
    private SalesClerk[] clerks;     // contains names and sales
    private int filledElements = 0;  // number of elements filled

    //***********************************************************

    public SalesClerks(int initialSize)
    {
        clerks = new SalesClerk[initialSize];
    } // end SalesClerks constructor

    //***********************************************************

    // Process a sale for the clerk whose name is passed in.
    // If the name is not already in the clerks array,
    // create a new object and insert a reference to it in the
    // next array element, doubling array length if necessary.

    public void addSale(String name, double amount)
    {
        int clerkIndex = findClerk(name);

        if (clerkIndex == -1) // add a new clerk
        {
            if (filledElements == clerks.length)
            {
                doubleLength();
            }
            clerkIndex = filledElements;
            clerks[clerkIndex] = new SalesClerk(name);
            filledElements++;
        } // end if

        clerks[clerkIndex].adjustSales(amount);
    } // end addSale

    //**********************************************************

    // Print all the data - sales clerk names and sales.

    public void dumpData()
    {
        for (int i=0; i<filledElements; i++)
        {
            System.out.printf("%s: %6.2f\n",
                    clerks[i].getName(), clerks[i].getSales());
        }
    } // end dumpData

//**********************************************************
    // Search for the given name. If found, return the index.
    // Otherwise, return -1.

    private int findClerk(String name)
    {
        for (int i=0; i<filledElements; i++)
        {
            if (clerks[i].getName().equals(name))
            {
                return i;
            }
        } // end for
        return -1;
    } // end findClerk

    //**********************************************************

    // Double the length of the array.

    private void doubleLength()
    {
        SalesClerk[] clerks2 = new SalesClerk[2 * clerks.length];
        System.arraycopy(clerks, 0, clerks2, 0, clerks.length);
        clerks = clerks2;
    } // end doubleLength
} // end class SalesClerks
