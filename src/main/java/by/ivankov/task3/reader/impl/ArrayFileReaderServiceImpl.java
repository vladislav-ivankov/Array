package by.ivankov.task3.reader.impl;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.reader.ArrayFileReaderService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class ArrayFileReaderServiceImpl implements ArrayFileReaderService {
    static Logger logger = LogManager.getLogger();
    private static final String FILENAME = "data//defaultArray.txt";
    private static final String SEPARATOR = "\\s+";

    public CustomArray arrayReader(String fileName) {
        Path path = Path.of(fileName);
        if (!Files.exists(path)) {
            logger.log(Level.ERROR, "file" + fileName + " not exist");
            fileName = FILENAME;
        }
        CustomArray customArray = new CustomArray();
        int[] arr = {};
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String tmp;
            if ((tmp = reader.readLine()) != null) {
                String[] str = tmp.split(SEPARATOR);
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
        } catch (FileNotFoundException e) {
            logger.log(Level.ERROR, "There is no such file or directory");
        } catch (IOException e) {
            logger.log(Level.INFO, "Unknown Error(Exception)");
        }
        return customArray;
    }
}

