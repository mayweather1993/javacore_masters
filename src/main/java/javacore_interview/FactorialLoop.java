package javacore_interview;

import java.util.Scanner;

public class FactorialLoop {
    public static void main(String[] args) {
        int n, tmp = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer:");
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            tmp = tmp * i;
        }
        System.out.println("FactorialRecursion of " + n + " :" + tmp);
    }
}
