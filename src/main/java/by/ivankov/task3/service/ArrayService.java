package by.ivankov.task3.service;

import by.ivankov.task3.entity.CustomArray;

public interface ArrayService {
    int[] replacement(CustomArray arr);

    int maxValue(CustomArray arr);

    int minValue(CustomArray arr);

    double averageValue(CustomArray arr);

    int sum(CustomArray arr);

    int searchPositive(CustomArray arr);

    int searchNegative(CustomArray arr);
}
