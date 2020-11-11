package exercise7;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();
        printTop(1, n);


        for (int rows = n - 1; rows > 0; rows--)  {
          for (int count = 1; count <= rows; count++)  {
            System.out.print(count + " ");
          }
          if  (rows != 1)  {
              System.out.println();
            }
        }
    }

    public static void printTop(int start, int end) {
        String currentPrint = "";
        for (start = 1; start <= end; start++)  {
          currentPrint += (start + " ");
          System.out.print(currentPrint);
          System.out.println();
        }
    }
    public static void printBottom(int start, int end) {
        for (int i = end; i < start; i++)  {
          
        }
    }
}
