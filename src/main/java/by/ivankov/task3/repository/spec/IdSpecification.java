package by.ivankov.task3.repository.spec;

import by.ivankov.task3.entity.CustomArray;

public class IdSpecification implements Specification{
    private int id;

    public IdSpecification(int id) {
        this.id = id;
    }

    @Override
    public boolean specify(CustomArray customArray ){
        return customArray.getArrayId() == id;
    }
}
