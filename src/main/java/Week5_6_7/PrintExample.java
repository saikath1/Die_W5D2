import java.util.Scanner;

public class PrintExample {
    public static void main(String[] args) {
        String pluralNoun = "cows";
        String noun = "cabbage";
        String color = "red";
        int quantity = 5;
        double percentage = 33.84;
        System.out.format("The %d %s painted%n%f %% of the %s %s. %n", quantity, pluralNoun, percentage, noun, color);
        double a = 5.0/3;
        String b = "Class";
        System.out.printf("Hi, %-12s, 5/3 is %06.2f", b, a);

    }
}