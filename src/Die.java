public class Die {
    /**
     * Implements a die. Die can be rolled
     * to randomly generate new integer values
     * between 1 and the number of sides.
     */
        private int lastRoll;
        private int numSides;

        /**
         * Creates a die with the specified number of sides
         * @param numSides
         */
        public Die(int numSides) {
            this.numSides = numSides;

            // first roll
            roll();
        }
        /**
         * Roll the die (generate a new random number)
         */
        public void roll() {
            lastRoll = (int) (numSides * Math.random() + 1);
        }

        /**
         * Returns the result of the last roll
         * @return value between 1 and numSides
         */
        public int getLastRoll() {
            return lastRoll;
        }
        /**
         * Returns the number of sides
         * @return number of sides
         */
        public int getNumSides() {
            return numSides;
        }


    }


