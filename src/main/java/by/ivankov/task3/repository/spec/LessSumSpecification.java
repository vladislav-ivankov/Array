package by.ivankov.task3.repository.spec;

import by.ivankov.task3.entity.CustomArray;

public class LessSumSpecification implements Specification {
    private int lessSum;

    public LessSumSpecification(int lessSum) {
        this.lessSum = lessSum;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        int sum = 0;
        for (int array : customArray.getArray()) {
            sum += array;
        }
        return sum < lessSum;
    }
}
