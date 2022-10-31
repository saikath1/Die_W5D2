package week9;

public class Bear
{
    private final String MAKER; // bear's manufacturer
    private final String TYPE;  // type of bear

    //**********************************************************

    public Bear(String maker, String type)
    {
        MAKER = maker;
        TYPE = type;
    }

    public void display()
    {
        System.out.println(MAKER + " " + TYPE);
    }
} // end Bear class