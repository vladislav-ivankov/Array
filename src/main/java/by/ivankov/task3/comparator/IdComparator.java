package by.ivankov.task3.comparator;

import by.ivankov.task3.entity.CustomArray;

import java.util.Comparator;

public class IdComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        return o1.getArrayId() - o2.getArrayId();
    }
}
