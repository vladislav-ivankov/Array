package by.ivankov.task3.entity;


import by.ivankov.task3.util.IdGenerator;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

public class CustomArray{
    private int arrayId;
    private int[] array;

    public CustomArray(){
        this.arrayId = IdGenerator.arrayIdGenerator();
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
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
        return new StringJoiner(", ", CustomArray.class.getSimpleName() + "(", ")")
                .add("arrayId=" + arrayId)
                .add("array=" + Arrays.toString(array))
                .toString();
    }
}
