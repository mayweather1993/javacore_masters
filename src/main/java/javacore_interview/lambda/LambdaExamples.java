package javacore_interview.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExamples {
    private static void oldWay() {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                List<Integer> digits = Arrays.asList(3, 2, 2, 3, 4, 5, 66, 66, 77, 4, 1, 3, 9, 002);
                List<Integer> sqrt = new ArrayList<>();
                for (Integer digit : digits) {
                    sqrt.add(digit * digit);
                }
                List<Integer> result = new ArrayList<>(new LinkedHashSet<>(sqrt));
                sqrt.clear();
                result.addAll(sqrt);
                for (Integer a: result){
                    System.out.println(a);
                }
            }
        };
        run.run();
    }

    public static void printUniqueSqrt() {
        List<Integer> digits = Arrays.asList(3, 2, 2, 3, 4, 5, 66, 66, 77, 4, 1, 3, 9, 002);
        List<Integer> sqrt = digits.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        sqrt.forEach(value -> System.out.println(value));
    }

    public static void main(String[] args) {
        System.out.println("Java 8 result : ");
        printUniqueSqrt();

        System.out.println("And old result : ");
        oldWay();
    }
}