package by.ivankov.task3.service.impl;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.service.ArrayService;

import java.util.Arrays;
import java.util.IntSummaryStatistics;


public class ArrayServiceImpl implements ArrayService {

    @Override
    public int[] replacement(CustomArray arr) {
        for (int i = 0; i < arr.getArray().length; i++) {
            if (arr.getArray()[i] < 7) {
                arr.getArray()[i] = 0;
            } else if (arr.getArray()[i] >= 7) {
                arr.getArray()[i] = 1;
            }
        }
        return arr.getArray();
    }

    @Override
    public int maxValue(CustomArray arr) {
        IntSummaryStatistics stat = Arrays.stream(arr.getArray()).summaryStatistics();
        return stat.getMax();
    }

    @Override
    public int minValue(CustomArray arr) {
        IntSummaryStatistics stat = Arrays.stream(arr.getArray()).summaryStatistics();
        return stat.getMin();
    }

    @Override
    public double averageValue(CustomArray arr) {
        double sum = 0;
        for (int i = 0; i < arr.getArray().length; i++) {
            sum += arr.getArray()[i];
        }
        return (sum / arr.getArray().length);
    }

    @Override
    public int sum(CustomArray arr) {
        double sum = 0;
        for (int i = 0; i < arr.getArray().length; i++) {
            sum += arr.getArray()[i];
        }
        return (int) sum;
    }

    @Override
    public int searchPositive(CustomArray arr) {
        int pos = 0;
        for (int i = 0; i < arr.getArray().length; i++) {
            if (arr.getArray()[i] > 0) {
                pos += 1;
            }
        }
        return pos;
    }

    @Override
    public int searchNegative(CustomArray arr) {
        int neg = 0;
        for (int i = 0; i < arr.getArray().length; i++) {
            if (arr.getArray()[i] < 0) {
                neg += 1;
            }
        }
        return neg;
    }
}
