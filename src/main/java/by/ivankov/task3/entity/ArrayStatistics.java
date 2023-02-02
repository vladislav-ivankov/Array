package by.ivankov.task3.entity;

import by.ivankov.task3.exception.CustomException;
import by.ivankov.task3.service.impl.ArrayServiceImpl;

import java.util.StringJoiner;


public class ArrayStatistics {
    private int sum;
    private int max;
    private int min;
    private double average;

    public ArrayStatistics(CustomArray customArray) throws CustomException {
        ArrayServiceImpl service = new ArrayServiceImpl();
        this.average = service.averageValue(customArray).getAsDouble();
        this.sum = service.sum(customArray).getAsInt();
        this.max = service.maxValue(customArray).getAsInt();
        this.min = service.minValue(customArray).getAsInt();
    }

    public int getSum() {
        return sum;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArrayStatistics that = (ArrayStatistics) o;

        if (sum != that.sum) return false;
        if (max != that.max) return false;
        if (min != that.min) return false;
        return Double.compare(that.average, average) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = sum;
        result = 31 * result + max;
        result = 31 * result + min;
        temp = Double.doubleToLongBits(average);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ArrayStatistics.class.getSimpleName() + "[", "]")
                .add("sum=" + sum)
                .add("max=" + max)
                .add("min=" + min)
                .add("average=" + average)
                .toString();
    }
}
