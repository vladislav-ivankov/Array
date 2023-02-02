package by.ivankov.task3.observer;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.exception.CustomException;

public interface ArrayStatisticsObserver {
    void changeArrayElement(CustomArray customArray) throws CustomException;
}
