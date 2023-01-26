package by.ivankov.task3.service;

import by.ivankov.task3.entity.CustomArray;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public interface StreamArrayService {
    int[] streamReplacement(CustomArray array, int condition);
    OptionalInt streamMinValue(CustomArray array);
    OptionalInt streamMaxValue(CustomArray array);
    OptionalDouble streamAverageValue(CustomArray array);
    OptionalInt streamSum(CustomArray array);
    int[] streamSearchPosNeg(CustomArray array);
}
