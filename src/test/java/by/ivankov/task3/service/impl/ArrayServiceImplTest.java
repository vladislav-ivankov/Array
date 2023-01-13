package by.ivankov.task3.service.impl;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.exception.CustomException;
import by.ivankov.task3.reader.impl.ArrayFileReaderServiceImpl;
import org.testng.annotations.Test;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

import static org.testng.Assert.*;

public class ArrayServiceImplTest {

    @Test
    public void testAverageValue() throws CustomException {
        ArrayFileReaderServiceImpl readerService = new ArrayFileReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        ArrayServiceImpl service = new ArrayServiceImpl();
        OptionalDouble actual = service.averageValue(customArray);
        OptionalDouble expected = OptionalDouble.of(16);
        assertEquals(actual, expected);
    }

    @Test
    public void testSearchSum() throws CustomException {
        ArrayFileReaderServiceImpl readerService = new ArrayFileReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        ArrayServiceImpl service = new ArrayServiceImpl();
        OptionalInt actual = service.sum(customArray);
        OptionalInt expected = OptionalInt.of(112);
        assertEquals(actual, expected);
    }

    @Test
    public void testMaxValue() throws CustomException {
        ArrayFileReaderServiceImpl readerService = new ArrayFileReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        ArrayServiceImpl service = new ArrayServiceImpl();
        OptionalInt actual = service.maxValue(customArray);
        OptionalInt expected = OptionalInt.of(53);
        assertEquals(actual, expected);
    }

    @Test
    public void testMinValue() throws CustomException {
        ArrayFileReaderServiceImpl readerService = new ArrayFileReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        ArrayServiceImpl service = new ArrayServiceImpl();
        OptionalInt actual = service.minValue(customArray);
        OptionalInt expected = OptionalInt.of(-13);
        assertEquals(actual, expected);
    }

    @Test
    public void testSearchPos() throws CustomException {
        ArrayFileReaderServiceImpl readerService = new ArrayFileReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        ArrayServiceImpl service = new ArrayServiceImpl();
        OptionalInt actual = service.searchPositive(customArray);
        OptionalInt expected = OptionalInt.of(5);
        assertEquals(actual, expected);
    }

    @Test
    public void testSearchNeg() throws CustomException {
        ArrayFileReaderServiceImpl readerService = new ArrayFileReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        ArrayServiceImpl service = new ArrayServiceImpl();
        OptionalInt actual = service.searchNegative(customArray);
        OptionalInt expected = OptionalInt.of(2);
        assertEquals(actual, expected);
    }

//    @Test
//    public void testReplacementElement() throws CustomException {
//        ArrayFileReaderServiceImpl readerService = new ArrayFileReaderServiceImpl();
//        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
//        ArrayServiceImpl service = new ArrayServiceImpl();
//        Optional<int[]> actual = service.replacement(customArray);
//        Optional<int[]> expected = Optional.ofNullable(new int[]{0, 1, 1, 0, 0, 1, 0});
//        assertEquals(actual, expected);
//
//    }
}