/*************************************************************
 * PennyJar.java
 * Dean & Dean
 *
 * This class counts pennies for individual penny jars and for
 * all penny jars combined.
 *************************************************************/

public class PennyJar
{
    public static int goal; // open jars when combined pennies reaches the goal
    private static int allPennies = 0; // pennies in all jars combined
    private int pennies = 0;           // pennies in one jar

    //**************************************************

    public static void setGoal(int goal)
    {
        PennyJar.goal = goal;
    }

    //**************************************************

    public static int getAllPennies()
    {
        return PennyJar.allPennies;
    }

    //**************************************************

    public int getPennies()
    {
        return this.pennies;
    }

    //**************************************************

    public void addPenny()
    {
        System.out.println("Clink!");
        this.pennies++;
        PennyJar.allPennies++;

        if (PennyJar.allPennies >= PennyJar.goal)
        {
            System.out.println("Time to spend!");
        }
    } // end addPenny
} // end class PennyJar

