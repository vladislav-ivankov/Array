package by.ivankov.task3.service.impl;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.exception.CustomException;
import by.ivankov.task3.reader.impl.ArrayFileReaderServiceImpl;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

import static org.testng.Assert.*;

public class SortingAlgorithmsServiceImplTest {
    @Test
    public void testBubbleSort() throws CustomException {
        ArrayFileReaderServiceImpl readerService = new ArrayFileReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        SortingAlgorithmsServiceImpl service = new SortingAlgorithmsServiceImpl();
        Optional<int[]> actual = service.bubbleSort(customArray);
        Optional<int[]> expected = Optional.ofNullable(new int[]{-13, -5, 2, 5, 34, 36, 53});
        assertEquals(actual, expected);
    }

    @Test
    public void testSelectionSort() throws CustomException {
        ArrayFileReaderServiceImpl readerService = new ArrayFileReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        SortingAlgorithmsServiceImpl service = new SortingAlgorithmsServiceImpl();
        Optional<int[]> actual = service.selectionSort(customArray);
        Optional<int[]> expected = Optional.ofNullable(new int[]{-13, -5, 2, 5, 34, 36, 53});
        assertEquals(actual, expected);
    }

    @Test
    public void testInsertionSort() throws CustomException {
        ArrayFileReaderServiceImpl readerService = new ArrayFileReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        SortingAlgorithmsServiceImpl service = new SortingAlgorithmsServiceImpl();
        Optional<int[]> actual = service.insertionSort(customArray);
        Optional<int[]> expected = Optional.ofNullable(new int[]{-13, -5, 2, 5, 34, 36, 53});
        assertEquals(actual, expected);
    }
}