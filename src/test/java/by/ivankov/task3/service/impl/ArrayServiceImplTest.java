package by.ivankov.task3.service.impl;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.exception.CustomException;
import by.ivankov.task3.reader.impl.ArrayListReaderServiceImpl;
import by.ivankov.task3.reader.impl.ArrayReaderServiceImpl;
import org.testng.annotations.Test;

import java.util.OptionalDouble;
import java.util.OptionalInt;

import static org.testng.Assert.*;

public class ArrayServiceImplTest {

    @Test
    public void testAverageValue() throws CustomException {
        ArrayReaderServiceImpl readerService = new ArrayReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        ArrayServiceImpl service = new ArrayServiceImpl();
        OptionalDouble actual = service.averageValue(customArray);
        OptionalDouble expected = OptionalDouble.of(16);
        assertEquals(actual, expected);
    }

    @Test
    public void testSearchSum() throws CustomException {
        ArrayReaderServiceImpl readerService = new ArrayReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        ArrayServiceImpl service = new ArrayServiceImpl();
        OptionalInt actual = service.sum(customArray);
        OptionalInt expected = OptionalInt.of(112);
        assertEquals(actual, expected);
    }

    @Test
    public void testMaxValue() throws CustomException {
        ArrayReaderServiceImpl readerService = new ArrayReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        ArrayServiceImpl service = new ArrayServiceImpl();
        OptionalInt actual = service.maxValue(customArray);
        OptionalInt expected = OptionalInt.of(53);
        assertEquals(actual, expected);
    }

    @Test
    public void testMinValue() throws CustomException {
        ArrayReaderServiceImpl readerService = new ArrayReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        ArrayServiceImpl service = new ArrayServiceImpl();
        OptionalInt actual = service.minValue(customArray);
        OptionalInt expected = OptionalInt.of(-13);
        assertEquals(actual, expected);
    }

    @Test
    public void testSearchPos() throws CustomException {
        ArrayReaderServiceImpl readerService = new ArrayReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        ArrayServiceImpl service = new ArrayServiceImpl();
        OptionalInt actual = service.searchPositive(customArray);
        OptionalInt expected = OptionalInt.of(5);
        assertEquals(actual, expected);
    }

    @Test
    public void testSearchNeg() throws CustomException {
        ArrayReaderServiceImpl readerService = new ArrayReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        ArrayServiceImpl service = new ArrayServiceImpl();
        OptionalInt actual = service.searchNegative(customArray);
        OptionalInt expected = OptionalInt.of(2);
        assertEquals(actual, expected);
    }

    @Test
    public void testSearchPosNeg() throws CustomException{
        ArrayReaderServiceImpl readerService = new ArrayReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        ArrayServiceImpl service = new ArrayServiceImpl();
        int[] actual = service.searchPosNeg(customArray);
        int[] expected = {5, 2};
        assertEquals(actual, expected);
    }

    @Test
    public void testReplacementElement() throws CustomException {
        ArrayReaderServiceImpl readerService = new ArrayReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        ArrayServiceImpl service = new ArrayServiceImpl();
        int[] actual = service.replacement(customArray, 7);
        int[] expected = {0, 1, 1, 0, 0, 1, 0};
        assertEquals(actual, expected);
    }
}