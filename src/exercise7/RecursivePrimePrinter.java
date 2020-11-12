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
      for (int i = n; i > 0; i--)  {
        if (isPrime(n) == true)  {
          System.out.println(n);
        }
      }
    }

    public static boolean isPrime(int n) {

        int i = 2;
        boolean prime = true;
        while(n > i) {
          if(n % i == 0)  {
            prime = false;
            break;
          }
          i++;
        }
        return prime;
    }
}
