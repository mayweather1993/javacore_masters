package javacore_interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSpecialStringJava9 {
    public static void main(String[] args) {

        List<String> lines = Arrays.asList("Microsoft", "Spring", "IBM", "Eclipse", "JetBrains", "Google");

        List<String> result = lines.stream()                // convert list to stream
                .filter(line -> !"Microsoft".equals(line))  // save all except Microsoft
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        result.forEach(System.out::println);

    }
}