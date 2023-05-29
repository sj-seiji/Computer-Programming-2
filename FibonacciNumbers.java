/**
 * Seiji Zapanta
 * CSCI 185: Computer Programming II
 * Wenjia Li
 * M9: Recursion Lab
 */

public class FibonacciNumbers {
    public static void main(String[] args) {
        System.out.println("First 20 Fibonacci Numbers: ");
        int n = 20;
        for(int i = 0; i < n; i++){
            System.out.println(fib(i) + " ");

        }
    }
    private static int fib(int n) {
        if(n == 0) { //F(0) = 0,
            return 0;
        }
        else if(n == 1) { //F(1) = 1
            return 1;
        } else { //F(n) = F(n-1) + F(n-2) for any n >=2
            return fib(n - 1) + fib(n - 2);
        }

    }
}

