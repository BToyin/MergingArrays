package com.sparta.toyin;

public class Starter {

    public static void startMergingArrays() {

        int[] array1 = {4,5,6,2,6};
        int[] array2 = {7,43,6,3,2,7};
        int[] sortedArray = MergingArrays.mergeArrays(array1, array2);
        Printer.printMergedArray(array1,array2,sortedArray);

    }
}
