package by.ivankov.task3.service;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.exception.CustomException;

import java.util.Optional;

public interface SortingAlgorithmsService {
    Optional<int[]> bubbleSort(CustomArray arr) throws CustomArray, CustomException;

    Optional<int[]> selectionSort(CustomArray arr) throws CustomException;

    Optional<int[]> insertionSort(CustomArray arr) throws CustomException;
}
