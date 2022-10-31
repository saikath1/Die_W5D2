package Week5_6_7;

public class BaseballPlayer {
    private int hits;
    private String team;
    private boolean isSuspended;

    public BaseballPlayer(int hits, String team){
        this.hits = hits;
        this.team = team;
        this.isSuspended = isSuspended;
    }
    public int getHits(){
        return this.hits;
    }
    public String getTeam(){
        return this.team;
    }
    public boolean isSuspended(){
        return this.isSuspended;
    }
    public void printPlayer(){
        System.out.println("Num Hits:   " + this.hits);
        System.out.println("Team name:  " + this.team );
        System.out.println("Suspended?: " + isSuspended);
    }
}