package com.krealll.day4_1.validator;

import com.krealll.day4_1.entity.IntArray;

public class IntArrayValidator {

    private final int ARTIFICIAL_CONSTRAINT=-199;

    public boolean isOkIntArray(IntArray intArray){
        if(intArray.length()==0){
            return false;
        }
        for (int i = 0; i <intArray.length() ; i++) { //no need in isPresent as array has elements
            if(intArray.getAt(i).getAsInt()<ARTIFICIAL_CONSTRAINT){
                return false;
            }
        }
        return true;
    }

}
