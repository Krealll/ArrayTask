package com.krealll.day4_1.reader;

import com.krealll.day4_1.exception.DataException;
import com.krealll.day4_1.exception.FileException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomFileReaderTest {

    CustomFileReader customFileReader;

    @BeforeMethod
    public void setUp() {
        customFileReader = new CustomFileReader();
    }

    @Test
    public void ReadArrayPosTest() throws FileException, DataException {
        String  actualString  = customFileReader.readArray("data"),
                expectedString = "1 2 3 4 5 6";
        assertEquals(actualString, expectedString);
    }

    @Test(expectedExceptions = FileException.class)
    public void ReadArrayNegTest() throws FileException, DataException {
        customFileReader.readArray("datum");
    }
}