package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        list.add(12L);
        list.add(22L);
        list.add(32L);
        list.add(402L);
        list.add(502L);
        list.add(602L);

        Iterator<Long> iterator = list.iterator(); //listIterator (add)
        while (iterator.hasNext()){
            Long next = iterator.next();
            if(next < 50){
                iterator.remove();
            }
            System.out.println(next);
        }
        list.forEach(System.out::println);
    }
}
