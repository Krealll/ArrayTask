package com.krealll.day4_1.validator;

import com.krealll.day4_1.entity.IntArray;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntArrayValidatorTest {

    IntArrayValidator intArrayValidator;
    @BeforeMethod
    public void setUp() {
        intArrayValidator = new IntArrayValidator();
    }

    @Test
    public void IsOkIntArrayPosTest() {
        int[] tempArray = new int[3];
        tempArray[0]=10;
        tempArray[1]=1;
        tempArray[2]=2;
        IntArray intArray = new IntArray(tempArray);
        assertTrue(intArrayValidator.isOkIntArray(intArray));
    }

    @Test
    public void IsOkIntArrayNegZeroTest() {
        int[] tempArray = new int[0];
        IntArray intArray = new IntArray(tempArray);
        assertFalse(intArrayValidator.isOkIntArray(intArray));
    }

    @Test
    public void IsOkIntArrayNegConstraintTest() {
        int[] tempArray = new int[3];
        tempArray[0]=-250;
        tempArray[1]=1;
        tempArray[2]=2;
        IntArray intArray = new IntArray(tempArray);
        assertFalse(intArrayValidator.isOkIntArray(intArray));
    }
}