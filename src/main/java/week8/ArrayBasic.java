package week8;

public class ArrayBasic {
    public static void main( String args[] ) {

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};
        int Sum = myNum[0]+myNum[1];
        System.out.println(cars[0]);
        System.out.println(cars.length);
        System.out.println("Array element "+myNum[0]+"and sum of first two elements are "+Sum );
        //Array Declaration
        int[] array;
        //Array Initialization
        array = new int[]{1,2,3,4,5};
        //Printing the elements of array
        for (int i =0;i < 5;i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("Array is "+array[0]);
        String[] names = {"Peter", "Paul", "Mary-Anne"};

        for (int i =0;i < names.length;i++)
        {
            System.out.println(names[i]);
        }
    }
}
