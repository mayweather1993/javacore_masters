package javacore_interview.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {


        System.out.println("Print countries in uppercase format : ");
        List<String> countries = Arrays.asList("ukraine", "finland", "england", "china");
        beforeJava8(countries);

        List<String> collect = countries.stream().
                map(String::toUpperCase).
                collect(Collectors.toList());

        System.out.println(collect + " result of Java 8 style.");

        System.out.println("Get 12 sort random value : ");
        Random random = new Random();          // i -> System.out.println(i)
        random.ints().limit(12).sorted().forEach(System.out::println);

        System.out.println("Count of empty elements : ");
        List<String> data = Arrays.asList("a", "$", "", "", "", "b", "c", "");
        long countOfEmptyString = data.parallelStream().filter(i -> i.isEmpty()).count();
        System.out.println(countOfEmptyString);

        System.out.println("Get Max() Min() and AVG from digits : ");
        List<Integer> digits = Arrays.asList(3, 2, 2, 3, 4, 5, 66, 66, 77, 4, 1, 3, 9, 002);
        IntSummaryStatistics statistics = digits.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Max is : " + statistics.getMax() + "\n" + "Min is : " + statistics.getMin() + "\n" + "Avg is : " + statistics.getAverage());
        System.out.println("Bonus count of digits is : " + statistics.getCount() + "\n" + "Sum is : " + statistics.getSum());

        System.out.println("Get all not null valuers from list : ");
        Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");

        List<String> result = language.filter(Objects::nonNull).collect(Collectors.toList());
        result.forEach(System.out::println);

    }

    private static void beforeJava8(List<String> countries) {
        //Before Java8
        List<String> alphaUpper = new ArrayList<>();
        for (String s : countries) {
            alphaUpper.add(s.toUpperCase());
        }

        System.out.println(countries + " before we call beforeJava8");
        System.out.println(alphaUpper + " after method end work");
    }

}
