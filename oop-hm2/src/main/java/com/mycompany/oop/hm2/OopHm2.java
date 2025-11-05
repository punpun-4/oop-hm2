

package com.mycompany.oop.hm2;

import java.util.Scanner;
public class OopHm2 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int[] oddNumbers = new int[10];  // max 10, some will remain 0
        int[] evenNumbers = new int[10]; // max 10, some will remain 0

        int oddCount = 0;
        int evenCount = 0;

        // Ask user for 10 numbers
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number ");
            numbers[i] = input.nextInt();
        }

        // Separate odd and even numbers
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers[evenCount] = numbers[i];
                evenCount++;
            } else {
                oddNumbers[oddCount] = numbers[i];
                oddCount++;
            }
        }

        // Print all arrays
        System.out.print("All numbers: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        System.out.print("Even numbers: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenNumbers[i] + " ");
        } 
    }
}
