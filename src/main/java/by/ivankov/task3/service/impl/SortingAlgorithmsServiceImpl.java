package by.ivankov.task3.service.impl;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.exception.CustomException;
import by.ivankov.task3.service.SortingAlgorithmsService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;

public class SortingAlgorithmsServiceImpl implements SortingAlgorithmsService {
    Logger logger = LogManager.getLogger();

    @Override
    public Optional<int[]> bubbleSort(CustomArray arr) throws CustomException{
        if (arr == null){
            throw new CustomException("The array cannot be empty");
        }
        if (arr.getArray().length != 0) {
            for (int i = 0; i < arr.getArray().length - 1; i++) {
                for (int j = 0; j < arr.getArray().length - i - 1; j++) {
                    if (arr.getArray()[j + 1] < arr.getArray()[j]) {
                        int swap = arr.getArray()[j];
                        arr.getArray()[j] = arr.getArray()[j + 1];
                        arr.getArray()[j + 1] = swap;
                    }
                }
            }
        }else {
            logger.log(Level.INFO, "Array length = 0");
        }
        return Optional.ofNullable(arr.getArray());
    }

    @Override
    public Optional<int[]> selectionSort(CustomArray arr) throws CustomException{
        if (arr == null){
            throw new CustomException("The array cannot be empty");
        }
        if (arr.getArray().length != 0) {
            for (int i = 0; i < arr.getArray().length - 1; i++) {
                int minValue = i;
                for (int j = i + 1; j < arr.getArray().length; j++) {
                    if (arr.getArray()[j] < arr.getArray()[minValue]) {
                        minValue = j;
                    }
                }
                int swap = arr.getArray()[i];
                arr.getArray()[i] = arr.getArray()[minValue];
                arr.getArray()[minValue] = swap;
            }
        }else {
            logger.log(Level.INFO, "Array length = 0");
        }
        return Optional.ofNullable(arr.getArray());
    }

    @Override
    public Optional<int[]> insertionSort(CustomArray arr) throws CustomException {
        if (arr == null) {
            throw new CustomException("The array cannot be empty");
        }
        if (arr.getArray().length != 0) {
            for (int i = 0; i < arr.getArray().length; i++) {
                int currentValue = arr.getArray()[i];
                int j = i - 1;
                while (j >= 0 && arr.getArray()[j] > currentValue) {
                    arr.getArray()[j + 1] = arr.getArray()[j];
                    j--;
                }
                arr.getArray()[j + 1] = currentValue;
            }
        }else{
            logger.log(Level.INFO, "Array length = 0");
        }
        return Optional.ofNullable(arr.getArray());
    }

}