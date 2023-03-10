package by.ivankov.task3.service.impl;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.exception.CustomException;
import by.ivankov.task3.reader.impl.ArrayReaderServiceImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SortingAlgorithmsServiceImplTest {
    @Test
    public void testBubbleSort() throws CustomException {
        ArrayReaderServiceImpl readerService = new ArrayReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        SortingAlgorithmsServiceImpl service = new SortingAlgorithmsServiceImpl();
        service.bubbleSort(customArray);
        int[] actual = customArray.getArray();
        int[] expected = {-13, -5, 2, 5, 34, 36, 53};
        assertEquals(actual, expected);
    }

    @Test
    public void testSelectionSort() throws CustomException {
        ArrayReaderServiceImpl readerService = new ArrayReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        SortingAlgorithmsServiceImpl service = new SortingAlgorithmsServiceImpl();
        service.selectionSort(customArray);
        int[] actual = customArray.getArray();
        int[] expected = {-13, -5, 2, 5, 34, 36, 53};
        assertEquals(actual, expected);
    }

    @Test
    public void testInsertionSort() throws CustomException {
        ArrayReaderServiceImpl readerService = new ArrayReaderServiceImpl();
        CustomArray customArray = readerService.arrayReader("data//correctString.txt");
        SortingAlgorithmsServiceImpl service = new SortingAlgorithmsServiceImpl();
        service.insertionSort(customArray);
        int[] actual = customArray.getArray();
        int[] expected = {-13, -5, 2, 5, 34, 36, 53};
        assertEquals(actual, expected);
    }
}