/*********************************************************
 * StudentDriver.java
 * John Dean
 *
 * This class acts as a driver for the Student class.
 *********************************************************/

public class StudentDriver
{
    public static void main(String[] args)
    {
        Student s1;  // first student
        Student s2;  // second student

        s1 = new Student();
        s1.setFirst("CJ");
        s1.setLast("Niday");
        s2 = new Student("Hillary", "Protzman");
        s2.printFullName();
    } // end main
} // end class StudentDriver