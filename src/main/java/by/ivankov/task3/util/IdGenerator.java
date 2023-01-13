package by.ivankov.task3.util;

public class IdGenerator {
    private static int id;
    private IdGenerator(){
    }

    public static int arrayIdGenerator(){
        return ++id;
    }
}
