package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> countryList = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada", "Japan", "Germany");


        Stream<String> stream = countryList.stream()
                .distinct()
                .map((e) -> e.toUpperCase())
                .sorted();
        List<String> lst = stream.collect(Collectors.toList());

        System.out.println(lst);




    }
}