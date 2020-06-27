package com.krealll.day4_1.parser;

import com.krealll.day4_1.entity.IntArray;
import com.krealll.day4_1.exception.CustomParseException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ParserTest {

    Parser parser;

    @BeforeMethod
    public void setUp() {
        parser = new Parser();
    }

    @Test
    public void toIntValuePosTest() {
        try {
            String testString = "12";
            int actual = parser.toIntValue(testString),
                    expected = 12;
            assertEquals(actual,expected);
        }catch (CustomParseException e){
            fail();
        }
    }

    @Test(expectedExceptions = CustomParseException.class)
    public void toIntValueNegTest() throws CustomParseException {
        String testString = "ytrewq";
        parser.toIntValue(testString);
    }

    @Test
    public void ToIntArrayPosTest() {
        try {
            String testString = "10 11 12 31 11";
            int[] actual = parser.toIntArray(testString),
                    expected = new int[5];
            expected[0]=10;
            expected[1]=11;
            expected[2]=12;
            expected[3]=31;
            expected[4]=11;
            assertEquals(actual,expected);
        }catch (CustomParseException e){
            fail();
        }
    }

    @Test(expectedExceptions = CustomParseException.class)
    public void ToIntArrayNegTest() throws CustomParseException{
        String testString = "1 e 2";
        parser.toIntArray(testString);
    }
}