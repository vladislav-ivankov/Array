package by.ivankov.task3.comparator;

import by.ivankov.task3.entity.CustomArray;

import java.util.Comparator;

public class LengthComparator implements Comparator<CustomArray> {

    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        return o1.getArray().length - o2.getArray().length;
    }
}
