package com.krealll.day4_1.service;

import com.krealll.day4_1.entity.IntArray;

import java.util.function.BiPredicate;

public class SortService {

    public void quickSort(IntArray intArray){
        if(intArray==null){
            return;
        }
        int low = 0, high=intArray.length();
        quickSortHelper(intArray,low,high);
    }

    private void quickSortHelper(IntArray intArray, int low, int high){
        if(intArray.length()==0){
            return;
        }
        if(low>=high){
            return;
        }
        int middle = low +(high-low)/2,
                pivot = intArray.getAt(middle).getAsInt(),
                i=low,j=high;
        while (i<=j){
            while (intArray.getAt(i).getAsInt()<pivot){
                i++;
            }
            while (intArray.getAt(j).getAsInt()>pivot){
                j--;
            }
            if(i<=j){
                int temp = intArray.getAt(i).getAsInt();
                intArray.setAt(intArray.getAt(j).getAsInt(),i);
                intArray.setAt(temp,j);
                i++;
                j++;
            }
        }
        if(low<j){
            quickSortHelper(intArray,low,j);
        }
        if(high>i){
            quickSortHelper(intArray,i,high);
        }
    }

    public void bubbleSort(IntArray intArray, BiPredicate<Integer,Integer> biPredicate){
        if(intArray==null||biPredicate==null){
            return;
        }
        int size = intArray.length()-1;
        for (int i = 0; i <size; i++) {
            for (int j = 0; j <size-i ; j++) {
                if(biPredicate.test(intArray.getAt(j).getAsInt(),
                        intArray.getAt(j+1).getAsInt())){
                    int temp = intArray.getAt(j).getAsInt();
                    intArray.setAt(intArray.getAt(j+1).getAsInt(),j);
                    intArray.setAt(temp,j+1);
                }
            }
        }
    }

    public void insertionSort(IntArray intArray, BiPredicate<Integer,Integer> biPredicate){
        if(intArray==null||biPredicate==null){
            return;
        }
        for (int i = 0; i <intArray.length() ; i++) {
            int key = intArray.getAt(i).getAsInt();
            int j=i-1;
            while(j>=0&&biPredicate.test(key,intArray.getAt(j).getAsInt())){
                intArray.setAt(intArray.getAt(j).getAsInt(),j+1);
                j--;
            }
            intArray.setAt(key,j+1);
        }
    }
}
