package by.ivankov.task3.service.impl;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.service.StreamArrayService;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamArrayServiceImpl implements StreamArrayService {
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
    public OptionalInt streamSum(CustomArray array) {
        return OptionalInt.of(Arrays.stream(array.getArray()).sum());
    }

    @Override
    public OptionalInt streamSearchPositive(CustomArray array) {
        return OptionalInt.of((int) Arrays.stream(array.getArray()).filter(i -> i > 0).count());
    }

    @Override
    public OptionalInt streamSearchNegative(CustomArray array) {
        return OptionalInt.of((int) Arrays.stream(array.getArray()).filter(i -> i < 0).count());
    }
}
