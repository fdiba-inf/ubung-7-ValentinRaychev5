package exercise7;

import java.util.Scanner;

public class RecursivePrimePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printPrimes(n);
    }

    public static void printPrimes(int n) {
      
        if (n == 1) {
            System.out.print(n);
            return;
        }
        if (isPrime(n)) {
            System.out.println(n);
        }
        printPrimes(n - 1);
    }

    public static boolean isPrime(int n) {
        
        boolean primeNum = true;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                primeNum = false;
                break;
            }
        }
        return primeNum;
    }
}