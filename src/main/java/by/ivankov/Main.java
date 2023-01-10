package by.ivankov;


import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.file.ArrayFileWriter;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 5, 12, 18, 3};
        CustomArray array = new CustomArray(arr);
        ArrayFileWriter.arrayToFile(array, "arrayFile.txt");
    }
}