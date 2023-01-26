package by.ivankov.task3.service.impl;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.reader.impl.ArrayListReaderServiceImpl;
import by.ivankov.task3.reader.impl.ArrayReaderServiceImpl;
import org.testng.annotations.Test;

import java.util.OptionalDouble;
import java.util.OptionalInt;

import static org.testng.Assert.*;

public class StreamArrayServiceImplTest {
    @Test
    public void testStreamMinValue() {
        ArrayReaderServiceImpl readerService = new ArrayReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        StreamArrayServiceImpl service = new StreamArrayServiceImpl();
        OptionalInt actual = service.streamMinValue(customArray);
        OptionalInt expected = OptionalInt.of(-13);
        assertEquals(actual, expected);
    }

    @Test
    public void testStreamMaxValue() {
        ArrayReaderServiceImpl readerService = new ArrayReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        StreamArrayServiceImpl service = new StreamArrayServiceImpl();
        OptionalInt actual = service.streamMaxValue(customArray);
        OptionalInt expected = OptionalInt.of(53);
        assertEquals(actual, expected);
    }

    @Test
    public void testStreamAverageValue() {
        ArrayReaderServiceImpl readerService = new ArrayReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        StreamArrayServiceImpl service = new StreamArrayServiceImpl();
        OptionalDouble actual = service.streamAverageValue(customArray);
        OptionalDouble expected = OptionalDouble.of(16);
        assertEquals(actual, expected);
    }

    @Test
    public void testStreamSum() {
        ArrayReaderServiceImpl readerService = new ArrayReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        StreamArrayServiceImpl service = new StreamArrayServiceImpl();
        OptionalInt actual = service.streamSum(customArray);
        OptionalInt expected = OptionalInt.of(112);
        assertEquals(actual, expected);
    }

    @Test
    public void testStreamSearchPosNeg() {
        ArrayReaderServiceImpl readerService = new ArrayReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        StreamArrayServiceImpl service = new StreamArrayServiceImpl();
        int[] actual = service.streamSearchPosNeg(customArray);
        int[] expected = {5, 2};
        assertEquals(actual, expected);
    }

    @Test
    public void testStreamReplacement() {
        ArrayReaderServiceImpl readerService = new ArrayReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        StreamArrayServiceImpl service = new StreamArrayServiceImpl();
        int[] actual = service.streamReplacement(customArray, 7);
        int[] expected = {0, 1, 1, 0, 0, 1, 0};
        assertEquals(actual, expected);
    }
}