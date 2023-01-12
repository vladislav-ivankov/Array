package by.ivankov.task3.service.impl;

import by.ivankov.task3.entity.CustomArray;
import org.testng.annotations.Test;

import java.util.OptionalDouble;
import java.util.OptionalInt;

import static org.testng.Assert.*;

public class StreamArrayServiceImplTest {
    StreamArrayServiceImpl service = new StreamArrayServiceImpl();
    int[] array = {-1, 12, 6, 14, -7};
    CustomArray arr = new CustomArray(array);
    @Test
    public void testStreamMinValue() {
        OptionalInt actual = service.streamMinValue(arr);
        OptionalInt expected = OptionalInt.of(-7);
        assertEquals(actual, expected);
    }

    @Test
    public void testStreamMaxValue() {
        OptionalInt actual = service.streamMaxValue(arr);
        OptionalInt expected = OptionalInt.of(14);
        assertEquals(actual, expected);
    }

    @Test
    public void testStreamAverageValue() {
        OptionalDouble actual = service.streamAverageValue(arr);
        OptionalDouble expected = OptionalDouble.of(4.8);
        assertEquals(actual, expected);
    }

    @Test
    public void testStreamSum() {
        int actual = service.streamSum(arr);
        int expected = 24;
        assertEquals(actual, expected);
    }

    @Test
    public void testStreamSearchPositive() {
        int actual = service.streamSearchPositive(arr);
        int  expected = 3;
        assertEquals(actual, expected);
    }

    @Test
    public void testStreamSearchNegative() {
        int actual = service.streamSearchNegative(arr);
        int expected = 2;
        assertEquals(actual, expected);
    }
}