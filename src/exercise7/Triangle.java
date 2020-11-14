package exercise7;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();
        for (int row = 1; row <= n; row++)  {
          printLine(1, row);
          System.out.println();
        }

        for (int row = n - 1; row > 0; row--)  {
          printLine(1, row);
          if  (row != 1)  {
            System.out.println();
          }
        }
    }

    public static void printLine(int start, int end) {
      for (int col = start; col <= end; col++)  {
        if  (col != end)  {
          System.out.print(col + " ");
        }
        else  {
          System.out.print(col);
        }
      }
    }
}
