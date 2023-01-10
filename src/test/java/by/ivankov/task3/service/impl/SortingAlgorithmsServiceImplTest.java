package by.ivankov.task3.service.impl;

import by.ivankov.task3.entity.CustomArray;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class SortingAlgorithmsServiceImplTest {
    SortingAlgorithmsServiceImpl service = new SortingAlgorithmsServiceImpl();
    int[] arr = {3, 25, 7, 1, 13};
    CustomArray array = new CustomArray(arr);

    @Test
    public void testBubbleSort() {
        int[] actual = service.bubbleSort(array);
        int[] expected = {1, 3, 7, 13, 25};
        assertEquals(actual, expected);
    }

    @Test
    public void testSelectionSort() {
        int[] actual = service.selectionSort(array);
        int[] expected = {1, 3, 7, 13, 25};
        assertEquals(actual, expected);
    }

    @Test
    public void testInsertionSort() {
        int[] actual = service.insertionSort(array);
        int[] expected = {1, 3, 7, 13, 25};
        assertEquals(actual, expected);
    }
}