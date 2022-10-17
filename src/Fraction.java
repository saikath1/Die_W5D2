public class Fraction {
    private int numerator;
    private int denominator;
    private double decimal;

    public Fraction(int n) {
        this(n, 1);
    }

    public Fraction(int n, int d) {
        this.numerator = n;
        this.denominator = d;
        this.decimal = (double) this.numerator / this.denominator;
    }
    public void printIt()
    {
        System.out.println(this.numerator + " / " + this.denominator + " = " + this.decimal);
    } // end printIt
} // end Fraction class




