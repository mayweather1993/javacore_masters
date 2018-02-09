package javacore_interview.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
    //    { {1,2}, {3,4}, {5,6} } -> flatMap -> {1,2,3,4,5,6}

    //    { {'a','b'}, {'c','d'}, {'e','f'} } -> flatMap -> {'a','b','c','d','e','f'}

    public static void printString() {

        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        Stream<String[]> temp = Arrays.stream(data);

        Stream<String[]> stream = temp.filter(x -> "a".equals(x.toString()));

        stream.forEach(System.out::println);

    }

    public static void printStringFlatMap() {
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        Stream<String[]> temp = Arrays.stream(data);

        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));

        Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));

        stream.forEach(System.out::println);

    }

    public static void printStudentData() {
        class Student {
            private String name;
            private Set<String> books = new HashSet<>();

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Set<String> getBooks() {
                return books;
            }

            public void addBook(String book) {
                books.add(book);
            }
        }

        Student obj1 = new Student();
        obj1.setName("Zakhar");
        obj1.addBook("Java 8 in Action");
        obj1.addBook("Spring Boot in Action");
        obj1.addBook("Effective Java (2nd Edition)");

        Student obj2 = new Student();
        obj2.setName("Nazar");
        obj2.addBook("Learning Python, 5th Edition");
        obj2.addBook("Effective Java (2nd Edition)");

        List<Student> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);

        List<String> collect =
                list.stream()
                        .map(x -> x.getBooks())      //Stream<Set<String>>
                        .flatMap(x -> x.stream())   //Stream<String>
                        .distinct()
                        .collect(Collectors.toList());

        collect.forEach(x -> System.out.println(x));
    }


    public static void main(String[] args) {
        printString();
        printStringFlatMap();
        printStudentData();
    }
}
