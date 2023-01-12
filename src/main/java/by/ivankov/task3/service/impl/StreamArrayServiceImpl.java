package by.ivankov.task3.service.impl;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.service.StreamArrayService;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamArrayServiceImpl implements StreamArrayService {
    int[] arr = {-1, 12, 6, 14, -7};
    @Override
    public OptionalInt streamMinValue(CustomArray array) {
        return Arrays.stream(array.getArray()).min();
    }

    @Override
    public OptionalInt streamMaxValue(CustomArray array) {
        return Arrays.stream(array.getArray()).max();
    }

    @Override
    public OptionalDouble streamAverageValue(CustomArray array) {
        return Arrays.stream(array.getArray()).average();
    }

    @Override
    public int streamSum(CustomArray array) {
        return Arrays.stream(array.getArray()).sum();
    }

    @Override
    public int streamSearchPositive(CustomArray array) {
        return (int) Arrays.stream(array.getArray()).filter(i -> i > 0).count();
    }

    @Override
    public int streamSearchNegative(CustomArray array) {
        return (int) Arrays.stream(array.getArray()).filter(i -> i < 0).count();
    }
}
