package week5;

import java.util.Scanner;

// Driver class contains the main method and "drives" the program
public class CircleDriver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Circle circle = new Circle(1); // argument 1 is copied into the parameter of the constructor
        System.out.println(circle.getRadius());
        System.out.println(circle.getName());

        // radius is private, so we need a method to access it and change it
        circle.setRadius(5);
        System.out.println(circle.getRadius());
        Circle c2 = new Circle(1);
        // two different instances of a Circle contain different values
        System.out.println(circle.getRadius() + " " + c2.getRadius());
        Circle c3 = new Circle(3, "Fred");
        System.out.println(c3.getName());

//        if the instance variable were public, we could access it directly, like Math.PI
//        System.out.println(circle.radius);
//        circle.radius = 6;
//        System.out.println(circle.radius);
    }
}
