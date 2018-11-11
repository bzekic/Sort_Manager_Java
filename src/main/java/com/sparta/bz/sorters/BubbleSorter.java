package com.sparta.bz.sorters;

public class BubbleSorter implements Sorter {

    public int[] sortArray(int[] arrayToSort) {
        int[] unsortedArray = arrayToSort.clone();
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < unsortedArray.length - 1; i++) {
                if (unsortedArray[i] > unsortedArray[i + 1]) {
                    int swaps = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i + 1];
                    unsortedArray[i + 1] = swaps;
                    swapped = true;
                }
            }
        } while (swapped);
        return unsortedArray;
    }
    @Override
    public String toString(){
        return "Bubble Sorter";
    }
}

