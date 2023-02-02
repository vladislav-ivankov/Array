package by.ivankov.task3.repository.spec;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.exception.CustomException;
import by.ivankov.task3.service.impl.ArrayServiceImpl;

public class MoreSumSpecification implements Specification {
    private int moreSum;

    public MoreSumSpecification(int moreSum) {
        this.moreSum = moreSum;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        ArrayServiceImpl service = new ArrayServiceImpl();
        try {
            return service.sum(customArray).getAsInt() > moreSum;
        } catch (CustomException e) {
            throw new RuntimeException(e);
        }
//        int sum = 0;
//            for (int array : customArray.getArray()) {
//                sum += array;
//            }
//            return sum > moreSum;
    }
}
