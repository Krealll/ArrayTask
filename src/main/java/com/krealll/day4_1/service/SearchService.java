package com.krealll.day4_1.service;

import com.krealll.day4_1.entity.IntArray;

import java.util.ArrayList;
import java.util.List;

public class SearchService {

    private final int MIN_TREE_DIGIT_NUMBER=100,
            MAX_TREE_DIGIT_NUMBER=999,
            TWO_DIGIT_VAL=10,
            THREE_DIGIT_VAL=100;

    public int binarySearch(IntArray sortedIntArray,int key){
        if(sortedIntArray==null){
            return -1;
        }
        int low = 0, high=sortedIntArray.length();
        return binarySearchHelper(sortedIntArray,key,low,high);
    }

    private int binarySearchHelper(IntArray sortedIntArray,int key, int low, int high) {
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2,
            midValue = sortedIntArray.getAt(mid).getAsInt();
            if (midValue < key) {
                low = mid + 1;
            } else if (midValue > key) {
                high = mid - 1;
            } else {
                index = mid;
                break;
            }
        }
        return index;
    }

    public int findMax(IntArray intArray){
        if(intArray==null||intArray.length()==0){
            return -1;
        }
        int maxValue=Integer.MIN_VALUE,
            indexOfMax = -1,temp;
        for (int i = 0; i <intArray.length() ; i++) {
            temp=intArray.getAt(i).getAsInt();
            if(temp>maxValue){
                maxValue=temp;
                indexOfMax=i;
            }
        }
        return indexOfMax;
    }

    public int findMin(IntArray intArray){
        if(intArray==null||intArray.length()==0){
            return -1;
        }
        int minValue=Integer.MAX_VALUE,
                indexOfMin = -1,temp;
        for (int i = 0; i <intArray.length() ; i++) {
            temp=intArray.getAt(i).getAsInt();
            if(temp<minValue){
                minValue=temp;
                indexOfMin=i;
            }
        }
        return indexOfMin;
    }

    public List<Integer> findPrime(IntArray intArray){
        List<Integer> primeList = new ArrayList<>();
        if(intArray==null||intArray.length()==0){
            return primeList;
        }
        int i = 0, temp;
        for (; i <intArray.length() ; i++) {
            temp=intArray.getAt(i).getAsInt();
            if(isPrime(temp)){
                primeList.add(temp);
            }
        }
        return primeList;
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> findFibonacci(IntArray intArray){
        List<Integer> fibList = new ArrayList<>();
        if(intArray==null||intArray.length()==0){
            return fibList;
        }
        int i = 0, temp;
        for (; i <intArray.length() ; i++) {
            temp=intArray.getAt(i).getAsInt();
            if(isFibonacci(temp)){
                fibList.add(temp);
            }
        }
        return fibList;
    }

    private boolean isFibonacci(int number) {
        if (number < 1) {
            return false;
        }
        int first = 1, second = 1, temp;
        boolean result = false;
        for (int i = 1; i <= number; i++) {
            if (number == first || number == second) {
                result = true;
            }
            temp = first;
            first = second;
            second = temp + second;
        }
        return result;
    }

    /* Special - 3 digit number without repeating digits*/
    public List<Integer> findSpecialNumbers(IntArray intArray){
        List<Integer> specialList = new ArrayList<>();
        if(intArray==null||intArray.length()==0){
            return specialList;
        }
        int i = 0, temp;
        for (; i <intArray.length() ; i++) {
            temp=intArray.getAt(i).getAsInt();
            if(isSpecial(temp)){
                specialList.add(temp);
            }
        }
        return specialList;
    }

    private boolean isSpecial(int number){
        if(!isThreeDigit(number)){
            return false;
        }
        return isNoRepeatDigits(number);
    }

    private boolean isThreeDigit(int number){
        boolean result = false;
        number= Math.abs(number);
        if(number>=MIN_TREE_DIGIT_NUMBER&&number<=MAX_TREE_DIGIT_NUMBER){
            result=true;
        }
        return result;
    }

    private boolean isNoRepeatDigits(int number) {
        int first = number/THREE_DIGIT_VAL,
                middle=number%THREE_DIGIT_VAL/TWO_DIGIT_VAL,
                last=number%TWO_DIGIT_VAL;
        return first!=middle&&first!=last&&middle!=last;
    }
}
