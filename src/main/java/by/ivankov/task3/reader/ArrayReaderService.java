package by.ivankov.task3.reader;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.exception.CustomException;

import java.util.List;

public interface ArrayReaderService {
    int[] arrayReader(String fileName);
    List<CustomArray> arrayListReader(String fileName) throws CustomException;
}
