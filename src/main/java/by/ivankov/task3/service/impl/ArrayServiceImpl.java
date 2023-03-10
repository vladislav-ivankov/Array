package by.ivankov.task3.service.impl;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.exception.CustomException;
import by.ivankov.task3.service.ArrayService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;


public class ArrayServiceImpl implements ArrayService {
    Logger logger = LogManager.getLogger();

    @Override
    public int[] replacement(CustomArray arr, int condition) throws CustomException {
        int[] array = arr.getArray();
        if (array == null) {
            throw new CustomException("The array cannot be empty");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < condition) {
                array[i] = 0;
            } else if (array[i] >= condition) {
                array[i] = 1;
            }
        }
        if (array.length == 0) {
            logger.log(Level.INFO, "Array length = 0");
        }
        return array;
    }

    @Override
    public OptionalInt maxValue(CustomArray arr) throws CustomException {
        int[] array = arr.getArray();
        OptionalInt min = OptionalInt.of(0);
        if (array == null) {
            throw new CustomException("The array cannot be empty");
        }
        for (int i : array) {
            if (i > min.getAsInt()) {
                min = OptionalInt.of(i);
            }
        }
        if (array.length == 0) {
            logger.log(Level.INFO, "Array length = 0");
            min = OptionalInt.empty();
        }
        return min;
    }

    @Override
    public OptionalInt minValue(CustomArray arr) throws CustomException {
        int[] array = arr.getArray();
        OptionalInt max = OptionalInt.of(0);
        if (array == null) {
            throw new CustomException("The array cannot be empty");
        }
        for (int i : array) {
            if (i < max.getAsInt()) {
                max = OptionalInt.of(i);
            }
        }
        if (array.length == 0) {
            logger.log(Level.INFO, "Array length = 0");
        }
        return max;
    }

    @Override
    public OptionalDouble averageValue(CustomArray arr) throws CustomException {
        int[] array = arr.getArray();
        OptionalInt sum = OptionalInt.of(0);
        OptionalDouble result = OptionalDouble.of(0);
        if (array == null) {
            throw new CustomException("The array cannot be empty");
        }
        for (int i : array) {
            sum = OptionalInt.of(sum.getAsInt() + i);
        }
        result = OptionalDouble.of(sum.getAsInt() / array.length);
        if (array.length == 0) {
            logger.log(Level.INFO, "Array length = 0");
        }
        return result;
    }

    @Override
    public OptionalInt sum(CustomArray arr) throws CustomException {
        int[] array = arr.getArray();
        OptionalInt sum = OptionalInt.of(0);
        if (array == null) {
            throw new CustomException("The array cannot be empty");
        }
        for (int i : array) {
            sum = OptionalInt.of(sum.getAsInt() + i);
        }
        if (array.length == 0) {
            logger.log(Level.INFO, "Array length = 0");
        }
        return sum;
    }

    @Override
    public OptionalInt searchPositive(CustomArray arr) throws CustomException {
        int[] array = arr.getArray();
        OptionalInt pos = OptionalInt.of(0);
        if (array == null) {
            throw new CustomException("The array cannot be empty");
        }
        for (int i : array) {
            if (i > 0) {
                pos = OptionalInt.of(pos.getAsInt() + 1);
            }
        }
        if (array.length == 0) {
            logger.log(Level.INFO, "Array length = 0");
        }
        return pos;
    }

    @Override
    public OptionalInt searchNegative(CustomArray arr) throws CustomException {
        int[] array = arr.getArray();
        OptionalInt neg = OptionalInt.of(0);
        if (array == null) {
            throw new CustomException("The array cannot be empty");
        }
        for (int i : array) {
            if (i < 0) {
                neg = OptionalInt.of(neg.getAsInt() + 1);
            }
        }
        if (array.length == 0) {
            logger.log(Level.INFO, "Array length = 0");
        }
        return neg;
    }

    public int[] searchPosNeg(CustomArray arr) throws CustomException {
        int[] array = arr.getArray();
        int[] result = {0, 0};
        int neg = 0;
        int pos = 0;
        if (array == null) {
            throw new CustomException("The array cannot be empty");
        }
        for (int i : array) {
            if (i > 0) {
                result[0] += pos + 1;
            }
            if (i < 0) {
                result[1] += neg + 1;
            }
        }
        if (array.length == 0) {
            logger.log(Level.INFO, "Array length = 0");
        }
        return result;
    }
}
