package com.krealll.day4_1.creator;

import com.krealll.day4_1.console.ConsoleManager;
import com.krealll.day4_1.entity.IntArray;
import com.krealll.day4_1.exception.DataException;
import com.krealll.day4_1.exception.FileException;
import com.krealll.day4_1.exception.CustomParseException;
import com.krealll.day4_1.parser.Parser;
import com.krealll.day4_1.reader.CustomFileReader;

import java.util.Random;

public class IntArrayCreator {
    private static final int RANDOM_MIN = -100;
    private static final int RANDOM_MAX = 100;

    private IntArray makeIntArray(int[] numberArray){
        return new IntArray(numberArray);
    }

    public IntArray createIntArrayFormConsole() throws DataException {
        ConsoleManager consoleManager = new ConsoleManager();
        int[] numberArray = consoleManager.scanIntArray();
        return makeIntArray(numberArray);
    }

    public IntArray createIntArrayFromFile(String file) throws DataException, FileException, CustomParseException {
        CustomFileReader customFileReader = new CustomFileReader();
        Parser parser = new Parser();
        String data = customFileReader.readArray(file);
        int[] numberArray = parser.toIntArray(data);
        return makeIntArray(numberArray);
    }

    public IntArray createRandIntArray(int size) throws DataException {
        if (size < 1) {
            throw new DataException();
        }
        Random random = new Random();
        int[] numberArray = new int[size];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = RANDOM_MIN + random.nextInt(RANDOM_MAX - RANDOM_MIN + 1);
        }
        return makeIntArray(numberArray);
    }
}
