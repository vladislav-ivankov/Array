package by.ivankov.task3.service.impl;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.service.ArrayService;


public class ArrayServiceImpl implements ArrayService {

    @Override
    public int[] replacement(CustomArray arr) {
        int[] array = arr.getArray();
        for (int i : array) {
            if (i < 7) {
                i = 0;
            } else if (i >= 7) {
                i = 1;
            }
        }
        return array;
    }

    @Override
    public int maxValue(CustomArray arr) {
        int[] array = arr.getArray();
        int min = 0;
        for(int i : array){
            if (i < min){
                min = i;
            }
        }
        return min;
    }

    @Override
    public int minValue(CustomArray arr) {
        int[] array = arr.getArray();
        int max = 0;
        for(int i : array){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    @Override
    public double averageValue(CustomArray arr) {
        int[] array = arr.getArray();
        double sum = 0;
        for(int i : array) {
            sum += i;
        }
        return (sum / array.length);
    }

    @Override
    public int sum(CustomArray arr) {
        int[] array = arr.getArray();
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return (int) sum;
    }

    @Override
    public int searchPositive(CustomArray arr) {
        int[] array = arr.getArray();
        int pos = 0;
        for (int i : array) {
            if (i > 0) {
                pos += 1;
            }
        }
        return pos;
    }

    @Override
    public int searchNegative(CustomArray arr) {
        int[] array = arr.getArray();
        int neg = 0;
        for (int i : array) {
            if (i < 0) {
                neg += 1;
            }
        }
        return neg;
    }
}
