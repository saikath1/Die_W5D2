package Week5_6_7;

public class Circle {
    // encapsulation
    private String name;
    private int radius; // instance variable - always private

    // Constructor
    // Difference between methods and Constructors
    // 1. No return type on Constructor
    // 2. Constructor MUST be the name of the class
    //
    // Constructor is the ONLY PLACE to assign values to instance vars.
    public Circle(int radius) {
        if(radius <= 0) {
            this.radius = 1;
        } else {
            this.radius = radius;
        }
        this.name = "Circle";
    }

    // second constructor with different header
    public Circle(int radius, String name) { // parameters are local variables to the method
        if(radius <= 0) {
            this.radius = 1;
        } else {
            this.radius = radius;
        }
        this.name = name;
    }

    // instance methods
    // getter, accessor method
    public int getRadius() {
        return this.radius;
    }

    public String getName() {
        return this.name;
    }

    // setter, mutator
    public void setRadius(int r) {
        this.radius = r;
    }
}
