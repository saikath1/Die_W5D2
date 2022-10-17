public class Ghost  {
    public final String NAME; // ghost's name
    private int lastSeen;     // year of most recent sighting

    public Ghost(String name, int lastSeen)
    {
        this.NAME = name;
        this.lastSeen = lastSeen;
    }

    public void display()
    {
        System.out.println(
                this.NAME + ", most recent sighting " +
                        this.lastSeen + ".");
    }
} // end class Ghost
