package javacore_interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSpecialString {
    public static void main(String[] args) {

        List<String> lines = Arrays.asList("Microsoft", "Spring", "IBM", "Eclipse", "JetBrains", "Google");
        List<String> result = getFilterOutput(lines, "Microsoft");
        for (String temp : result) {
            System.out.println(temp);
        }

    }

    private static List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (!filter.equals(line)) { // save all except Microsoft
                result.add(line);
            }
        }
        return result;
    }
}