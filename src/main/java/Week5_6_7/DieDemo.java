public class DieDemo {
    public static void main(String[] args) {
        Die die1 = new Die(6);
        Die die2 = new Die(6);
        die1.roll();
        die2.roll();
        System.out.println("Die 1 rolled: " + die1.getLastRoll());
        System.out.println("Die 2 rolled: " + die2.getLastRoll());

    }
}
