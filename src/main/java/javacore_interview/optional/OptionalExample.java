package javacore_interview.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.age = age;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }


        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Student> listStudents = getStudents();

        listStudents.forEach(x -> Optional.
                ofNullable(x).
                ifPresent(System.out::println));

        listStudents.forEach(x -> System.out.println(Optional.
                ofNullable(x)));

        listStudents.forEach(x -> System.out.println(Optional.
                ofNullable(x).isPresent()));
    }

    private static List<Student> getStudents() {

        List<Student> result = new ArrayList<Student>();

        result.add(null);
        result.add(new Student("Ivan", 33));
        result.add(new Student("Anna", 20));
        result.add(null);
        result.add(new Student("Leonid", 15));
        result.add(new Student("Nazar", 55));
        result.add(null);
        return result;

    }
}

