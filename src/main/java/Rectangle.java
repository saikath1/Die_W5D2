/*
 * Course: CS-1011-01
 * Name: Sean Jones
 * Assignment: Rectangle Demo
 * Created By: 10-12-2022
 */
package week6;

public class Rectangle {
    private double length;
    private double width;

    /**
     *
     * @param length
     * @param width
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return this.length * this.width;
    }

    /**
     *
     * @return
     */
    public double perimeter() {
        return 2 * this.length + 2 * this.width;
    }


    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void scale(double transformBy) {
        this.length *= transformBy;
        this.width *= transformBy;
    }

    public void display() {
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}
