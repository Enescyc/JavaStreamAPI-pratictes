package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        Student st1=new Student(181002054,"Enes","Şahin");
        Student st2=new Student(181002013,"Ahmet","Kalkan");
        Student st3=new Student(181002051,"Ayberk ","Ulaş");
        Student st4=new Student(181002087,"Mahmut Can","Şahin");
        Student st5=st1; // same reference its mean st5==st1 -> true
        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
         // Soyadı Şahin olan 2 adet öğrenci nesnesini filtreleyip ekrana bastıralım.

        list.stream()
                .filter(filter -> filter.getStudentSurname().equals("Şahin")) // String value eşitliği için equals methodu kullanılır.
                .forEach(results -> System.out.println(results.getStudentName())); // filter methodundan dönen soy ismi Şahin olan öğrenciler.

        list.stream()
                .filter(filter -> filter.getStudentNumber() >181002040) // Öğrenci numarası 181002040 'dan büyük olanlar.
                .forEach(values -> System.out.println("Numara 181002040 'dan büyük:"+values.getStudentNumber()));

        list = list.stream()
                .filter(s -> s.getStudentSurname().equalsIgnoreCase("Şahin"))
                .distinct()    // uniq list st1==st5 -> true but just take one of them
                .collect(Collectors.toList());
        list.stream().forEach(s-> System.out.println(s.getStudentName()));

    }
}
