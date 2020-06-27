package com.krealll.day4_2.service;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class JaggedArrayService {

    public void bubbleSort(int[][] jaggedArray, BiPredicate<Integer,Integer> ascDescPredicate, Function<int[], Integer> sortFunction){
        if(jaggedArray==null||ascDescPredicate==null||sortFunction==null){
            return;
        }
        boolean contSort=true;
        int size = jaggedArray.length-1;
        while (contSort){
            int tempNum=0;
            contSort=false;
            for (int i = 0; i < size - tempNum; i++) {
                if(ascDescPredicate.test(sortFunction.apply(jaggedArray[i]),sortFunction.apply(jaggedArray[i+1]))){
                    swapLines(jaggedArray,i,i+1);
                    contSort=true;
                }
            }
        }
    }

    private void swapLines(int[][] jaggedArray, int i, int j) {
        if(jaggedArray[i]==null||jaggedArray[j]==null){
            return;
        }
        int[] tempLine = jaggedArray[i];
        jaggedArray[i]=jaggedArray[j];
        jaggedArray[j]=tempLine;
    }

    /* I decided not to emplace my sort example functions in enum,
     or some classes, that implements Function interface.
     Instead of that, i showed them below, as my main sorting function should use lambda expressions.

    private int calcSumOfArray(int[] array) throws DataException {
        if(array==null){
            throw new DataException("Wrong jagged array data");
        }

        int sum=0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    private int findMax(int[] array) throws DataException {
        if(array==null){
            throw new DataException("Wrong jagged array data");
        }

        int maxVal = Integer.MIN_VALUE,
                indexOfMax = 0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]>maxVal){
                maxVal=array[i];
                indexOfMax=i;
            }
        }
        return indexOfMax;
    }

    private int findMin(int[] array) throws DataException {
        if(array==null){
            throw new DataException("Wrong jagged array data");
        }

        int minVal = Integer.MAX_VALUE,
                indexOfMin = 0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]<minVal){
                minVal=array[i];
                indexOfMin=i;
            }
        }
        return indexOfMin;
    }

     */
}
