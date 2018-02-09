package javacore_interview;

import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        int n, worker;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer:");
        n = s.nextInt();
        FactorialRecursion obj = new FactorialRecursion();
        worker = obj.fact(n);
        System.out.println("FactorialRecursion of " + n + " : " + worker);
    }

    public int fact(int x) {
        if (x > 1) {
            return (x * fact(x - 1));
        }
        return 1;
    }
}