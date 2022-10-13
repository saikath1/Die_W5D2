/*
 * Course: CS-1011-01
 * Name: Sean Jones
 * Assignment: Rectangle Demo
 * Created By: 10-12-2022
 */
package week6;

/**
 * In class demo for object classes using a rectangle
 */
public class RectangleDriver {
    /**
     * Transformation scale used in the program
     */
    public static final double TRANSFORM = 0.5;

    public static void main(String[] args) {
        final double startingLength = 5.0;
        final double startingWidth = 7.0;
        Rectangle r1;
        r1 = new Rectangle(startingLength, startingWidth);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        r1.scale(TRANSFORM);
        r1.display();
        final double newLength = 4.0;
        final double professorJonesIQ = 8.0;
        r1.setLength(newLength);
        r1.setWidth(professorJonesIQ);
    }
}
