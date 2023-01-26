package by.ivankov.task3.main;

import java.util.Locale;
import java.util.ResourceBundle;

public class PropertiesMain {
    public static void main(String[] args) {
        Locale localeBy = new Locale("BY");
        Locale localeRu = new Locale("RU");
        Locale locale = new Locale("CH");
        ResourceBundle resourceBundleBy = ResourceBundle.getBundle("languagedata", localeBy);
        ResourceBundle resourceBundleRu = ResourceBundle.getBundle("languagedata", localeRu);
        ResourceBundle resourceBundleCh = ResourceBundle.getBundle("languagedata", locale);
        System.out.println(resourceBundleBy.getString("sumbit1"));
        System.out.println(resourceBundleRu.getString("sumbit1"));
        System.out.println(resourceBundleCh.getString("sumbit1"));
    }
}
