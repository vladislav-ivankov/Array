package by.ivankov.task3.main;


import by.ivankov.task3.creator.impl.ArrayRepositoryCreator;
import by.ivankov.task3.creator.impl.CustomArrayCreatorImpl;
import by.ivankov.task3.creator.impl.WarehouseCreatorImpl;
import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.exception.CustomException;
import by.ivankov.task3.observer.ArrayStatisticsObserver;
import by.ivankov.task3.observer.impl.ArrayStatisticsObserverImpl;
import by.ivankov.task3.reader.impl.ArrayReaderServiceImpl;
import by.ivankov.task3.repository.ArrayRepository;
import by.ivankov.task3.repository.spec.*;
import by.ivankov.task3.service.impl.SortingAlgorithmsServiceImpl;
import by.ivankov.task3.service.sort.impl.SortServiceImpl;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CustomException {
        SortingAlgorithmsServiceImpl service = new SortingAlgorithmsServiceImpl();
        ArrayRepositoryCreator repositoryCreator = new ArrayRepositoryCreator();
        CustomArrayCreatorImpl customArrayCreator = new CustomArrayCreatorImpl();
        ArrayStatisticsObserver observer = new ArrayStatisticsObserverImpl();
        WarehouseCreatorImpl warehouseCreator = new WarehouseCreatorImpl();

        ArrayReaderServiceImpl reader = new ArrayReaderServiceImpl();
        List<CustomArray> arrayList = reader.arrayListReader("data//defaultArray.txt");
        int[] array = reader.arrayReader("data//correctString.txt");
        List<int[]> array1 = Collections.singletonList(array);

        SortServiceImpl sortService = new SortServiceImpl();
        IdSpecification id = new IdSpecification(5);
        LessSumSpecification less = new LessSumSpecification(100);
        MoreSumSpecification more = new MoreSumSpecification(100);
        EquallySumSpecification equally = new EquallySumSpecification(329);
        MoreAverageSpecification moreAvg = new MoreAverageSpecification(25);
        EquallyQuantitySpecification equallyQuantity = new EquallyQuantitySpecification(5);
        LessMinSpecification lessMin = new LessMinSpecification(-42);

        ArrayRepository repository = new ArrayRepository(arrayList);
//        System.out.println(repositoryCreator.createFromListObject(arrayList));
//        System.out.println(repositoryCreator.createFromListArray(array1));

//        System.out.println(customArrayCreator.createCustomArray(array1));
//        System.out.println(customArrayCreator.createCustomArray(array));

        System.out.println(warehouseCreator.createWarehouseArray(array1));
        System.out.println(warehouseCreator.createWarehouseObject(arrayList));


        // check repository(true)
//        System.out.println(repository.add(array));
//        System.out.println(repository.update(3, array));
//        System.out.println(repository.delete(2));
        //check repository(false)
//        System.out.println(repository.update(9, array));
//        System.out.println(repository.delete(10));

        //check specification
//        System.out.println("поиск массивов по id: " + repository.query(id));
//        System.out.println();
        System.out.println("поиск массивов сумма элементов которых больше заданного значения: " + repository.query(more));
//        System.out.println();
//        System.out.println("поиск массивов сумма элемнтов которых равна заданному значению: " + repository.query(equally));
//        System.out.println();
//        System.out.println("поиск массивов сумма элементов которых меньше заданного значения: " + repository.query(less));
//        System.out.println("Поиск элкеннтов среднее значение элементов которых больше заданного значения: " +repository.query(moreAvg));
//        System.out.println("Поиск элементов количество которых равно заданному значению: " +repository.query(equallyQuantity));
//        System.out.println("Поиск элементов минимальное значение которых меньше заданного значения: " + repository.query(lessMin));
    }
}