package by.ivankov.task3.service;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.exception.CustomException;

public interface SortingAlgorithmsService {
    void bubbleSort(CustomArray arr) throws CustomException;

    void selectionSort(CustomArray arr) throws CustomException;

    void insertionSort(CustomArray arr) throws CustomException;
}
