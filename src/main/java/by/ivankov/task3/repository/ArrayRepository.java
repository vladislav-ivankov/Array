package by.ivankov.task3.repository;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.repository.spec.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ArrayRepository {
    private List<CustomArray> arrays;

    public ArrayRepository(List<CustomArray> arrays) {
        this.arrays = arrays;
    }

    public List<CustomArray> getArrays() {
        return arrays;
    }

    public void setArrays(List<CustomArray> arrays) {
        this.arrays = arrays;
    }

    public List<CustomArray> idSearch(Specification specification){
        List<CustomArray> result = new ArrayList<>();
        for (CustomArray array : arrays) {
            if(specification.specify(array)){
                result.add(array);
            }
        }
        return result;
    }

    public List<CustomArray> valueSearch(Specification specification){
        List<CustomArray> result = new ArrayList<>();
        for(CustomArray array : arrays){
            if(specification.specify(array)){
                result.add(array);
            }
        }
        return result;
    }
    public List<CustomArray> update(int id){
        return null;
    }

    public List<CustomArray> delete(int id){
        return null;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ArrayRepository.class.getSimpleName() + "[", "]")
                .add("arrays=" + arrays)
                .toString();
    }
}
