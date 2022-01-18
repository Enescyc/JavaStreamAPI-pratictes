package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Maths {
    public static void main(String[] args) {
        try
        {
            List<String> strings = new ArrayList<>(List.of("Deneme","Hello","Java","Stream API","Enes"));
            List<Double> doubles = new ArrayList<>(List.of(155.05d,75.03d,34.05d,45.03d,55.98d,899.0d));
            double avarage = strings
                    .stream()
                    .mapToInt(String::length) // return intStream
                    .summaryStatistics()        //return intStream
                    .getAverage();             // return double avarage


            System.out.println("List'deki ortalama string uzunlukları : "+avarage);


            int sum = strings
                    .stream() // string uzunluklarını toplama
                    .mapToInt(String::length)
                    .sum();
            System.out.println("List'deki string uzunluk toplamları:" +sum);

            double count =strings
                    .stream()
                    .count();

            System.out.println("String Sayısı:"+count);


            double maxDouble = doubles.stream()
                    .max(Double::compareTo)
                    .get();
            System.out.println("Max Double:"+maxDouble);

            double minDouble = doubles.stream()
                    .min(Double::compareTo)
                    .get();
            System.out.println("Min Double:"+minDouble);

            double doublesSum = doubles.stream()  // list toplamları
                    .reduce((aDouble, aDouble2) -> aDouble+aDouble2) // reduce içerisindeki işlemde ne yaparsak o görevi görecektir.
                    .get();
            System.out.println("Liste Toplamı:"+doublesSum);




        }
        catch (Exception e){
            e.printStackTrace();
        }



    }



}
