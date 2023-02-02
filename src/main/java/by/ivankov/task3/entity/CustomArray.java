package by.ivankov.task3.entity;


import by.ivankov.task3.exception.CustomException;
import by.ivankov.task3.observer.ArrayStatisticsObserver;
import by.ivankov.task3.observer.impl.ArrayStatisticsObserverImpl;
import by.ivankov.task3.util.IdGenerator;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

public class CustomArray {
    private int arrayId;
    private int[] array;
    private ArrayStatisticsObserver observer;

    public CustomArray(){
        this.arrayId = IdGenerator.arrayIdGenerator();
        observer = new ArrayStatisticsObserverImpl();
    }
    public CustomArray(int[] array) {
        this.arrayId = IdGenerator.arrayIdGenerator();
        setArray(array);
        observer = new ArrayStatisticsObserverImpl();
    }

    public void removeObserver(){
        observer = null;
    }
    public void addObserver(){
        observer = new ArrayStatisticsObserverImpl();
    }

    public int getArrayId() {
        return arrayId;
    }

    public void setArrayId(int arrayId) {
        this.arrayId = arrayId;
    }

    public void setArray(int[] array) {
        if(array != null && array.length > 0) {
            this.array = array;
        } else {
            this.array = new int[]{0};
        }
        notifyObserver();
    }

    public int[] getArray() {
        return array;
    }
    public void setElement(int index, int value){
        array[index] = value;
        notifyObserver();
    }

    private void notifyObserver(){
        if (observer != null){
            try {
                observer.changeArrayElement(this);
            } catch (CustomException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray that = (CustomArray) o;
        return arrayId == that.arrayId && Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(arrayId);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "\n" + "(", ")")
                .add("Id=" + arrayId)
                .add("array=" + Arrays.toString(array))
                .toString();
    }
}
