public class Human
{
    private static final double NORMAL_TEMP = 98.6;
    private double  currentTemp;

    public boolean isHealthy (double currentTemp)
        {
            return Math.abs(this.currentTemp- Human.NORMAL_TEMP) < 1;
        } // end isHealthy

        public void diagnose (double currentTemp)
        {
            if ((this.currentTemp- Human.NORMAL_TEMP) >5)
            {
                System.out.println("Apply an ice pack to your forehead" + " and go to the emergency room now!");


            } // end class Human
        }
    }
