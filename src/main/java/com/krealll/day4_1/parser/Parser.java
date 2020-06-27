package com.krealll.day4_1.parser;

import com.krealll.day4_1.exception.CustomParseException;

import java.util.ArrayList;
import java.util.Collections;

public class Parser {

    private static final String INT_ARRAY_SPLIT_REG_EX = " ";

    public int toIntValue(String value) throws CustomParseException {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new CustomParseException("String to int error");
        }
    }

    public int[] toIntArray(String intArrayString) throws CustomParseException {
        try {
            ArrayList<String> tokenArray = new ArrayList<>();
            Collections.addAll(tokenArray,intArrayString.split(INT_ARRAY_SPLIT_REG_EX));
            int[] result = new int[tokenArray.size()];
            for (int i = 0; i <result.length ; i++) {
                result[i]=Integer.parseInt(tokenArray.get(i));
            }
            return result;
        } catch (NumberFormatException e) {
            throw new CustomParseException("String to int Array error");
        }
    }
}
