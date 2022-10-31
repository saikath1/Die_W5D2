package week9;

    import java.util.ArrayList;
import java.util.Scanner;

    /**
     * Reads strings from console until STOP into an ArrayList, then prints the ArrayList.
     */
    public class ReadArrayList
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            ArrayList<String> values = new ArrayList<String>();

            // Reads values until user enters STOP
            System.out.print("Enter a string: ");
            String input = sc.nextLine();
            while (!input.equals("STOP"))
            {
                values.add(input);
                System.out.print("Enter a string: ");
                input = sc.nextLine();
                System.out.println(input.toString());

            }

            // Print out values in ArrayList
            System.out.println("List contents: ");
            for (int i=0; i < values.size(); i++)
                System.out.println(values.get(i));
        }

    }
