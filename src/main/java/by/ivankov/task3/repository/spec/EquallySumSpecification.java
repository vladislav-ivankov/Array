package by.ivankov.task3.repository.spec;

import by.ivankov.task3.entity.CustomArray;

public class EquallySumSpecification implements Specification{
    private int equallyValue;

    public EquallySumSpecification(int equallyValue) {
        this.equallyValue = equallyValue;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        int sum = 0;
        for (int array : customArray.getArray()) {
            sum += array;
        }
        return sum == equallyValue;
    }
}
