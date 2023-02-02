package by.ivankov.task3.creator.impl;

import by.ivankov.task3.creator.CustomArrayCreator;
import by.ivankov.task3.creator.WarehouseCreator;
import by.ivankov.task3.entity.ArrayStatistics;
import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.entity.CustomArrayWarehouse;
import by.ivankov.task3.exception.CustomException;

import java.util.List;

public class WarehouseCreatorImpl implements WarehouseCreator {
    @Override
    public CustomArrayWarehouse createWarehouseObject(List<CustomArray> customArrays) throws CustomException {
        CustomArrayWarehouse warehouse = new CustomArrayWarehouse();
        try{
            for(CustomArray i : customArrays){
                ArrayStatistics statistics = new ArrayStatistics(i);
                warehouse.put(i.getArrayId(), statistics);
            }
        }catch (CustomException e){
            throw new CustomException(e);
        }
        return warehouse;
    }

    @Override
    public CustomArrayWarehouse createWarehouseArray(List<int[]> array) throws CustomException {
        CustomArrayCreator creator = new CustomArrayCreatorImpl();
        CustomArrayWarehouse warehouse = new CustomArrayWarehouse();
        List<CustomArray> arrayList = creator.createCustomArray(array);
            try {
                for(CustomArray i : arrayList) {
                    ArrayStatistics statistics = new ArrayStatistics(i);
                    warehouse.put(i.getArrayId(), statistics);
                }
            } catch (CustomException e) {
                throw new CustomException(e);
            }
        return warehouse;
    }
}
