package by.ivankov;


import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.file.impl.ArrayFileReaderServiceImpl;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {5, 5, 3, 5, -5};
//        StreamArrayServiceImpl service = new StreamArrayServiceImpl();
//        System.out.println(service.streamMinValue(array));
//        System.out.println(service.streamMaxValue(array));
//        System.out.println(service.streamAverageValue(array));
//        System.out.println(service.streamSum(array));
//        System.out.println(service.streamSearchPositive(array));
//        System.out.println(service.streamSearchNegative(array));

        ArrayFileReaderServiceImpl reader = new ArrayFileReaderServiceImpl();
        CustomArray array = reader.arrayReader("data//arrayFile.txt");
        System.out.print(array);
    }
}