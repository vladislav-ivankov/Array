package by.ivankov.task3.creator;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.entity.CustomArrayWarehouse;

import java.util.List;

public interface CustomArrayCreator {
    CustomArray createCustomArray(int[] array);
    List<CustomArray> createCustomArray(List<int[]> array);
}
