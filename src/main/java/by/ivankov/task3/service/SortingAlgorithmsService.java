package by.ivankov.task3.service;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.exception.CustomException;

public interface SortingAlgorithmsService {
    int[] bubbleSort(CustomArray arr) throws CustomException;

    int[] selectionSort(CustomArray arr) throws CustomException;

    int[] insertionSort(CustomArray arr) throws CustomException;
}
