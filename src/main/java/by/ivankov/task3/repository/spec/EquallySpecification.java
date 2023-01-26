package by.ivankov.task3.repository.spec;

import by.ivankov.task3.entity.CustomArray;

import java.sql.PseudoColumnUsage;

public class EquallySpecification implements Specification{
    private int value;

    public EquallySpecification(int value) {
        this.value = value;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        int sum = 0;
        for (int array : customArray.getArray()) {
            sum += array;
        }
        return sum == value;
    }

    public boolean moreSpecify(CustomArray customArray){
        int sum = 0;
        for (int array : customArray.getArray()){
            sum += array;
        }
        return sum > value;
    }
}
