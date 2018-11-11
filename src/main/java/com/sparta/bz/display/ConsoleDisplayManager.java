package com.sparta.bz.display;

import java.util.Arrays;

public class ConsoleDisplayManager implements DisplayManager{

    public void displayUnsortedArray (int[] unsortedArray){
        System.out.println("Unsorted Array: ");
        System.out.println(Arrays.toString( unsortedArray ));
    }

    public void displaySortedArray(int[] sortedArray, String sortType){
        System.out.println("Sorted using " +  sortType);
        System.out.println( Arrays.toString(sortedArray));
    }

    public void displayExceptionMessage(String message){
        System.out.println("The following method has occured: " + message);
    }
}

