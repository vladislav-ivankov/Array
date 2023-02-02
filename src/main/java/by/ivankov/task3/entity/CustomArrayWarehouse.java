package by.ivankov.task3.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;

public class CustomArrayWarehouse {
    private static final CustomArrayWarehouse instance = new CustomArrayWarehouse();
    Map<Integer, ArrayStatistics> content = new HashMap<>();

    public CustomArrayWarehouse() {
    }

    public static CustomArrayWarehouse getInstance() {
        return instance;
    }

    public ArrayStatistics put(Integer key, ArrayStatistics value){
        return content.put(key, value);
    }

    public ArrayStatistics remove(Object key){
        return content.remove(key);
    }

    public ArrayStatistics replace(Integer key, ArrayStatistics value){
        return content.replace(key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomArrayWarehouse that = (CustomArrayWarehouse) o;

        return Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return content != null ? content.hashCode() : 0;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ",  CustomArrayWarehouse.class.getSimpleName() + "[", "]")
                .add("content=" + content)
                .toString();
    }
}
