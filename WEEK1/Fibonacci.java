package Training.com;

import java.util.Scanner;

class FibonacciThread {
    public static void main (String[] args) {
        int userInput, fibonacciOutput;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a non-negative number:");
        userInput = scan.nextInt();
        fibonacciOutput= fib(userInput);
        System.out.println("The " + userInput+ "th Fibonacci number = " + fibonacciOutput+ "."); }

    public static int fib(int k) {
        if (k <= 2) {
            return 1;
        }
        else {
            return fib(k-1) + fib(k-2); }}}