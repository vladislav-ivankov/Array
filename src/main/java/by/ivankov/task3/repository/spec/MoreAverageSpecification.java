package by.ivankov.task3.repository.spec;

import by.ivankov.task3.entity.CustomArray;

public class MoreAverageSpecification implements Specification {
    private int moreAvg;

    public MoreAverageSpecification(int moreAvg) {
        this.moreAvg = moreAvg;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        int sum = 0;
        int avg;
        for (int array : customArray.getArray()) {
            sum += array;
        }
        avg = sum / customArray.getArray().length;
        return avg > moreAvg;
    }
}
