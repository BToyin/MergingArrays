package com.sparta.toyin;



public class MergingArrays {

    public static int[] mergeArrays(int[] array1, int[] array2) {

        int [] mergedArray = new int[(array1.length+array2.length)];
        int mergedArrayIndex = 0;

        for (int i : array1) {
            mergedArray[mergedArrayIndex] = i;
            mergedArrayIndex++;
        }

        for (int i : array2) {
            mergedArray[mergedArrayIndex] = i;
            mergedArrayIndex++;
        }

        for (int i = 0; i < mergedArray.length - 1; i++) {
            for (int j = 0; j < mergedArray.length - 1 - i; j++) {
                if (mergedArray[j] > mergedArray[j + 1]) {
                    int tempNum1 = mergedArray[j];
                    mergedArray[j] = mergedArray[j + 1];
                    mergedArray[j + 1] = tempNum1;
                }
            }
        }
        return mergedArray;
    }

}
