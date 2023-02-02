package by.ivankov.task3.creator.impl;

import by.ivankov.task3.creator.RepositoryCreator;
import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.exception.CustomException;
import by.ivankov.task3.repository.ArrayRepository;

import java.util.List;

public class ArrayRepositoryCreator implements RepositoryCreator {
    @Override
    public ArrayRepository createFromListObject(List<CustomArray> customArrays) throws CustomException{
        ArrayRepository repository = new ArrayRepository(customArrays);
        return repository;
    }

    @Override
    public ArrayRepository createFromListArray(List<int[]> arrays) {
        CustomArrayCreatorImpl creator = new CustomArrayCreatorImpl();
        List<CustomArray> customArray = creator.createCustomArray(arrays);
        ArrayRepository repository = new ArrayRepository(customArray);
        return repository;
    }
}
