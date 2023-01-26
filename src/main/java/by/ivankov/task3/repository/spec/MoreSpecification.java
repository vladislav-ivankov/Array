package by.ivankov.task3.repository.spec;

import by.ivankov.task3.entity.CustomArray;

public class MoreSpecification implements Specification {
    private int value;

    public MoreSpecification(int value) {
        this.value = value;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        int sum = 0;
            for (int array : customArray.getArray()) {
                sum += array;
            }
            return sum > value;
    }
}
