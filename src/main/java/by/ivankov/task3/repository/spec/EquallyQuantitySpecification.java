package by.ivankov.task3.repository.spec;

import by.ivankov.task3.entity.CustomArray;

public class EquallyQuantitySpecification implements Specification{
    private int equallyQuantity;

    public EquallyQuantitySpecification(int equallyQuantity){
        this.equallyQuantity = equallyQuantity;
    }
    @Override
    public boolean specify(CustomArray customArray) {
        return customArray.getArray().length == equallyQuantity;
    }
}
