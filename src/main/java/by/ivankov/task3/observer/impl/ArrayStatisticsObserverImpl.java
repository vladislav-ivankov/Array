package by.ivankov.task3.observer.impl;

import by.ivankov.task3.entity.ArrayStatistics;
import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.entity.CustomArrayWarehouse;
import by.ivankov.task3.exception.CustomException;
import by.ivankov.task3.observer.ArrayStatisticsObserver;

public class ArrayStatisticsObserverImpl implements ArrayStatisticsObserver {

    @Override
    public void changeArrayElement(CustomArray customArray){
        CustomArrayWarehouse warehouse = CustomArrayWarehouse.getInstance();
        ArrayStatistics statistics = null;
        try {
            statistics = new ArrayStatistics(customArray);
            int id = customArray.getArrayId();
            warehouse.put(id, statistics);
        }catch (CustomException e) {
            throw new RuntimeException(e);
        }
    }
}
