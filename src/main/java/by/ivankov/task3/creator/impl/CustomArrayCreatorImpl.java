package by.ivankov.task3.creator.impl;

import by.ivankov.task3.creator.CustomArrayCreator;
import by.ivankov.task3.entity.CustomArray;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayCreatorImpl implements CustomArrayCreator {
    @Override
    public CustomArray createCustomArray(int[] array) {
        CustomArray customArray = new CustomArray(array);
        return customArray;
    }

    @Override
    public List<CustomArray> createCustomArray(List<int[]> array) {
        List<CustomArray> arrayList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            arrayList.add(new CustomArray(array.get(i)));
        }
        return arrayList;
    }
}
