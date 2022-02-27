package com.company;

import java.util.Arrays;

public class DescendingOrderImperative {

    public static int sortDesc(final int num) {

        String[] numberStringArray = Integer.toString(num).split("");

        int[] intArray = new int[numberStringArray.length];

        for (int i = 0; i < numberStringArray.length; i++) {
            intArray[i] = Integer.parseInt(numberStringArray[i]);
        }

        Arrays.sort(intArray);

        StringBuilder builder = new StringBuilder();

        for (int value :intArray) {
            builder.append(value);
        }
        builder.reverse();

        return Integer.parseInt(builder.toString());
    }
}
