package com.sparta.bz;

import com.sparta.bz.sorters.BubbleSorter;
import com.sparta.bz.sorters.MergeSorter;
import com.sparta.bz.sorters.QuickSorter;
import com.sparta.bz.sorters.Sorter;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class PerformanceTester{

    private static int[] arrayToSort;
    private int[] unsortedArray;

    @BeforeClass
    public static void setupClass() {
        Random random = new Random();
        arrayToSort = new int[100_000];
        for (int i = 0; i < 100_000; i++) {
            arrayToSort[i] = random.nextInt( 100_000_000 );
        }
    }
    @Before
    public void setup(){
        unsortedArray = arrayToSort.clone();
    }

    @Test
    public void testBubbleSorter(){
        Sorter sorter = new BubbleSorter();
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        long end = System.nanoTime();
        printResults( sorter.toString(),end-start, sortedArray );
    }
    @Test
    public void testMergeSorter(){
        Sorter sorter = new MergeSorter();
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        long end = System.nanoTime();
        printResults( sorter.toString(),end-start, sortedArray );
    }
    @Test
    public void testQuickSorter(){
        Sorter sorter = new QuickSorter();
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        long end = System.nanoTime();
        printResults( sorter.toString(),end-start, sortedArray );
    }
    private void printResults(String sorter, long time, int[] sortedArray){
        DecimalFormat df = new DecimalFormat("###,###.####");
        System.out.println(sorter + ":");
        System.out.println( Arrays.toString(sortedArray));
        System.out.println("Time take " + (df.format(time)) + " nano seconds");
    }
}
