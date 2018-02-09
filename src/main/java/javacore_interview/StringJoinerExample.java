package javacore_interview;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("Ivan");
        sb.append(",");
        sb.append("Rudolf");
        sb.append(",");
        sb.append("Anna");
        System.out.println(sb.toString());

        StringJoiner sj = new StringJoiner(",");
        sj.add("Ivan");
        sj.add("Rudolf");
        sj.add("Anna");
        System.out.println(sj.toString());


        StringJoiner sj2 = new StringJoiner("-", "I start work as Java developer since ", ". It was the awesome day!");
        sj2.add("2016");
        sj2.add("11");
        sj2.add("12");
        System.out.println(sj2.toString());


        System.out.println(String.join("-", "2016", "12", "31" ));

        List<String> list = Arrays.asList("javaSE", "javaEE", "Hibernate", "SpringBoot");
        String result = String.join(", ", list);
        System.out.println(result);
    }

}
