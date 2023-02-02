package by.ivankov.task3.repository.spec;

import by.ivankov.task3.entity.CustomArray;

import java.util.Arrays;
import java.util.OptionalInt;

public class LessMinSpecification implements Specification{
    private int lessMin;

    public LessMinSpecification(int lessMin){
        this.lessMin = lessMin;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        OptionalInt min = Arrays.stream(customArray.getArray()).min();
        return min.getAsInt() < lessMin;
    }
}
