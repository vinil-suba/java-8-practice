package java8.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java8Sorting {
    public static void main(String[] args) {

        List<String> names2 = new ArrayList<String>();
        names2.add("Mahesh ");
        names2.add("Suresh ");
        names2.add("Ramesh ");
        names2.add("Naresh ");
        names2.add("Kalpesh ");
        names2.forEach(System.out::println);
        Java8Sorting tester = new Java8Sorting();
        System.out.println("Sort using Java 8 syntax: ");

        tester.sortUsingJava8(names2);
        System.out.println(names2);
    }
    //sort using java 8
    private void sortUsingJava8(List<String> names) {
        names.sort(String::compareTo);
    }
}
