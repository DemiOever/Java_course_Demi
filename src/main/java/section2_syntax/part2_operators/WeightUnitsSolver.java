/*
 * Copyright (c) 2015 Michiel Noback [michiel.noback@gmail.com].
 * All rights reserved.
 */

package section2_syntax.part2_operators;

public class WeightUnitsSolver {

    /**
     * Returns the number of Pounds, Ounces and Grams represented by this quantity of grams,
     * encapsulated in a BritishWeightUnits object.
     * @param grams the grams quantity
     * @return a BritishWeightUnits instance
     * @throws IllegalArgumentException when the Grams quantity is 
     */
    public BritishWeightUnits convertFromGrams(int grams) {
        if (grams <= 0) {
            throw new IllegalArgumentException("Error: grams should be above 0. Given: grams=" + grams);
        }

        final int gramsPerPound = 453;
        final int gramsPerOunce = 28;

        int pounds = grams / gramsPerPound;
        double remainderGramsAfterPounds = grams % gramsPerPound;

        int ounces = (int) (remainderGramsAfterPounds / gramsPerOunce);
        double finalGrams = remainderGramsAfterPounds % gramsPerOunce;

        return new BritishWeightUnits(pounds, ounces, (int) finalGrams);
        //solve the pounds, ounces and grams, create and return a BritishWeightUnits instance
        //YOUR CODE HERE
//        Ik krijg de 2e unit test helaas niet werkend (begrijp de opdracht niet voldoende)
//        throw new UnsupportedOperationException("Not implemented yet");
    }
}
