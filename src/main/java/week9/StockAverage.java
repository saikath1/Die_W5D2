package week9;

    import java.util.Scanner;
import java.util.ArrayList;

    public class StockAverage {
        public static void main(String[] args) {
            Scanner stdIn = new Scanner(System.in);
            ArrayList<Double> stocks = new ArrayList<>();
            double stock;                       // a stock value
            double stockSum = 0;                // sum of stock values

            System.out.print("Enter a stock value (-1 to quit): ");
            stock = stdIn.nextDouble();

            while (stock >= 0) {
                stocks.add(stock);
                System.out.print("Enter a stock value (-1 to quit): ");
                stock = stdIn.nextDouble();
            } // end while
            for (int i=0; i<stocks.size(); i++)
            {
                stock = stocks.get(i);
                stockSum += stock;
            }

            if (stocks.size() != 0)
            {
                System.out.printf("\nAverage stock value = $%.2f\n", stockSum / stocks.size());
            }
        } // end main
    } // end class StockAverage

