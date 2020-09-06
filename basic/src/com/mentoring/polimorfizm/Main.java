package com.mentoring.polimorfizm;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "unu");
        map.put(2, "doi");
        map.put(3, "trei");
        map.put(1, "trei");

        for (Map.Entry e: map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        
        Figura cerc = new Cerc(3D);
        Figura cerc1 = new Cerc(4D);

        Figura dreptunghi = new Dreptunghi(3D, 4D);

        Figura patrat = new Patrat(4D);

        Figura triunghiDreptunghiular = new TriunghiDreptunghiular(3D, 4D);

        List<Figura> figure = new ArrayList();
        System.out.println(figure.isEmpty());
        System.out.println(figure.add(cerc));
        System.out.println(figure.isEmpty());
        System.out.println(figure.contains(cerc));


        Set<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(3);
        numbers.add(6);
        numbers.add(2);
        numbers.add(5);
        numbers.add(1);
        numbers.add(0);
        numbers.add(0);
        numbers.add(-1);
        numbers.add(100);
        numbers.add(-1000);
        for (Integer i: numbers) {
            System.out.println(i);
        }


//        Figura[] figure = new Figura[]{cerc, cerc1, dreptunghi, patrat, triunghiDreptunghiular};

//        for (Figura f: figure) {
//            System.out.println("------------" + f.getType() + "-----------");
//            System.out.println(f.area());
//            System.out.println(f.perimetru());
//        }









    }
}
