package week8;

import  java.util.Arrays;

public class RollDie {
    public static void main(String[ ] args)
    {
        int n = 10, roll;
        int res[] = new int[6];

        System.out.println("Total rolls = " + n);
        for(int i=0; i<n; i++)
        {
            roll = 1+(int)(Math.random() * 6);
            res[roll-1]++;
        }

        for(int i=0; i<6; i++)	System.out.println("Number of times " + (i+1) + " was rolled = " + res[i]);
    }
}