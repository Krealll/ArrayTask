package com.krealll.day4_1.entity;

import java.util.Arrays;
import java.util.OptionalInt;

public class IntArray {
    private final int[] numberArray;

    public IntArray(int size){
        numberArray=new int[size];
    }

    public IntArray(int[] intArray) {
        this.numberArray = intArray;
    }

    public OptionalInt getAt(int index){
        if(isCorrectIndex(index)){
            return OptionalInt.of(numberArray[index]);
        }
        return OptionalInt.empty();
    }
    
    public boolean setAt(int number,int index){
        boolean result = false;
        if(isCorrectIndex(index)){
            numberArray[index]=number;
            result=true;
        }
        return result;
    }

    public int length(){
        return numberArray.length;
    }

    private boolean isCorrectIndex(int index){
        return index>=0&&index<=numberArray.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntArray intArray = (IntArray) o;
        return equalsToIntArray(intArray.numberArray);
    }

    private boolean equalsToIntArray(int[] intArray) {
        if(numberArray==null){
            if(intArray!=null){
                return false;
            }
        } else {
            if(intArray==null){
                return false;
            }
            if(intArray.length!=this.numberArray.length){
                return false;
            }
            for (int i = 0; i <intArray.length ; i++) {
                if(intArray[i]!=this.numberArray[i]){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result =17;
        for (int value : numberArray) {
            result = 31 * result + value;
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("Int Array:{");
        int i=0;
        for (; i <numberArray.length-1 ; i++) {
            string.append(numberArray[i]);
            string.append(", ");
        }
        string.append(numberArray[i]);
        string.append("}");
        return string.toString();
    }
}
