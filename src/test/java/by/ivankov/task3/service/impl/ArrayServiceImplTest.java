package by.ivankov.task3.service.impl;

import by.ivankov.task3.entity.CustomArray;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayServiceImplTest {
    ArrayServiceImpl service = new ArrayServiceImpl();
    int[] array = {-1, 12, 6, 14, -7};
    CustomArray arr = new CustomArray(array);

    @Test
    public void testAverageValue() {
        double actual = service.averageValue(arr);
        double expected = 4.8;
        assertEquals(actual, expected);
    }

    @Test
    public void testSearchSum() {
        int actual = service.sum(arr);
        int expected = 24;
        assertEquals(actual, expected);
    }

    @Test
    public void testMaxValue() {
        int actual = service.maxValue(arr);
        int expected = 14;
        assertEquals(actual, expected);
    }

    @Test
    public void testMinValue() {
        int actual = service.minValue(arr);
        int expected = -7;
        assertEquals(actual, expected);
    }

    @Test
    public void testSearchPos() {
        int actual = service.searchPositive(arr);
        int  expected = 3;
        assertEquals(actual, expected);
    }

    @Test
    public void testSearchNeg() {
        int actual = service.searchNegative(arr);
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test
    public void testReplacementElement() {
        int[] actual = service.replacement(arr);
        int[] expected = {0, 1, 0, 1, 0};
        assertEquals(actual, expected);

    }
}