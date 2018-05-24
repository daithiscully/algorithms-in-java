package com.scully.algorithm.euclid;

/**
 * Euclid Algorithm<BR>
 * it calculates the GCD - greatest common divisor between two numbers, A + B
 */
public class Euclid {

    /**
     * Implementation using recursion<BR>
     * 22/6 = 3 remainder 4
     * 6/4 = 1 remainder 2
     * 4/2 = 2 remainder 0
     *
     * @param number
     * @param divisor
     * @return
     */
    public int gcd(int number, int divisor) {
        int remaining = (number % divisor);

        if (remaining != 0) {
            return gcd(divisor, remaining);
        } else {
            return divisor;
        }
    }

    /**
     * Implementation without recursion<BR>
     * 22/6 = 3 remainder 4
     * 6/4 = 1 remainder 2
     * 4/2 = 2 remainder 0
     * number / (divisor and temp) = result remainder of divisor
     *
     * @param number
     * @param divisor
     * @return
     */
    public int gcd2(int number, int divisor) {
        while (divisor != 0) {
            int temp = divisor;
            divisor = (number % divisor);
            number = temp;
        }
        return number;
    }
}
