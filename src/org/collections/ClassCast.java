package org.collections;


import java.util.ArrayList;
import java.util.List;

public class ClassCast {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(123);
        list.add(new String("ABC"));
        list.add(new Pigeon());
        for (Object object : list) {
            System.out.println(object);
            //System.out.println((String)object);

        }
        List <Integer> list2 = new ArrayList<>();
        list2.add(123);
        //list2.add("QWE");
        list2.forEach(System.out::println);
    }
}