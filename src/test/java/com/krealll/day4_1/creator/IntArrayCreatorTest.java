package com.krealll.day4_1.creator;

import com.krealll.day4_1.entity.IntArray;
import com.krealll.day4_1.exception.CustomParseException;
import com.krealll.day4_1.exception.DataException;
import com.krealll.day4_1.exception.FileException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntArrayCreatorTest {

    IntArrayCreator intArrayCreator;

    @BeforeMethod
    public void setUp() {
        intArrayCreator = new IntArrayCreator();
    }

    @Test
    public void CreateIntArrayFormConsolePosTest() {
        //TODO add console tests
    }

    @Test
    public void CreateIntArrayFromFilePosTest() throws DataException, FileException, CustomParseException {
        IntArray actualIntArray = intArrayCreator.createIntArrayFromFile("data"),
                expectedIntArray = new IntArray(new int[6]);
        expectedIntArray.setAt(1,0);
        expectedIntArray.setAt(2,1);
        expectedIntArray.setAt(3,2);
        expectedIntArray.setAt(4,3);
        expectedIntArray.setAt(5,4);
        expectedIntArray.setAt(6,5);
        assertEquals(actualIntArray,expectedIntArray);
    }

    @Test(expectedExceptions = FileException.class)
    public void CreateIntArrayFromFileNegTest() throws DataException, FileException, CustomParseException {
        intArrayCreator.createIntArrayFromFile("afvaswefas12");
    }

    @Test
    public void CreateRandIntArrayPosTest() throws DataException {
        int actualSize  = intArrayCreator.createRandIntArray(5).length(),
                expectedSize=5;
        assertEquals(actualSize,expectedSize);
    }

    @Test(expectedExceptions = DataException.class)
    public void CreateRandIntArrayNegTest() throws DataException {
        intArrayCreator.createRandIntArray(-2);
    }
}