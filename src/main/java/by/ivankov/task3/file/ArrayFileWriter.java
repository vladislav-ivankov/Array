package by.ivankov.task3.file;

import by.ivankov.task3.entity.CustomArray;

import java.io.*;
import java.util.Arrays;

public class ArrayFileWriter {

    public static void arrayToFile(CustomArray array, String fileName) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(fileName, true);
            writer.write(Arrays.toString(array.getArray()));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if ( writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
