package by.ivankov.task3.service;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.exception.CustomException;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public interface ArrayService {
    Optional<int[]> replacement(CustomArray arr) throws CustomException;

    OptionalInt maxValue(CustomArray arr) throws CustomException;

    OptionalInt minValue(CustomArray arr) throws CustomException;

    OptionalDouble averageValue(CustomArray arr) throws CustomException;

    OptionalInt sum(CustomArray arr) throws CustomException;

    OptionalInt searchPositive(CustomArray arr) throws CustomException;

    OptionalInt searchNegative(CustomArray arr) throws CustomException;
}
