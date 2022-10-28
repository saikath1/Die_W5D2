package week8;
import java.util.Arrays;
import java.util.Scanner;
public class SortingNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // Step 1 --Get number of numbers from user//
        int numNumbers;
        do {
            System.out.println("How  many numbers do you want to sort?");
            String userInput = in.nextLine();
            numNumbers = Integer.parseInt(userInput);
        }
        while (numNumbers < 0);
// Step 2 --Get numbers from the user
        System.out.println("Enter  each number");
        double[] numbers = new double[numNumbers];
        for (int i = 0; i < numbers.length; i++) {
            String userInput = in.nextLine();
            double number = Double.parseDouble(userInput);
            numbers[i] = number;
        }
// Step 3 --Sort  the numbers//
        Arrays.sort(numbers);
// Step  4 --print the numbers out
        System.out.println();
        System.out.println("Your  sorted  numbers are:");/*
    for(inti= 0; i< numbers.length; i++)
     {
     System.out.println(numbers[i]);
       } */
        System.out.println(Arrays.toString(numbers));
    }
}