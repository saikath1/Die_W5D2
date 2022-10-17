public class GhostDriver
{
    public static void main(String[] args)
    {
        Ghost ghost1 = new Ghost("Kate Morgan", 2008);
        Ghost ghost2 = new Ghost("Dorothy Walpole", 1985);
        System.out.println(ghost1.NAME);
        ghost2.display();
    } // end main
} // end class GhostDriver
