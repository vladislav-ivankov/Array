package by.ivankov.task3.file.impl;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.file.ArrayFileReaderService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;


public class ArrayFileReaderServiceImpl implements ArrayFileReaderService {
    static Logger logger = LogManager.getLogger();
    private static final String FILENAME = "data//arrayFile.txt";

    public CustomArray arrayReader(String fileName) {
        Path path = Path.of(fileName);
        if (!Files.exists(path)) {
            logger.log(Level.ERROR, "file" + fileName + " not exist");
            fileName = FILENAME;
        }
        CustomArray customArray = new CustomArray();
        int[] arr = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String tmp;
            if ((tmp = reader.readLine()) != null) {
                String[] str = tmp.split("\\s+");
                arr = new int[str.length];
                for (int i = 0; i < str.length; i++) {
                    try {
                        arr[i] = Integer.parseInt(str[i]);
                    } catch (NumberFormatException e) {
                        logger.log(Level.ERROR, "Invalid data type");
                    }
                }
            }
            customArray.setArray(arr);
        } catch (IOException e) {
            logger.log(Level.ERROR, e);
            arr = new int[]{0};
            customArray.setArray(arr);
        }
        return customArray;
    }
}

