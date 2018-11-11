package com.sparta.bz.sorters;

public class QuickSorter implements Sorter {
    private int[] array;

    @Override
    public int[] sortArray (int[] arrayToSort){
        int[] unsortedArray = arrayToSort.clone();
        if (unsortedArray == null || unsortedArray.length == 0){
            return new int[0];
        }
        this.array = unsortedArray;
        quickSort(0 , unsortedArray.length - 1);
        return array;
    }

    private void quickSort(int left, int right){
        int i = left, j = right;
        int pivot = array[(left+right)/2];

        while (i <= j) {
            while (array[i] < pivot) i++;
            while (array[j] > pivot) j--;
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (left < j)
            quickSort(left, j);
        if (i < right)
            quickSort(i, right);
    }
    private void swap(int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    @Override
    public String toString(){
        return "Quick Sort";
    }
}
