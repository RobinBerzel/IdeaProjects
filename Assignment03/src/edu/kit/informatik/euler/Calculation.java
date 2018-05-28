package edu.kit.informatik.euler;

import edu.kit.informatik.Terminal;


public class Calculation {
    /**
     * Creates a new Calculation object.
     */
    public Calculation() {

    }

    /**
     * Returns a double of the calculated euler number which is calculated with the given number.
     *
     * @return A double of the calculated euler number.
     */


            private double fak(int n){
            if(n == 0) return 1;
            else return n*fak(n-1);
        }

        double euler(double end){
            double e = 0;
            for (int i = 0; i < 100; i++) {
                e = e + 1 / fak(i);
            }
            e = e - 0.01;
            e = Math.round(10000.0 * e) / 10000.0;

            return e;
        }







}
