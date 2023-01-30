package by.ivankov.task3.repository.spec;

import by.ivankov.task3.entity.CustomArray;

public class MoreSumSpecification implements Specification {
    private int moreValue;

    public MoreSumSpecification(int moreValue) {
        this.moreValue = moreValue;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        int sum = 0;
            for (int array : customArray.getArray()) {
                sum += array;
            }
            return sum > moreValue;
    }
}
