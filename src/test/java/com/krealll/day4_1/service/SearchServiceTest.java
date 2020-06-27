package com.krealll.day4_1.service;

import com.krealll.day4_1.entity.IntArray;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class SearchServiceTest {

    SearchService searchService;

    @BeforeMethod
    public void setUp() {
        searchService = new SearchService();
    }

    @Test
    public void BinarySearchPosTest() {
        int[] tempArray = new int[4];
        tempArray[0]=1;
        tempArray[1]=12;
        tempArray[2]=6;
        tempArray[3]=119;
        IntArray intArray = new IntArray(tempArray);
        int actual = searchService.binarySearch(intArray,119),
            expected = 3;
        assertEquals(actual,expected);
    }

    @Test
    public void BinarySearchNegTest() {
        int[] tempArray = new int[4];
        tempArray[0]=1;
        tempArray[1]=12;
        tempArray[2]=6;
        tempArray[3]=119;
        IntArray intArray = new IntArray(tempArray);
        int actual = searchService.binarySearch(intArray,100),
                expected= -1;
        assertEquals(actual,expected);
    }

    @Test
    public void FindMaxPosTest() {
        int[] tempArray = new int[4];
        tempArray[0]=1;
        tempArray[1]=123;
        tempArray[2]=62;
        tempArray[3]=19;
        IntArray intArray = new IntArray(tempArray);
        int actual = searchService.findMax(intArray),
            expected = 1;
        assertEquals(actual,expected);
    }

    @Test
    public void FindMaxNegTest() {
        IntArray intArray = null;
        int actual = searchService.findMax(intArray),
            expected = -1;
        assertEquals(actual,expected);
    }

    @Test
    public void FindMin() {
        int[] tempArray = new int[4];
        tempArray[0]=-21;
        tempArray[1]=22;
        tempArray[2]=1;
        tempArray[3]=-2;
        IntArray intArray = new IntArray(tempArray);
        int actual = searchService.findMin(intArray),
            expected = 0;
        assertEquals(actual,expected);
    }

    @Test
    public void FindMinNegTest() {
        IntArray intArray = new IntArray(new int[0]);
        int actual = searchService.findMin(intArray),
            expected = -1;
        assertEquals(actual,expected);
    }

    @Test
    public void FindPrimePosTest() {
        int[] tempArray = new int[5];
        tempArray[0]=1;
        tempArray[1]=2;
        tempArray[2]=3;
        tempArray[3]=5;
        IntArray intArray = new IntArray(tempArray);
        List<Integer> expected = new ArrayList<>(),
        actual = searchService.findPrime(intArray);
        expected.add(2);
        expected.add(3);
        expected.add(5);
        assertEquals(actual,expected);
    }

    @Test
    public void FindFibonacci() {
        int[] tempArray = new int[4];
        tempArray[0]=1;
        tempArray[1]=1;
        tempArray[2]=2;
        tempArray[3]=7;
        IntArray intArray = new IntArray(tempArray);
        List<Integer> expected = new ArrayList<>(),
                actual = searchService.findFibonacci(intArray);
        expected.add(1);
        expected.add(1);
        expected.add(2);
        assertEquals(actual,expected);
    }

    @Test
    public void FindSpecialNumbers() {
        int[] tempArray = new int[4];
        tempArray[0]=123;
        tempArray[1]=562;
        tempArray[2]=761;
        tempArray[3]=878;
        IntArray intArray = new IntArray(tempArray);
        List<Integer> expected = new ArrayList<>(),
                actual = searchService.findSpecialNumbers(intArray);
        expected.add(123);
        expected.add(562);
        expected.add(761);
        assertEquals(actual,expected);
    }
}