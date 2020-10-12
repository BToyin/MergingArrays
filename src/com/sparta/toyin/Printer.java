package com.sparta.toyin;

import java.util.Arrays;

public class Printer {

    public static void printMergedArray(int[] array1, int[] array2, int[] sortedArray) {

        System.out.println("The original arrays were " + Arrays.toString(array1) + " and " + Arrays.toString(array2) + ". \nThe final sorted array is: " + Arrays.toString(sortedArray));
    }
}
