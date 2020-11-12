package exercise7;

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        System.out.print("Search for number: ");
        int findNumber = input.nextInt();

        int numberOccurrences = 0;
        numberOccurrences = countNumberOccurrences(findNumber, numbers);
        System.out.println("Number occurrences: " + numberOccurrences);
    }

    public static int countNumberOccurrences(int number, int[] numbers) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++)  {
          
          if (numbers[i] == number) {
            counter++;
          }
        }
        return counter;
    }
}
