package by.ivankov.task3.repository;

import by.ivankov.task3.entity.CustomArray;
import by.ivankov.task3.repository.spec.Specification;

import java.sql.ClientInfoStatus;
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

    public List<CustomArray> query(Specification specification) {
        List<CustomArray> result = new ArrayList<>();
        for (CustomArray array : arrays) {
            if (specification.specify(array)) {
                result.add(array);
            }
        }
        return result;
    }

    public boolean add(CustomArray customArray) {
        return arrays.add(customArray);
    }

    public void update(int id, CustomArray customArray) {
        for (int i = 0; i < arrays.size(); i++){
            if (arrays.get(i).getArrayId() == id){
                arrays.remove(i);
                arrays.add(i, customArray);
                customArray.setArrayId(id);
            }
        }
    }

    public boolean delete(int id) {
        return arrays.removeIf(i -> i.getArrayId() == id);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ArrayRepository.class.getSimpleName() + "[", "]")
                .add("arrays=" + arrays)
                .toString();
    }
}
