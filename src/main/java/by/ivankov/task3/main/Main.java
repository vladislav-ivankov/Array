package by.ivankov.task3.main;


import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.exception.CustomException;
import by.ivankov.task3.reader.impl.ArrayReaderServiceImpl;
import by.ivankov.task3.repository.ArrayRepository;
import by.ivankov.task3.repository.spec.Specification;
import by.ivankov.task3.service.impl.SortingAlgorithmsServiceImpl;
import by.ivankov.task3.service.sort.impl.SortServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) throws CustomException {
        SortingAlgorithmsServiceImpl service = new SortingAlgorithmsServiceImpl();
        ArrayReaderServiceImpl reader = new ArrayReaderServiceImpl();
        List<CustomArray> arrayList = reader.arrayListReader("data//defaultArray.txt");
        CustomArray array = reader.arrayReader("data//correctString.txt");
        SortServiceImpl sortService = new SortServiceImpl();
        System.out.println(sortService.FirstElementSort(arrayList));
        Specification moreAvg = new MoreAverageSpecification(55);
        ArrayRepository repository = new ArrayRepository(arrayList);
//        System.out.println("поиск массивов по id: " + repository.query(id));
//        System.out.println();
//        System.out.println("поиск массивов сумма элементов которых больше заданного значения: " + repository.query(more));
//        System.out.println();
//        System.out.println("поиск массивов сумма элемнтов которых равна заданному значению: " + repository.query(equally));
//        System.out.println();
//        System.out.println("поиск массивов сумма элементов которых меньше заданного значения: " + repository.query(less));
    }
}