package com.krealll.day4_1.reader;

import com.krealll.day4_1.exception.DataException;
import com.krealll.day4_1.exception.FileException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CustomFileReader {

    public String readArray(String filePath) throws FileException, DataException {
        Path path = Paths.get(filePath);
        if(Files.notExists(path)){
            throw new FileException("File doesn't exist");
        }
        try {
            String data = Files.readAllLines(path).get(0);
            return data;
        } catch (IOException e) {
            throw new DataException("Incorrect file data");
        }
    }

}
