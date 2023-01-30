package by.ivankov.task3.service.sort.impl;

import by.ivankov.task3.comparator.FirstElementComparator;
import by.ivankov.task3.comparator.byLengthComparator;
import by.ivankov.task3.comparator.IdComparator;
import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.service.sort.SortService;

import java.util.*;

public class SortServiceImpl implements SortService {
    @Override
    public List<CustomArray> sortId(List<CustomArray> arrays) {
        Collections.sort(arrays, new IdComparator());
        return arrays;
    }

    @Override
    public List<CustomArray> sortByLength(List<CustomArray> arrays) {
        Collections.sort(arrays, new byLengthComparator());
        return arrays;
    }

    @Override
    public List<CustomArray> FirstElementSort(List<CustomArray> arrays) {
        Collections.sort(arrays, new FirstElementComparator());
        return arrays;
    }
}
