package by.ivankov.task3.comparator;

import by.ivankov.task3.entity.CustomArray;

import java.util.ArrayList;
import java.util.Comparator;

public class FirstElementComparator implements Comparator<CustomArray> {

    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        int[] array1 = o1.getArray();
        int[] array2 = o2.getArray();
        if (array1.length == 0){
            return -1;
        }else if(array2.length == 0){
            return 1;
        }else {
            return array1[0] - array2[0];
        }
    }
}
