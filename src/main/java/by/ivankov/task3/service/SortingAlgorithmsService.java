package by.ivankov.task3.service;

import by.ivankov.task3.entity.CustomArray;

public interface SortingAlgorithmsService {
    int[] bubbleSort(CustomArray arr);

    int[] selectionSort(CustomArray arr);

    int[] insertionSort(CustomArray arr);
}
