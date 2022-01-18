package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sıralama {
    public static void main(String[] args) {

        Student st1 = new Student(181002054, "Enes", "Şahin");
        Student st2 = new Student(181002013, "Ahmet", "Kalkan");
        Student st3 = new Student(181002051, "Ayberk ", "Ulaş");
        Student st4 = new Student(181002087, "Mahmut Can", "Durak");
        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);

        System.out.println("Sırasız Liste");
        list.stream().forEach(num -> System.out.println(num.getStudentNumber()));
        System.out.println("Sıralı Liste");
        list.stream()
                .sorted((o1, o2) ->
                        o1.getStudentNumber() > o2.getStudentNumber() ? 1
                                : o1.getStudentNumber() < o2.getStudentNumber() ? -1
                                : 0)
                // Bu kullanımın yerine Integer.compare methodu kullanılarak yapılabilir. -> Integer.compare(o1.getStudentNumber(), o2.getStudentNumber())
                // Kendi oluşturmuş olduğum sınıf için comparator tanımı oluşturdum . Bu işlem sınıfın sıralanibilir olmasını sağlıyor.
                // sınıf düzeyinde yapılabilmesi için Comparator arayüzünü implemente etmemiz gerekir.
                .forEach(value -> System.out.println(value.getStudentNumber())); // sıralanmış listeyi ekrana bastırır.


        List<Student> result = list.stream()  // yukarıdaki ile aynı işlevi görüyor.
                .sorted(Comparator.comparing(Student::getStudentNumber)) // compare edilecek nesne field'i
                .collect(Collectors.toList());


        System.out.println("Result listesi");
        result.stream()
                .forEach(values -> System.out.println(values.getStudentNumber()));




//
    }
}
