package by.ivankov.task3.service.sort;

import by.ivankov.task3.entity.CustomArray;

import java.util.List;

public interface SortService {
    List<CustomArray> sortId(List<CustomArray> arrays);
    List<CustomArray> sortByLength(List<CustomArray> arrays);
    List<CustomArray> FirstElementSort(List<CustomArray> arrays);
}
