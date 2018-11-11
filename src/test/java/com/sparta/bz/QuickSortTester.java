package com.sparta.bz;

import com.sparta.bz.sorters.QuickSorter;
import com.sparta.bz.sorters.Sorter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class QuickSortTester {

    private static int[] unsortedArray;
    private int[] sortedArray;
    private Sorter sorter = new QuickSorter();

    @BeforeClass
    public static void setClass(){
        unsortedArray = new int[]{3,1,4,2};
    }

    @Before
    public void setup(){
        sortedArray = sorter.sortArray(unsortedArray.clone());
        Random random = new Random();
        unsortedArray = new int[10];
        for (int i = 0; i < 10; i++){
            unsortedArray[i] = random.nextInt(100)+1;
        }
    }

    @Test
    public  void testSortedArray(){
        for(int i = 0; i < sortedArray.length - 1; i++) {
            Assert.assertTrue( sortedArray[i+1] >= sortedArray[i]);
        }
    }

    @Test
    public void testEmptyArray(){
        unsortedArray = new int[]{};
        for(int i = 0; i < sortedArray.length - 1; i++) {
            Assert.assertTrue( sortedArray[i+1] >= sortedArray[i]);
        }
    }

    @Test
    public void testNegativeArray(){
        unsortedArray = new int[]{-1,-4,5,-2};
        for(int i = 0; i < sortedArray.length - 1; i++) {
            Assert.assertTrue( sortedArray[i+1] >= sortedArray[i]);
        }
    }

    @Test
    public void  testArraySize(){
        assertEquals( sortedArray.length, 4 );
    }

    @Test
    public void testOddArray(){
        unsortedArray = new int[]{5,7,1,9,3};
        for(int i = 0; i < sortedArray.length - 1; i++) {
            Assert.assertTrue( sortedArray[i+1] >= sortedArray[i]);
        }
    }
    @Test
    public void testEvenArray(){
        unsortedArray = new int[]{2,8,4,6};
        for(int i = 0; i < sortedArray.length - 1; i++) {
            Assert.assertTrue( sortedArray[i+1] >= sortedArray[i]);
        }
    }

    @Test
    public void testSameNumberArray(){
        unsortedArray = new int[]{1,1,1,1};
        for(int i = 0; i < sortedArray.length - 1; i++) {
            Assert.assertTrue( sortedArray[i+1] >= sortedArray[i]);
        }
    }

    @Test
    public void testDuplicateArray(){
        unsortedArray = new int[]{1,1,4,4,2,2};
        for(int i = 0; i < sortedArray.length - 1; i++) {
            Assert.assertTrue( sortedArray[i+1] >= sortedArray[i]);
        }
    }

    @Test
    public void testAlreadySortedArray(){
        unsortedArray = new int[]{1,3,6,8};
        for(int i = 0; i < sortedArray.length - 1; i++) {
            Assert.assertTrue( sortedArray[i+1] >= sortedArray[i]);
        }
    }

    @Test
    public void testZeroArray(){
        unsortedArray = new int[]{0,0,0,0};
        for(int i = 0; i < sortedArray.length - 1; i++) {
            Assert.assertTrue( sortedArray[i+1] >= sortedArray[i]);
        }
    }
}

