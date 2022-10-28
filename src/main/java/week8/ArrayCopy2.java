package week8;
import java.util.Arrays;
// A Java program to demonstrate that simply
// assigning one array reference is incorrect
public class ArrayCopy2 {
    public static void main(String[] args)
    {
        int a[] = { 1, 8, 3 };
        System.out.println(a);        // Create an array b[] of same size as a[]
        System.out.println(Arrays.toString(a));        // Create an array b[] of same size as a[]
        int b[] = new int[a.length];

        // Doesn't copy elements of a[] to b[],
        // only makes b refer to same location
        b = a;

        // Change to b[] will also reflect in a[]
        // as 'a' and 'b' refer to same location.
        b[0]++;

        System.out.println("Contents of a[] ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        System.out.println("\n\nContents of b[] ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }
}
