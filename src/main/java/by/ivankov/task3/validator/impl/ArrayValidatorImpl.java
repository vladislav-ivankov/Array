package by.ivankov.task3.validator.impl;

import by.ivankov.task3.validator.ArrayValidator;


public class ArrayValidatorImpl implements ArrayValidator {
    private static final String INT_ARRAY_REGEX = "[+-]?\\d+";

    @Override
    public boolean arrayValidate(String stringNum) {
        boolean match = stringNum.matches(INT_ARRAY_REGEX);
        return match;
    }
}
