package by.ivankov.task3.main;


import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.exception.CustomException;
import by.ivankov.task3.reader.impl.ArrayListReaderServiceImpl;
import by.ivankov.task3.repository.ArrayRepository;
import by.ivankov.task3.repository.spec.*;

import java.util.List;

public class Main {
    public static void main(String[] args) throws CustomException {
        ArrayListReaderServiceImpl reader = new ArrayListReaderServiceImpl();
        List<CustomArray> arrays = reader.arrayListReader("data//defaultArray.txt");
        ArrayRepository repository = new ArrayRepository(arrays);
        Specification id = new IdSpecification(1);
        Specification more = new MoreSpecification(320);
        Specification less = new LessSpecification(66);
        Specification equally = new EquallySpecification(113);
        System.out.println("поиск массивов по id: " + repository.idSearch(id));
        System.out.println();
        System.out.println("поиск массивов сумма элементов которых больше заданного значения: " + repository.valueSearch(more));
        System.out.println();
        System.out.println("поиск массивов сумма элемнтов которых равна заданному значению: " + repository.valueSearch(equally));
        System.out.println();
        System.out.println("поиск массивов сумма элементов которых меньше заданного значения: " + repository.valueSearch(less));
    }
}