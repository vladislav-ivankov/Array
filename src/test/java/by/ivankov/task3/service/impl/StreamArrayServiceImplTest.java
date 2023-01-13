package by.ivankov.task3.service.impl;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.reader.impl.ArrayFileReaderServiceImpl;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

import static org.testng.Assert.*;

public class StreamArrayServiceImplTest {
    @Test
    public void testStreamMinValue() {
        ArrayFileReaderServiceImpl readerService = new ArrayFileReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        StreamArrayServiceImpl service = new StreamArrayServiceImpl();
        OptionalInt actual = service.streamMinValue(customArray);
        OptionalInt expected = OptionalInt.of(-13);
        assertEquals(actual, expected);
    }

    @Test
    public void testStreamMaxValue() {
        ArrayFileReaderServiceImpl readerService = new ArrayFileReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        StreamArrayServiceImpl service = new StreamArrayServiceImpl();
        OptionalInt actual = service.streamMaxValue(customArray);
        OptionalInt expected = OptionalInt.of(53);
        assertEquals(actual, expected);
    }

    @Test
    public void testStreamAverageValue() {
        ArrayFileReaderServiceImpl readerService = new ArrayFileReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        StreamArrayServiceImpl service = new StreamArrayServiceImpl();
        OptionalDouble actual = service.streamAverageValue(customArray);
        OptionalDouble expected = OptionalDouble.of(16);
        assertEquals(actual, expected);
    }

    @Test
    public void testStreamSum() {
        ArrayFileReaderServiceImpl readerService = new ArrayFileReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        StreamArrayServiceImpl service = new StreamArrayServiceImpl();
        OptionalInt actual = service.streamSum(customArray);
        OptionalInt expected = OptionalInt.of(112);
        assertEquals(actual, expected);
    }

    @Test
    public void testStreamSearchPositive() {
        ArrayFileReaderServiceImpl readerService = new ArrayFileReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        StreamArrayServiceImpl service = new StreamArrayServiceImpl();
        OptionalInt actual = service.streamSearchPositive(customArray);
        OptionalInt expected = OptionalInt.of(5);
        assertEquals(actual, expected);
    }

    @Test
    public void testStreamSearchNegative() {
        ArrayFileReaderServiceImpl readerService = new ArrayFileReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        StreamArrayServiceImpl service = new StreamArrayServiceImpl();
        OptionalInt actual = service.streamSearchNegative(customArray);
        OptionalInt expected = OptionalInt.of(2);
        assertEquals(actual, expected);
    }
}