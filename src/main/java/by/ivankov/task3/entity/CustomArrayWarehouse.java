package by.ivankov.task3.entity;

import java.util.*;

public class CustomArrayWarehouse {
    static final CustomArrayWarehouse INSTANCE = new CustomArrayWarehouse();
    Map<Integer, IntSummaryStatistics> content = new HashMap<>();

    static CustomArrayWarehouse getInstance() {
        return INSTANCE;
    }

    public void summaryStatistics(List<CustomArray> arrays) {
        content.clear();
        for (CustomArray i : arrays) {
            content.put(i.getArrayId(), Arrays.stream(i.getArray()).summaryStatistics());
        }
    }

    public String getSummaryStatistics() {
        return content.toString();
    }
}
