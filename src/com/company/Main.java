package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {1, 3, 4, 55677, 8, -987};
        int min = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (min > intArray[i])
                min = intArray[i];
        }
        System.out.println("Minimum variable is: " + min);

        int max = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (max < intArray[i])
                max = intArray[i];
        }
        System.out.println("Maximum variable is: " + max);


    }
}

