package by.ivankov.task3.reader.impl;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.exception.CustomException;
import by.ivankov.task3.reader.ArrayReaderService;
import by.ivankov.task3.validator.impl.ArrayValidatorImpl;
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
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayReaderServiceImpl implements ArrayReaderService {
    static Logger logger = LogManager.getLogger();
    private ArrayValidatorImpl validator = new ArrayValidatorImpl();
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
            String strTemp;
            if ((strTemp = reader.readLine()) != null) {
                String[] str = strTemp.split(SEPARATOR);
                int[] arrTemp = new int[str.length];
                int counter = 0;
                for (int i = 0; i < str.length; i++) {
                    if (validator.arrayValidate(str[i])) {
                        arrTemp[counter] = Integer.parseInt(str[i]);
                        counter++;
                    }
                    arr = Arrays.copyOfRange(arrTemp, 0, counter);
                }
            }
        } catch (FileNotFoundException e) {
            logger.log(Level.ERROR, e);
        } catch (IOException e) {
            logger.log(Level.ERROR, e);
        }
        customArray.setArray(arr);
        return customArray;
    }

    @Override
    public List<CustomArray> arrayListReader(String fileName) throws CustomException {
        Path path = Path.of(fileName);
        if (!Files.exists(path)) {
            logger.log(Level.ERROR, "file" + fileName + " not exist");
            fileName = FILENAME;
        }
        List<CustomArray> arrays = new ArrayList<>();
        int[] arr;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                String[] str = scanner.nextLine().split(SEPARATOR);
                int[] arrTemp = new int[str.length];
                int counter = 0;
                for (int i = 0; i < str.length; i++) {
                    if (validator.arrayValidate(str[i])) {
                        arrTemp[counter] = Integer.parseInt(str[i]);
                        counter++;
                    }
                }
                arr = Arrays.copyOfRange(arrTemp, 0, counter);
                arrays.add(new CustomArray(arr));
            }
        } catch (FileNotFoundException e) {
            throw new CustomException("There is no such file or directory", e);
        } catch (IOException e) {
            throw new CustomException("Unknown Error(Exception)", e);
        }
        return arrays;
    }
}
