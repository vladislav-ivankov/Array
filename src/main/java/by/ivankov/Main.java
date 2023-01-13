package by.ivankov;


import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.reader.impl.ArrayFileReaderServiceImpl;

public class Main {
    public static void main(String[] args) {
        ArrayFileReaderServiceImpl reader = new ArrayFileReaderServiceImpl();
        CustomArray array = reader.arrayReader("data//correctString.txt");
        System.out.print(array);
        CustomArray array1 = reader.arrayReader("data//invalidString.txt");
        System.out.println(array1);
        CustomArray array2 = reader.arrayReader("data//array");
        System.out.println(array2);
    }
}