package hbcu.stay.ready.algorithms;

import java.util.Arrays;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     *
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input) {
        return counter(input);
    }


    /**
     * Example of overloading a function that accepts a Array of Integers
     *
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input) {
        return counter(input);
    }

    private Integer counter(Object[] input){
        Arrays.sort(input);
        Object currentValue = null;
        int duplicates = 0;
        for (int i = 0; i < input.length-1; i++) {
            if (input[i] == input[i + 1] && input[i] != currentValue) {
                duplicates ++;
                currentValue = input[i];
            }
        }
        return duplicates;
    }
}







