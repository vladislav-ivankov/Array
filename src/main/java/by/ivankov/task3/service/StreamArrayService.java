package by.ivankov.task3.service;

import by.ivankov.task3.entity.CustomArray;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public interface StreamArrayService {
    OptionalInt streamMinValue(CustomArray array);
    OptionalInt streamMaxValue(CustomArray array);
    OptionalDouble streamAverageValue(CustomArray array);
    OptionalInt streamSum(CustomArray array);
    OptionalInt streamSearchPositive(CustomArray array);
    OptionalInt streamSearchNegative(CustomArray array);
}
