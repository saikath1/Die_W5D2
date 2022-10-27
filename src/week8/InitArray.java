package week8;

import javax.sound.midi.Soundbank;

public class InitArray {
    public static void main(String[] args){
        // initializer list specifies the initial value of each element
        int[] array={32,27,64,18,15,90,70};
        int total=0;
        System.out.printf("%s%8s%n", "Index","Value"); // column heading
        for (int counter =0; counter<array.length;counter++)
        {
            System.out.printf("%5d%8d%n",counter,array[counter]);
       total+=array[counter];
            System.out.printf("Total of array elements:%d%n", total);
        }
    }
}
