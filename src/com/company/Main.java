package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Hyundai");
        cars.add("Audi");

        cars.add(1, "Bugatti");
        System.out.println(cars.size());
        for (String car : cars) {
            System.out.println(car);
        }

        if (cars.contains("Honda")){
            System.out.println("It is Honda!!!");
        }

        /*cars.remove("Honda");
        cars.remove(2);
        System.out.println()*/;

        /*System.out.println(cars.get(1));
        cars.clear();
        System.out.println(cars.size());*/

        System.out.println("=".repeat(20));


        Set<String> stringSet = new HashSet<>(); //LinkedHashSet - will save the order
        stringSet.add("Lamborghini");
        stringSet.add("Lamborghini"); // won't be added
        stringSet.addAll(cars);
        stringSet.add("Maserati");
        for (String s : stringSet) {
            System.out.println(s);
        }

        List<Car> carList = new LinkedList<>();
        carList.add(new Car("Tesla", 200,"AP1234RE"));
        carList.add(new Car("Mazda", 260,"AP4567YO"));
        carList.add(new Car("BMW", 220,"AP8901AY"));

        Map<String, Car> map = new HashMap<>();
        for (Car car : carList) {
            map.put(car.getCarNumber(), car);
        }

        map.put("AE2345OA", new Car("Nissan", 170, "AE2345OA"));
        System.out.println(map.size());

        Car nissan = map.get("AE2345OA");
        System.out.println(nissan.getModel());

        Set<String> stringSet1 = map.keySet();
        Collection<Car> values = map.values();

        for (Car value : values) {
            System.out.println(value);
        }
        for (String s : stringSet1) {
            System.out.println(s);
        }

        Set<Map.Entry<String, Car>> entries = map.entrySet();
        for (Map.Entry<String, Car> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
