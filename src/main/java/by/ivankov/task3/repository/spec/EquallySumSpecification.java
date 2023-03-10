package by.ivankov.task3.repository.spec;

import by.ivankov.task3.entity.CustomArray;

public class EquallySumSpecification implements Specification{
    private int equallySum;

    public EquallySumSpecification(int equallySum) {
        this.equallySum = equallySum;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        int sum = 0;
        for (int array : customArray.getArray()) {
            sum += array;
        }
        return sum == equallySum;
    }
}
