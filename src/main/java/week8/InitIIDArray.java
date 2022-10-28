package week8;
import java.util.Arrays;
public class InitIIDArray {
    // Initializing two-dimensional arrays.

    // create and output two-dimensional arrays
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Values in array1 by row are");
        System.out.println(Arrays.deepToString(array1));
        System.out.println("Length "+array2[1].length);
        System.out.println("Element row 1 and column 2= " + array1[1][2]);

        System.out.printf("%nValues in array2 by row are%n");
        System.out.println(Arrays.deepToString(array2));
    }
        // output rows and columns of a two-dimensional array
        public static void outputArray(int[][] array){
            // loop through array's rows
            for (int row = 0; row < array.length; row++) {
                // loop through columns of current row
                for (int column = 0; column < array[row].length; column++) {
                    System.out.printf("%d  ", array[row][column]);
                }

                System.out.println();
            }
        }
    }

