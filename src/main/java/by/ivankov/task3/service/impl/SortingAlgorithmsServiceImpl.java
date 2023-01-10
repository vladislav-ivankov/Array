package by.ivankov.task3.service.impl;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.service.SortingAlgorithmsService;

public class SortingAlgorithmsServiceImpl implements SortingAlgorithmsService {

    @Override
    public int[] bubbleSort(CustomArray arr) {
        for (int i = 0; i < arr.getArray().length - 1; i++) {
            for (int j = 0; j < arr.getArray().length - i - 1; j++) {
                if (arr.getArray()[j + 1] < arr.getArray()[j]) {
                    int swap = arr.getArray()[j];
                    arr.getArray()[j] = arr.getArray()[j + 1];
                    arr.getArray()[j + 1] = swap;
                }
            }
        }
        return arr.getArray();
    }

    @Override
    public int[] selectionSort(CustomArray arr) {
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
        return arr.getArray();
    }

    @Override
    public int[] insertionSort(CustomArray arr) {
        for (int i = 0; i < arr.getArray().length; i++) {
            int currentValue = arr.getArray()[i];
            int j = i - 1;
            while (j >= 0 && arr.getArray()[j] > currentValue) {
                arr.getArray()[j + 1] = arr.getArray()[j];
                j--;
            }
            arr.getArray()[j + 1] = currentValue;
        }
        return arr.getArray();
    }

}