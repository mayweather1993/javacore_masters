package javacore_interview;

public class FibonacciLoop {
    public static void main(String[] args) {
        int n = 10;
        int fibonacciNumber = 0;
        int g = 1;
        for (int i = 1; i <= n; i++) {
            fibonacciNumber = fibonacciNumber + g;
            g = fibonacciNumber - g;
            System.out.println(i + " : " + fibonacciNumber);

        }
    }
}
