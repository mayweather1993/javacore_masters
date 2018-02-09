package javacore_interview.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSortExample {

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

        List<Student> list = getStudents();
        System.out.println("Before Sort");
        for (LambdaSortExample.Student Student : list) {
            System.out.println(Student);
        }

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("After Sort");
        for (LambdaSortExample.Student Student : list) {
            System.out.println(Student);
        }

        List<Student> list2 = getStudents();

        System.out.println("Before Sort");
        list2.forEach(System.out::println);

        System.out.println("After Sort");
        list2.sort((Student o1, Student o2)->o1.getAge()-o2.getAge());
        list2.forEach(System.out::println);
    }

    private static List<Student> getStudents() {

        List<Student> result = new ArrayList<Student>();

        result.add(new Student("Ivan", 33));
        result.add(new Student("Anna", 20));
        result.add(new Student("Leonid", 15));
        result.add(new Student("Nazar", 55));

        return result;

    }

}
