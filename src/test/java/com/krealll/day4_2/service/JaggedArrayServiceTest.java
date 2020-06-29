package com.krealll.day4_2.service;

import com.krealll.day4_1.entity.IntArray;
import com.krealll.day4_1.exception.DataException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

import static org.testng.Assert.assertEquals;

public class JaggedArrayServiceTest {

    JaggedArrayService jaggedArrayService;
    
    @BeforeMethod
    public void setUp() {
        jaggedArrayService = new JaggedArrayService();
    }

    @Test
    public void BubbleSortLineSumAscTest() {
        int[][] actual ={{1,3,5},{2,4,6},{1,1},{2,4}};
        int[][] expected = {{1,1},{2,4},{1,3,5},{2,4,6}};
        jaggedArrayService.bubbleSort(actual,(a,b)->a>b,a->{
                  //TODO add lambda wrapper to handle exceptions(if a=null)
                    int sum=0;
                    for (int value : a) {
                        sum += value;
                    }
                    return sum;
                });
        assertEquals(actual,expected);
    }

    @Test
    public void BubbleSortLineSumDescTest() {
        int[][] actual ={{1,3,5},{2,4,6},{1,1},{2,4}};
        int[][] expected = {{2,4,6},{1,3,5},{2,4},{1,1}};
        jaggedArrayService.bubbleSort(actual,(a,b)->a<b,a->{
            int sum=0;
            for (int value : a) {
                sum += value;
            }
            return sum;
        });
        assertEquals(actual,expected);
    }

    @Test
    public void BubbleSortLineMaxAscTest() {
        int[][] actual ={{1,3,5},{2,4,6},{1,1},{2,4}};
        int[][] expected = {{1,1},{2,4},{1,3,5},{2,4,6}};
        jaggedArrayService.bubbleSort(actual,(a,b)->a>b,a->{
            int maxVal = Integer.MIN_VALUE,
                    indexOfMax = 0;
            for (int i = 0; i <a.length ; i++) {
                if(a[i]>maxVal){
                    maxVal=a[i];
                    indexOfMax=i;
                }
            }
            return maxVal;
        });
        assertEquals(actual,expected);
    }

    @Test
    public void BubbleSortLineMaxDescTest() {
        int[][] actual ={{1,3,5},{2,4,6},{1,1},{2,4}};
        int[][] expected = {{2,4,6},{1,3,5},{2,4},{1,1}};
        jaggedArrayService.bubbleSort(actual,(a,b)->a<b,a->{
            int maxVal = Integer.MIN_VALUE,
                    indexOfMax = 0;
            for (int i = 0; i <a.length ; i++) {
                if(a[i]>maxVal){
                    maxVal=a[i];
                    indexOfMax=i;
                }
            }
            return maxVal;
        });
        assertEquals(actual,expected);
    }

    @Test
    public void BubbleSortLineMinAscTest() {
        int[][] actual ={{1,3,5},{2,4,6},{1,1},{2,4}};
        int[][] expected = {{1,3,5},{1,1},{2,4,6},{2,4}};
        jaggedArrayService.bubbleSort(actual,(a,b)->a>b,a->{
            int minVal = Integer.MAX_VALUE,
                    indexOfMin = 0;
            for (int i = 0; i <a.length ; i++) {
                if(a[i]<minVal){
                    minVal=a[i];
                    indexOfMin=i;
                }
            }
            return minVal;
        });
        assertEquals(actual,expected);
    }

    @Test
    public void BubbleSortLineMinDescTest() {
        int[][] actual ={{1,3,5},{2,4,6},{1,1},{2,4}};
        int[][] expected = {{2,4,6},{2,4},{1,3,5},{1,1}};
        jaggedArrayService.bubbleSort(actual,(a,b)->a<b,a->{
            int minVal = Integer.MAX_VALUE,
                    indexOfMin = 0;
            for (int i = 0; i <a.length ; i++) {
                if(a[i]<minVal){
                    minVal=a[i];
                    indexOfMin=i;
                }
            }
            return minVal;
        });
        assertEquals(actual,expected);
    }
}