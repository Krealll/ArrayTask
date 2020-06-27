package com.krealll.day4_1.console;

import com.krealll.day4_1.exception.DataException;

import java.util.Scanner;

public class ConsoleManager {

    public void printToConsole(String string) {
        System.out.printf(string);
    }

    public void printToConsole(int val) {
        System.out.println(val);
    }

    public int nextInt(){
        Scanner scanner = new Scanner(System.in);
        printToConsole("Enter integer number");
        return scanner.nextInt();
    }

    public int[] scanIntArray() throws DataException {
        Scanner scanner = new Scanner(System.in);
        printToConsole("Enter the size of array");
        int size = scanner.nextInt();
        if(size<1){
            throw new DataException("It's forbidden to create array of 0 elements");
        }
        int[] numberArray = new int[size];
        printToConsole("Enter elements of array");
        for (int i = 0; i < size; i++) {
            numberArray[i]= nextInt();
        }
        return numberArray;
    }
}
