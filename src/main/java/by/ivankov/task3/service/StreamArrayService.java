package by.ivankov.task3.service;

import by.ivankov.task3.entity.CustomArray;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public interface StreamArrayService {
    OptionalInt streamMinValue(CustomArray array);
    OptionalInt streamMaxValue(CustomArray array);
    OptionalDouble streamAverageValue(CustomArray array);
    int streamSum(CustomArray array);
    int streamSearchPositive(CustomArray array);
    int streamSearchNegative(CustomArray array);
}
