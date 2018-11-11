package com.sparta.bz.sorters;

public class BinarySorter implements Sorter {

    @Override
    public int[] sortArray(int[] arrayToSort) {
        BinaryTree binarySortTree = new BinarySortTree(arrayToSort);
        return binarySortTree.getSortedTreeAsc();
    }
}
