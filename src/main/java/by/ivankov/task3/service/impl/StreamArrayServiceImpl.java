package by.ivankov.task3.service.impl;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.service.StreamArrayService;

import java.util.*;

public class StreamArrayServiceImpl implements StreamArrayService {

    @Override
    public int[] streamReplacement(CustomArray array, int condition) {
        int[] result = Arrays.stream(array.getArray()).map(i -> i > condition ? 1 : 0).toArray();
        return result;
    }

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
    public int[] streamSearchPosNeg(CustomArray array) {
        int[] result = {0, 0};
        result[0] = (int) Arrays.stream(array.getArray()).filter(i -> i > 0).count();
        result[1] = (int) Arrays.stream(array.getArray()).filter(i -> i < 0).count();
        return result;
    }

}
