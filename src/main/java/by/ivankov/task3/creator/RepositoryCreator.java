package by.ivankov.task3.creator;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.entity.CustomArrayWarehouse;
import by.ivankov.task3.exception.CustomException;
import by.ivankov.task3.repository.ArrayRepository;

import java.util.List;

public interface RepositoryCreator {
    ArrayRepository createFromListObject(List<CustomArray> customArrays) throws CustomException;
    ArrayRepository createFromListArray(List<int[]> arrays);
}
