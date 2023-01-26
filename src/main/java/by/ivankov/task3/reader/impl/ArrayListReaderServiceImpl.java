package by.ivankov.task3.reader.impl;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.exception.CustomException;
import by.ivankov.task3.reader.ArrayListReaderService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ArrayListReaderServiceImpl implements ArrayListReaderService {
    static Logger logger = LogManager.getLogger();
    private static final String FILENAME = "data//defaultArray.txt";
    private static final String SEPARATOR = "\\s+";

    public List<CustomArray> arrayListReader(String fileName) throws CustomException {
        Path path = Path.of(fileName);
        if (!Files.exists(path)) {
            logger.log(Level.ERROR, "file" + fileName + " not exist");
            fileName = FILENAME;
        }
        List<CustomArray> arrays = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                String[] str = scanner.nextLine().split(SEPARATOR);
                int[] arr = new int[str.length];
                for (int i = 0; i < str.length; i++) {
                    try {
                        arr[i] = Integer.parseInt(str[i]);
                    } catch (NullPointerException e) {
                        throw new CustomException("Invalid data type!");
                    }
                }
                arrays.add(new CustomArray(arr));
            }
        } catch (FileNotFoundException e) {
            throw new CustomException("There is no such file or directory");
        } catch (IOException e) {
            throw new CustomException("Unknown Error(Exception)");
        }
        return arrays;
    }
}

