package by.ivankov.task3.creator;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.entity.CustomArrayWarehouse;
import by.ivankov.task3.exception.CustomException;

import java.util.List;

public interface WarehouseCreator {
    CustomArrayWarehouse createWarehouseObject(List<CustomArray> customArrays) throws CustomException;
    CustomArrayWarehouse createWarehouseArray(List<int[]> array) throws CustomException;
}
